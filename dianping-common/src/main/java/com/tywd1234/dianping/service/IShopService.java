package com.tywd1234.dianping.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tywd1234.dianping.dto.Result;
import com.tywd1234.dianping.entity.Shop;

public interface IShopService extends IService<Shop> {

    Result queryById(Long id);

    Result updateShop(Shop shop);

    Result queryShopByType(Integer typeId, Integer current, Double x, Double y);
}
