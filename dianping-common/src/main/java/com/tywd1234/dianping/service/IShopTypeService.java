package com.tywd1234.dianping.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tywd1234.dianping.dto.Result;
import com.tywd1234.dianping.entity.ShopType;

public interface IShopTypeService extends IService<ShopType> {

    Result queryTypeList();
}
