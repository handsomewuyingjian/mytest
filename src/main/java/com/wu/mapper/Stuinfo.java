package com.wu.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface Stuinfo {
    //插入用户信息
    int insertStu(Stuinfo stuinfo);
    //查询所有的用户信息
    List<Stuinfo> queryStu();
    //删除用户信息
    int deleteStuByID(int id);
    //修改用户信息
    int updateStu(Stuinfo stuinfo);
}
