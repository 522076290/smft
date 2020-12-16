package com.smfst.xcw.controller;

import com.smfst.xcw.model.SqlBackup;
import com.smfst.xcw.service.BackupService;
import com.smfst.xcw.utils.ResultObjectModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("backup")
@Api(tags = "sql备份")
public class BackupController {

    @Autowired
    private BackupService backupService;
    // 获取备份记录
    @ApiOperation(value="获取备份记录", notes="获取备份记录")
    @GetMapping(value = "/getAll")
    public ResultObjectModel getBackup(){
        List<Map<String, String>> list = backupService.queryBackup();
        return ResultObjectModel.success("成功",list);
    }
    // 备份
    @ApiOperation(value="备份", notes="备份")
    @PostMapping(value = "/create")
    public ResultObjectModel backup(@Validated @RequestBody SqlBackup sqlBackup){
        return ResultObjectModel.success("成功",backupService.backup(sqlBackup.getTitle()));
    }
    // 还原
    @ApiOperation(value="还原", notes="还原")
    @PutMapping(value = "/restore")
    public ResultObjectModel restore(@Validated @RequestBody SqlBackup sqlBackup){
        return ResultObjectModel.success("成功",backupService.restore(sqlBackup.getTitle()));
    }
    // 删除备份记录
    @ApiOperation(value="删除备份记录", notes="删除备份记录")
    @DeleteMapping(value = "/delete")
    public ResultObjectModel delBackup(@Validated @RequestBody SqlBackup sqlBackup){
        return ResultObjectModel.success("成功",backupService.delBackup(sqlBackup.getTitle()));
    }
}

