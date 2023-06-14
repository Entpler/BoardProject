package com.spring.study.model;

import com.spring.study.common.PageInfo;
import com.spring.study.common.Pagination;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class BoardSearchDto extends Pagination {

    private String searchTitle;

    private String searchContent;

    public BoardSearchDto(PageInfo pi) {
        super(pi);
    }
}


