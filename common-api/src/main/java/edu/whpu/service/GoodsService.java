package edu.whpu.service;

import edu.whpu.entity.Goods;
import edu.whpu.entity.Product;

import java.util.List;

/**
 * @author bin_wen
 * @date 2023/4/9 12:36
 */
public interface GoodsService {

    Goods getById(Long id);

    Boolean saveGoods(Goods goods);

    List<Goods> getList();

}
