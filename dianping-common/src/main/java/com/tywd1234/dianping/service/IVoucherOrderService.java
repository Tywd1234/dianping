package com.tywd1234.dianping.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tywd1234.dianping.dto.Result;
import com.tywd1234.dianping.entity.VoucherOrder;

public interface IVoucherOrderService extends IService<VoucherOrder> {

    Result seckillVoucher(Long voucherId);

    void createVoucherOrder(VoucherOrder voucherOrder);
}
