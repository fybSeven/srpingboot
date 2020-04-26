package com.lagou.article.service.impl;

import com.lagou.article.mapper.ArticleMapper;
import com.lagou.article.po.ArticlePO;
import com.lagou.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @AUTHOR: yb.feng
 * @DATE: 2020/4/26 21:59
 * @DESC:
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<ArticlePO> findAll() {
        return articleMapper.findAll();
    }
}
