package com.tywd1234.dianping.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tywd1234.dianping.dto.Result;
import com.tywd1234.dianping.entity.Blog;

public interface IBlogService extends IService<Blog> {
    Result queryBlogById(Long id);

    Result likeBlog(Long id);

    Result queryBlogLikes(Long id);

    Result saveBlog(Blog blog);

    Result queryBlogOfFollow(Long max, Integer offset);
}
