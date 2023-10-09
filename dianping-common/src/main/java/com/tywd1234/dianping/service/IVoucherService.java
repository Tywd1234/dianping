package com.tywd1234.dianping.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tywd1234.dianping.dto.Result;
import com.tywd1234.dianping.entity.Voucher;

public interface IVoucherService extends IService<Voucher> {

    Result queryVoucherOfShop(Long shopId);

    void addSeckillVoucher(Voucher voucher);
}
