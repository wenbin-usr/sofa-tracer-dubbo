package edu.whpu.service;

import edu.whpu.entity.Goods;
import edu.whpu.mapper.GoodsMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DubboService
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public Goods getById(Long id) {
        return goodsMapper.selectById(id);
    }

    @Override
    public Boolean saveGoods(Goods goods) {
        return goodsMapper.insert(goods) > 0;
    }

    @Override
    public List<Goods> getList() {
        return goodsMapper.selectList(null);
    }
}
