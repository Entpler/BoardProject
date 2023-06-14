package com.spring.study.common;

import io.micrometer.common.util.StringUtils;
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

    private int endPage; // 해당 페이지에 보여질 페이징바의 끝 수 (startPage,pageLimit,maxPage이용해서 구함)


    private String url; //페이지네이션 path

    private String urlParams;


    private int startRow = 0;

    private int endRow = currentPage * boardLimit;

    public PageInfo() {

    }

    public void calcPageInfo(int listCount, int currentPage, int pageLimit, int boardLimit) {

        int maxPage = (int) Math.ceil((double) listCount / boardLimit); //가장 마지막 페이지가 몇 번 페이지인지 (총 페이지 수)
        int startPage = (currentPage - 1) / pageLimit * pageLimit + 1;
        int endPage = startPage + pageLimit - 1; //페이지 하단에 보여질 페이징바의 끝 수

        if (endPage > maxPage) {
            endPage = maxPage;
        }
        setMaxPage(maxPage);
        setStartPage(startPage);
        setEndPage(endPage);
    }
    public void setUrlAndParams(String url, String urlParams) {
        this.url = url;
        if (StringUtils.isNotBlank(urlParams)) {
            this.urlParams = "?" + urlParams.replaceAll("([&])?page=[0-9]*", "") + "&page";
        } else {
            this.urlParams = "?page";
        }
    }
        public void setListCount(int listCount){

        }
    }

