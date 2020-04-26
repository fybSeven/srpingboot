package com.lagou.article.service;

import com.lagou.article.po.ArticlePO;

import java.util.List;

/**
 * @AUTHOR: yb.feng
 * @DATE: 2020/4/26 21:59
 * @DESC:
 */
public interface ArticleService {

    List<ArticlePO> findAll();
}