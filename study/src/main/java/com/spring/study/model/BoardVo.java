package com.spring.study.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class BoardVo {


    private int startRow; // 페이지 처리를 위한 시작 행
    private int endRow; // 페이지 처리를 위한 끝 행

    private Integer boardNo;

    private Integer replyNo;

    private String title;

    private String content;

    private String writer;

    private String regDate;

    private Integer viewNo;
    private List<ReplyVo> replyList;

    public void setReplyList(List<ReplyVo> replyList) {
        this.replyList = replyList;
    }
    public BoardVo() {

    }
}
