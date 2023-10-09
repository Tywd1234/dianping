package com.tywd1234.dianping.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tywd1234.dianping.mapper.UserInfoMapper;
import com.tywd1234.dianping.service.IUserInfoService;
import com.tywd1234.dianping.entity.UserInfo;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
