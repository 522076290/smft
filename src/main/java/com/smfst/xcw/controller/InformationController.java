package com.smfst.xcw.controller;

import com.smfst.xcw.model.Information;
import com.smfst.xcw.service.InformationService;
import com.smfst.xcw.util.UploadUtils;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @ClassName InformationController
 * @Author lan
 * @Date 2020/11/7 16:56
 **/
@RestController
@RequestMapping("Information")
@Api(tags = "资讯中心接口控制器")
public class InformationController {
    @Autowired
    private InformationService informationService;

    /**
     * 查询全部资讯中心
     * @return
     */
    @ApiOperation(value="查询全部资讯中心", notes="查询全部资讯中心")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public ResultObjectModel selectList() {
        List<Information> list = informationService.selectInformationList();
        return ResultObjectModel.success("成功",list);
    }


    /**
     * 通过id查询资讯中心
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    @ApiOperation(value="通过id查询资讯中心", notes="通过id查询资讯中心")
    public ResultObjectModel selectInformationById(@RequestBody Information information) throws Exception {
        List<Information> lists = new ArrayList<>();
        lists.add(informationService.selectInformationById(information.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 通过指定参数查询资讯中心
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ApiOperation(value="通过指定参数查询资讯中心", notes="通过指定参数查询资讯中心")
    public ResultObjectModel selectInformationByPartment(@RequestBody Information information) throws Exception {
        List<Information> lists = informationService.selectInformationByParameter(information);
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 新增资讯中心
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ApiOperation(value="新增资讯中心", notes="新增资讯中心")
    public ResultObjectModel createUserInformation(@RequestParam(value = "informationName",required = false) String informationName,
                                                   @RequestParam(value = "time",required = false) String time,
                                                   @RequestParam(value = "words",required = false) String words,
                                                   @RequestParam(value = "status",required = false) String status,
                                                   @RequestParam(value = "icon",required = false) MultipartFile iconFile,
                                                   @RequestParam(value = "video",required = false) MultipartFile videoFile) throws Exception {
        Information information = new Information();

//        图片
        if (iconFile==null){
            information.setIcon(null);
        } else if (iconFile.isEmpty()){
            information.setIcon(null);
        } else {
            String iconUUID = UUID.randomUUID().toString().trim();
            String iconName = iconFile.getOriginalFilename();
            int index = iconName.indexOf(".");
            iconName=iconUUID + iconName.substring(index);
            File iconNewFile;
            File fileDir = UploadUtils.getImgDirFile();
            try {
                System.out.println(fileDir + File.separator + iconName);
//                iconNewFile = new File(fileDir.getAbsolutePath()+File.separator + iconName);
                iconNewFile = new File(fileDir +File.separator + iconName);
                System.out.println(iconNewFile.getPath());
                iconFile.transferTo(iconNewFile);
//                information.setIcon("/static/images/"+iconName);
                information.setIcon("/dataInterface/OTA/images/"+iconName);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
//        视频
        if (videoFile==null){
            information.setVideo(null);
        }else if (videoFile.isEmpty()){
            information.setVideo(null);
        }else {
            String videoUUID = UUID.randomUUID().toString().trim();
            String videoName = videoFile.getOriginalFilename();
            int index = videoName.indexOf(".");
            videoName = videoUUID + videoName.substring(index);
            File videoNewFile;
            File fileDir = UploadUtils.getVideoDirFile();
            try {
                System.out.println(fileDir + File.separator + videoName);
//                videoNewFile = new File(fileDir.getAbsolutePath()+File.separator + videoName);
                videoNewFile = new File(fileDir + File.separator + videoName);
                System.out.println(videoNewFile.getPath());
                videoFile.transferTo(videoNewFile);
                information.setVideo("/dataInterface/OTA/video/"+videoName);
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        information.setInformationName(informationName);
        if (status!=null){
            information.setStatus(Long.valueOf(status));
        }
        if (time!=null){
            information.setTime(Long.valueOf(time));
        }

//        information.setIcon((String) map.get("icon"));
//        information.setVideo((String) map.get("video"));
        information.setWords(words);
        informationService.createInformation(information);
        List<Information> lists = new ArrayList<>();
        lists.add(informationService.selectInformationById(information.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改资讯中心
     * @param
     * @return
     * @throws Exception
     */

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value="修改资讯中心", notes="修改资讯中心")
    public ResultObjectModel updateInformation(@RequestParam(value = "informationName",required = false) String informationName,
                                               @RequestParam(value = "time",required = false) String time,
                                               @RequestParam(value = "words",required = false) String words,
                                               @RequestParam(value = "status",required = false) String status,
                                               @RequestParam(value = "icon",required = false) MultipartFile iconFile,
                                               @RequestParam(value = "video",required = false) MultipartFile videoFile,
                                               @RequestParam("id") String id) throws Exception {
        Information information = new Information();
        if (id==null){
            return ResultObjectModel.fail("失败","id不能为空");
        } else {
            information.setId(Long.valueOf(id));
        }
        information.setInformationName(informationName);
        if (status!=null){
            information.setStatus(Long.valueOf(status));
        }
        if (time!=null){
            information.setTime(Long.valueOf(time));
        }
        information.setWords(words);

        //        图片
        if (iconFile==null){
            information.setIcon(null);
        } else if (iconFile.isEmpty()){
            information.setIcon(null);
        } else {
            String iconUUID = UUID.randomUUID().toString().trim();
            String iconName = iconFile.getOriginalFilename();
            int index = iconName.indexOf(".");
            iconName=iconUUID + iconName.substring(index);
            File iconNewFile;
            File fileDir = UploadUtils.getImgDirFile();
            try {
                System.out.println(fileDir + File.separator + iconName);
//                iconNewFile = new File(fileDir.getAbsolutePath()+File.separator + iconName);
                iconNewFile = new File(fileDir +File.separator + iconName);
                System.out.println(iconNewFile.getPath());
                iconFile.transferTo(iconNewFile);
//                information.setIcon("/static/images/"+iconName);
                information.setIcon("/dataInterface/OTA/images/"+iconName);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
//        视频
        if (videoFile==null){
            information.setVideo(null);
        }else if (videoFile.isEmpty()){
            information.setVideo(null);
        }else {
            String videoUUID = UUID.randomUUID().toString().trim();
            String videoName = videoFile.getOriginalFilename();
            int index = videoName.indexOf(".");
            videoName = videoUUID + videoName.substring(index);
            File videoNewFile;
            File fileDir = UploadUtils.getVideoDirFile();
            try {
                System.out.println(fileDir + File.separator + videoName);
//                videoNewFile = new File(fileDir.getAbsolutePath()+File.separator + videoName);
                videoNewFile = new File(fileDir + File.separator + videoName);
                System.out.println(videoNewFile.getPath());
                videoFile.transferTo(videoNewFile);
                information.setVideo("/dataInterface/OTA/video/"+videoName);
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        informationService.updateInformation(information);
        List<Information> lists = new ArrayList<>();
        lists.add( informationService.selectInformationById(information.getId()));
        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改资讯中心名称
     * @param information
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateInformationName",method = RequestMethod.POST)
    @ApiOperation(value="修改资讯中心名称", notes="修改资讯中心名称")
    public ResultObjectModel updateInformationInformationName(@RequestBody Information information) throws Exception {

        //获取所需参数
        Information information1 = new Information();
        information1.setId(information.getId());
        information1.setInformationName(information.getInformationName());

        //更新
        informationService.updateInformation(information1);
        //添加到结果集
        List<Information> lists = new ArrayList<>();
        lists.add(informationService.selectInformationById(information1.getId()));

        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改资讯中心时间
     * @param information
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateTime",method = RequestMethod.POST)
    @ApiOperation(value="修改资讯中心时间", notes="修改资讯中心时间")
    public ResultObjectModel updateInformationTime(@RequestBody Information information) throws Exception {

        //获取所需参数
        Information information1 = new Information();
        information1.setId(information.getId());
        information1.setTime(information.getTime());
        //更新
        informationService.updateInformation(information1);
        //添加到结果集
        List<Information> lists = new ArrayList<>();
        lists.add(informationService.selectInformationById(information1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改资讯中心文字
     * @param information
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateWords",method = RequestMethod.POST)
    @ApiOperation(value="修改资讯中心文字", notes="修改资讯中心文字")
    public ResultObjectModel updateInformationWords(@RequestBody Information information) throws Exception {

        //获取所需参数
        Information information1 = new Information();
        information1.setId(information.getId());
        information1.setWords(information.getWords());

        //更新
        informationService.updateInformation(information1);
        //添加到结果集
        List<Information> lists = new ArrayList<>();
        lists.add(informationService.selectInformationById(information1.getId()));

        return ResultObjectModel.success("成功",lists);
    }


    /**
     * 修改资讯中心视频
     * @param
     * @return
     * @throws Exception
     */

    @RequestMapping(value = "/updateVideo",method = RequestMethod.POST)
    @ApiOperation(value="修改资讯中心视频", notes="修改资讯中心视频")
    public ResultObjectModel updateInformationVideo(@RequestParam("id") String id,
                                                    @RequestParam("video") MultipartFile videoFile) throws Exception {

        //获取所需参数
        Information information = new Information();
        information.setId(information.getId());
        //        视频
        if (videoFile==null){
            information.setVideo(null);
        }else if (videoFile.isEmpty()){
            information.setVideo(null);
        }else {
            String videoUUID = UUID.randomUUID().toString().trim();
            String videoName = videoFile.getOriginalFilename();
            int index = videoName.indexOf(".");
            videoName = videoUUID + videoName.substring(index);
            File videoNewFile;
            File fileDir = UploadUtils.getVideoDirFile();
            try {
                System.out.println(fileDir + File.separator + videoName);
//                videoNewFile = new File(fileDir.getAbsolutePath()+File.separator + videoName);
                videoNewFile = new File(fileDir + File.separator + videoName);
                System.out.println(videoNewFile.getPath());
                videoFile.transferTo(videoNewFile);
                information.setVideo("/dataInterface/OTA/video/"+videoName);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        //更新
        informationService.updateInformation(information);
        //添加到结果集
        List<Information> lists = new ArrayList<>();
        lists.add(informationService.selectInformationById(information.getId()));
        return ResultObjectModel.success("成功",lists);
    }
    /**
     * 修改资讯中心图片
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/updateIcon",method = RequestMethod.POST)
    @ApiOperation(value="修改资讯中心图片", notes="修改资讯中心图片")
    public ResultObjectModel updateInformationIcon(@RequestParam("id") String id,
    @RequestParam("icon") MultipartFile iconFile) throws Exception {

        //获取所需参数
        Information information = new Information();
        information.setId(Long.valueOf(id));
        //        图片
        if (iconFile==null){
            information.setIcon(null);
        } else if (iconFile.isEmpty()){
            information.setIcon(null);
        } else {
            String iconUUID = UUID.randomUUID().toString().trim();
            String iconName = iconFile.getOriginalFilename();
            int index = iconName.indexOf(".");
            iconName=iconUUID + iconName.substring(index);
            File iconNewFile;
            File fileDir = UploadUtils.getImgDirFile();
            try {
                System.out.println(fileDir + File.separator + iconName);
//                iconNewFile = new File(fileDir.getAbsolutePath()+File.separator + iconName);
                iconNewFile = new File(fileDir +File.separator + iconName);
                System.out.println(iconNewFile.getPath());
                iconFile.transferTo(iconNewFile);
//                information.setIcon("/static/images/"+iconName);
                information.setIcon("/dataInterface/OTA/images/"+iconName);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        //更新
        informationService.updateInformation(information);
        //添加到结果集
        List<Information> lists = new ArrayList<>();
        lists.add(informationService.selectInformationById(information.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 修改资讯中心类型
     * @param information
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/updateStatus",method = RequestMethod.POST)
    @ApiOperation(value="修改资讯中心类型", notes="修改资讯中心类型")
    public ResultObjectModel updateInformationStatus(@RequestBody Information information) throws Exception {

        //获取所需参数
        Information information1 = new Information();
        information1.setId(information.getId());
        information1.setStatus(information.getStatus());
        //更新
        informationService.updateInformation(information1);
        //添加到结果集
        List<Information> lists = new ArrayList<>();
        lists.add(informationService.selectInformationById(information1.getId()));
        return ResultObjectModel.success("成功",lists);
    }

    /**
     * 删除资讯中心
     * @param information
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ApiOperation(value="删除资讯中心", notes="删除资讯中心")
    public ResultObjectModel deletById(@RequestBody Information information) throws Exception {
        List<Information> lists = new ArrayList<>();
        lists.add( informationService.selectInformationById(information.getId()));
        informationService.deletInformation(information);
        return ResultObjectModel.success("成功",lists);
    }
}
