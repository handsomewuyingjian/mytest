package com.wu.service;

import com.wu.mapper.Stuinfo;

import java.util.List;

public interface StuinfoService {
    //插入用户信息
    int insertStu(Stuinfo stuinfo);
    //查询所有的用户信息
    List<Stuinfo> queryStu();
    //删除用户信息
    int deleteStuByID(int id);
    //修改用户信息
    int updateStu(Stuinfo stuinfo);
}
