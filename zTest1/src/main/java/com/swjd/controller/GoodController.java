package com.swjd.controller;

import com.swjd.bean.Good;
import com.swjd.service.good.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GoodController {
    @Autowired
    private GoodsService goodsService;
    @RequestMapping("all")
    public ModelAndView all(){
        ModelAndView modelAndView = new ModelAndView("good.jsp");
        List<Good> goods = goodsService.selectAll();
        modelAndView.addObject("list",goods);
        return modelAndView;
    }
    @RequestMapping("del")
    public ModelAndView del(Integer id){

        return all();
    }
}
