package edu.whpu.controller;

import edu.whpu.entity.Goods;
import edu.whpu.service.GoodsService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @DubboReference
    private GoodsService goodsService;

    @GetMapping("/goodsList")
    public List<Goods> getGoodsList() {
        return goodsService.getList();
    }

    @PostMapping("/saveGoods")
    public Boolean saveGoods(@RequestBody Goods goods) {
        return goodsService.saveGoods(goods);
    }

}
