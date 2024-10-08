package com.mszlu.rpc.consumer.controller;

import com.mszlu.rpc.annotation.MsReference;
//import com.mszlu.rpc.consumer.rpc.GoodsHttpRpc;

import com.mszlu.rpc.provider.service.GoodsService;
import com.mszlu.rpc.provider.service.modal.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("consumer")
public class ConsumerController {
//    @Resource
//    private GoodsHttpRpc goodsHttpRpc;
//
//    @GetMapping ("/find/{id}")
//    public Goods find(@PathVariable Long id){
//        return goodsHttpRpc.findGoods(id);
//    }
    //host="localhost",port=13567,

    @MsReference(version = "1.0")
    private GoodsService goodsService;

    @GetMapping ("/find/{id}")
    public Goods find(@PathVariable Long id){
        return goodsService.findGoods(id);
    }
}
