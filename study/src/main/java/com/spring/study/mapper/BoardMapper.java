package com.spring.study.mapper;

import com.spring.study.model.BoardVo;
import com.spring.study.model.CommentVo;
import com.spring.study.model.ReplyVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardVo> boardList();

    BoardVo selectQnaList(BoardVo boardVo);

    int insertQna(BoardVo boardVo);

    int insertReply(ReplyVo replyVo);

    List<ReplyVo> getReplyList(ReplyVo replyVo);

  int insertComment(CommentVo commentVo);

    List<CommentVo> getCommentList(int boardNo);
}
