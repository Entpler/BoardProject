package com.spring.study.service;

import com.spring.study.mapper.BoardMapper;
import com.spring.study.model.BoardVo;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Log4j
@AllArgsConstructor
@Service
public class BoardService {
    private final BoardMapper boardMapper;
    public List<BoardVo> boardList() {
      return boardMapper.boardList();
    }
}
