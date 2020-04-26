package com.lagou.article.mapper;

import com.lagou.article.po.ArticlePO;

import java.util.List;

/**
 * @AUTHOR: yb.feng
 * @DATE: 2020/4/26 21:38
 * @DESC:
 */
public interface ArticleMapper {

    /**
     * 查询全部
     * @return
     */
    List<ArticlePO> findAll();
}
