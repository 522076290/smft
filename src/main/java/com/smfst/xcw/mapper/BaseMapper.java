package com.smfst.xcw.mapper;


import java.util.List;

/**
 * @ClassName BaseMapper
 * @Author lan
 * @Date 2020/11/5 9:57
 * 通用泛型Mapper基类
 **/
public interface BaseMapper<T> {

    /**
     * 返回持久化对象
     * @param id
     * @return 找到则返回，否则返回空
     */
    T selectById(Long id);

    /**
     * 删除指定id的持久化对象
     * @param id
     */
    void deleteById(Long id);

    /**
     * 对对象进行持久化操作，如果成功则返回持久化后的ID
     * 失败则返回null
     * @param obj
     * @return
     */
    void insert(T obj);


    /**
     * 修改指定的持久化对象
     * @param id
     * @param obj
     */
    void update(T obj);



    /**
     * 返回所有持久化对象
     * @return
     */
    List<T> selectList();

    /**
     * 根据参数返回所有持久化对象
     * @param obj
     * @return
     */
    List<T> selectByPartment(T obj);


    /**
     * 分页查询用户
     * @return
     */
    List<T> selectPage();
}
