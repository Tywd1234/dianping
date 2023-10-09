package com.tywd1234.dianping.service.impl;

import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tywd1234.dianping.dto.Result;
import com.tywd1234.dianping.entity.ShopType;
import com.tywd1234.dianping.mapper.ShopTypeMapper;
import com.tywd1234.dianping.service.IShopTypeService;
import com.tywd1234.dianping.utils.CacheClient;
import com.tywd1234.dianping.utils.RedisConstants;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Service
public class ShopTypeServiceImpl extends ServiceImpl<ShopTypeMapper, ShopType> implements IShopTypeService {
    @Resource
    CacheClient cacheClient;

    @Override
    public Result queryTypeList() {
        return cacheClient.cacheQuery(
                RedisConstants.CACHE_SHOP_TYPE_LIST_KEY,
                () -> query().orderByAsc("sort").list(),
                JSONUtil::parseArray,
                "店铺类型不存在！",
                30,
                TimeUnit.MINUTES);
    }
}
