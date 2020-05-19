package com.swjd.service.good;

import com.swjd.bean.Good;

import java.util.List;

public interface GoodsService {
    List<Good> selectAll();
    int del(Integer id);
}
