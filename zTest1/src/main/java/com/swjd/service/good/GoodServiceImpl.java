package com.swjd.service.good;

import com.swjd.bean.Good;
import com.swjd.dao.GoodsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodServiceImpl implements GoodsService{
    @Autowired
    private GoodsDao goodsDao;
    @Override
    public List<Good> selectAll() {
        return goodsDao.selectAll();
    }

    @Override
    public int del(Integer id) {
        return goodsDao.del(id);
    }
}
