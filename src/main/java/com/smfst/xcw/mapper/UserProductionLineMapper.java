package com.smfst.xcw.mapper;/**
 * @Author lan
 * @Date 2020/10/26
 */

import com.smfst.xcw.model.UserProductionLine;

import java.util.List;

/**
 *@ClassName UserProductionLineMapper
 *@Author lan
 *@Date 2020/10/26 15:22
 **/
public interface UserProductionLineMapper {

    /**
     * 查询全部学生生产线
     * @return
     */
    List<UserProductionLine> selectUserProductionLineList();

    /**
     * 通过id查询学生生产线
     * @param id
     * @return
     */
    UserProductionLine selectUserProductionLineById(Integer id);

    /**
     * 通过position查询学生生产线
     * @param position
     * @Date 2020-11-21新增
     * @name tyx
     */
    UserProductionLine selectUserProductionLineByPosition(Integer position);

    /**
     * 通过lineID查询学生生产线
     * @param lineId
     * @Date 2020-11-25新增
     * @name tyx
     */
    UserProductionLine selectUserProductionLineByLineId(Integer lineId);
    /**
     * 通过指定参数查询学生生产线
     * @param userProductionLine
     * @return
     */
    List<UserProductionLine> selectUserProductionLineByParameter(UserProductionLine userProductionLine);

    /**
     * 新增学生生产线
     * @param userProductionLine
     * @return
     */
    void createUserProductionLine(UserProductionLine userProductionLine);


    /**
     * 更新学生生产线
     * @param userProductionLine
     * @return
     */
    void updateUserProductionLine (UserProductionLine userProductionLine);


    /**
     * 删除学生生产线
     * @param userProductionLine
     * @return
     */
    void deletUserProductionLine (UserProductionLine userProductionLine);
}
