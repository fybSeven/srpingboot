package com.lagou.article.po;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @AUTHOR: yb.feng
 * @DATE: 2020/4/26 21:42
 * @DESC:
 */
@Data
@ToString
public class ArticlePO {

    private Integer id;

    private String title;

    private String content;

    private Date created;

    private Date modified;

    private String categories;

    private String tags;

    private Integer allowComment;

    private String thumbnail;

    private String createAt;
}
