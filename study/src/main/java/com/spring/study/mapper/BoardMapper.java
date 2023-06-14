package com.spring.study.mapper;

import com.spring.study.common.PageInfo;
import com.spring.study.model.BoardSearchDto;
import com.spring.study.model.BoardVo;
import com.spring.study.model.CommentVo;
import com.spring.study.model.ReplyVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardVo> boardList(BoardSearchDto boardSearchDto);

    BoardVo selectQnaList(BoardVo boardVo);

    int insertQna(BoardVo boardVo);

    int insertReply(ReplyVo replyVo);

    List<ReplyVo> getReplyList(ReplyVo replyVo);

  int insertComment(CommentVo commentVo);

    List<CommentVo> getCommentList(int boardNo);

    int selectListCount(BoardSearchDto boardSearchDto);
}
