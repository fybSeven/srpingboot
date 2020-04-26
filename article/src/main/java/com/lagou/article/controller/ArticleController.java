package com.lagou.article.controller;

import com.lagou.article.po.ArticlePO;
import com.lagou.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @AUTHOR: yb.feng
 * @DATE: 2020/4/26 22:01
 * @DESC:
 */
@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/index")
    public String findAll(Model model){
        List<ArticlePO> articlePOs = articleService.findAll();
        articlePOs.forEach(a -> {
            a.setCreateAt(format(a.getCreated()));
        });
        model.addAttribute("articlePOs", articlePOs);
        return "client/index";
    }

    private String format(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd");
        return simpleDateFormat.format(date);
    }
}
