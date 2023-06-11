package com.spring.study.controller;
import com.spring.study.model.BoardVo;
import com.spring.study.model.CommentVo;
import com.spring.study.model.ReplyVo;
import com.spring.study.service.BoardService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.eclipse.tags.shaded.org.apache.xalan.xsltc.compiler.sym.error;

@Log4j
@RequestMapping("/board")
@Controller
@AllArgsConstructor
//Qna 게시판
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/list")
    public String boardList(Model model, BoardVo boardVo) {
        List<BoardVo> list = boardService.boardList();
        List<ReplyVo> replyList = new ArrayList<>();
        for (BoardVo board : list) {
            Integer boardNo = board.getBoardNo();
            if (boardNo != null) {
                ReplyVo replyVo = new ReplyVo();
                replyVo.setBoardNo(boardNo);

                List<ReplyVo> boardReplyList = boardService.getReplyList(replyVo);
                replyList.addAll(boardReplyList);
                board.setReplyList(boardReplyList);
            }
        }
        model.addAttribute("replyList", replyList);
        model.addAttribute("list", list);

        return "board/boardList";
    }

    @GetMapping("/view/{boardNo}")
    public String selectQnaList(@PathVariable String boardNo, BoardVo boardVo, Model model) {
        int boardNumber;
        try{
            boardNumber = Integer.parseInt(boardNo);
        }catch(NumberFormatException e) {
                return "error";
        }
        BoardVo info = boardService.selectQnaList(boardVo);
        List<CommentVo> commentList = boardService.getCommentList(boardNumber);

        model.addAttribute("info", info);
        model.addAttribute("commentList", commentList);

        return "board/view";

    }

    @GetMapping("/insertQna")
    public String insertQnaForm(BoardVo boardVo, Model model) {
        BoardVo info = boardService.selectQnaList(boardVo);
        model.addAttribute("info", info);
        return "board/add";

    }

    @PostMapping("/insertQna")
    public String insertQna(BoardVo boardVo) {

        boardService.insertQna(boardVo);

        return "redirect:/board/list";
    }

    @GetMapping("/insertReplyForm/{boardNo}")
    public String addReplyForm(@PathVariable("boardNo") int boardNo, BoardVo boardVo, Model model) {
        BoardVo info = boardService.selectQnaList(boardVo);
        model.addAttribute("info", info);

        return "board/addReply";
    }

    @PostMapping("/insertReply/{boardNo}")
    public String insertReply(ReplyVo replyVo, @PathVariable("boardNo") int boardNo, Model model) {
        BoardVo boardVo = new BoardVo();
        boardVo.setBoardNo(boardNo);
        BoardVo info = boardService.selectQnaList(boardVo);
        boardService.insertReply(replyVo);
        model.addAttribute("boardNo", boardNo);
        model.addAttribute("info", info);

        return "redirect:/board/list";
    }


    @PostMapping("/addComment/{boardNo}")
    public String insertComment(@PathVariable int boardNo, @ModelAttribute CommentVo commentVo, Model model) {
        commentVo.setBoardNo(boardNo);
        boardService.insertComment(commentVo);

        return "redirect:/board/view/" + boardNo;
    }
}