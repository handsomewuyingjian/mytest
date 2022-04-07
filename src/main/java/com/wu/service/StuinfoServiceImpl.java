package com.wu.service;

import com.wu.mapper.Stuinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuinfoServiceImpl implements StuinfoService{
    @Autowired
    private Stuinfo stuinfo;
    @Override
    public int insertStu(Stuinfo stuinfo) {
        int i = stuinfo.insertStu(stuinfo);
        return i;
    }

    @Override
    public List<Stuinfo> queryStu() {
        List<Stuinfo> stuinfos = stuinfo.queryStu();
        return stuinfos;
    }

    @Override
    public int deleteStuByID(int id) {
        int i = stuinfo.deleteStuByID(id);
        return i;
    }

    @Override
    public int updateStu(Stuinfo stuinfo) {
        int i = stuinfo.updateStu(stuinfo);
        return i;
    }
}
