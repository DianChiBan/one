package com.swjd.dao;

import com.swjd.bean.Good;

import java.util.List;

public interface GoodsDao {
    List<Good> selectAll();

    int del(Integer id);
}
