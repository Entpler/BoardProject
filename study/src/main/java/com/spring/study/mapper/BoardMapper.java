package com.spring.study.mapper;

import com.spring.study.model.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardVo> boardList();

}
