package com.spring.study.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class CommentVo {

    private Integer commentNo;

    private Integer boardNo;

    private String writer;

    private String regDate;

    private String commentContent;




}
