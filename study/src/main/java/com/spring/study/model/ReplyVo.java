package com.spring.study.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class ReplyVo {

    private Integer replyNo;

    private Integer boardNo;

    private String replyTitle;

    private String replyContent;

    private String writer;

    private String regDate;


    public ReplyVo() {

    }
}
