package com.spring.study.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class PageInfo {


    private int listCount; //총 게시글 갯수
    private int currentPage; //현재페이지(즉, 사용자가 요청한 페이지 수)

    private int pageLimit; // 하단에 보여질 페이징바의 페이징 목록 최대 갯수

    private int boardLimit; //힌 페이지에 보여질 게시글의 최대 갯수

    private int maxPage; //가장 마지막 페이지의 수 (listCount, boardList 이용해서 구함)

    private int startPage; //해당 페이지에 보여질 페이징바의 시작 수 (pageLimit, currentPage 이용해서 구함)

    private int endPage ; // 해당 페이지에 보여질 페이징바의 끝 수 (startPage,pageLimit,maxPage이용해서 구함)



}
