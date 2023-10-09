package com.tywd1234.dianping.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tywd1234.dianping.entity.BlogComments;
import com.tywd1234.dianping.mapper.BlogCommentsMapper;
import com.tywd1234.dianping.service.IBlogCommentsService;
import org.springframework.stereotype.Service;

@Service
public class BlogCommentsServiceImpl extends ServiceImpl<BlogCommentsMapper, BlogComments> implements IBlogCommentsService {

}
