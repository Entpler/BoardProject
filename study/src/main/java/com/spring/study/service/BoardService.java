package com.spring.study.service;

import com.spring.study.common.PageInfo;
import com.spring.study.mapper.BoardMapper;
import com.spring.study.model.BoardVo;
import com.spring.study.model.CommentVo;
import com.spring.study.model.ReplyVo;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Log4j
@AllArgsConstructor
@Service
public class BoardService {
    private final BoardMapper boardMapper;
    public List<BoardVo> boardList(BoardVo boardVo) {
      return boardMapper.boardList(boardVo);
    }

    public BoardVo selectQnaList(BoardVo boardVo) {
      return boardMapper.selectQnaList(boardVo);

    }

    public int insertQna(BoardVo boardVo) {
        return boardMapper.insertQna(boardVo);

    }
    public int insertReply(ReplyVo replyVo) {
        return boardMapper.insertReply(replyVo);
    }

    public List<ReplyVo> getReplyList(ReplyVo replyVo) {
       return boardMapper.getReplyList(replyVo);
    }

    public int insertComment(CommentVo commentVo) {
        return boardMapper.insertComment(commentVo);
    }

    public  List<CommentVo> getCommentList(int boardNo) {
        return boardMapper.getCommentList(boardNo);
    }

    public int selectListCount(){
        return boardMapper.selectListCount();
    }
}
