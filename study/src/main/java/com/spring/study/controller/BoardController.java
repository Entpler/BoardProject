package com.spring.study.controller;
import com.spring.study.model.BoardVo;
import com.spring.study.service.BoardService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Log4j
@RequestMapping("/board")
@Controller
@AllArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/list")
    public String boardList(Model model) {

        List<BoardVo> list = boardService.boardList();

        model.addAttribute("list", list);

        return "board/boardList";
    }
}
