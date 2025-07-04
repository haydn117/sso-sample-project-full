package com.example.sso.controller;

/*
import com.example.sso.model.UserInfo;

import com.example.sso.model.Board;
import com.example.sso.model.Notice;
import com.example.sso.service.BoardService;
import com.example.sso.service.NoticeService;
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BoardController {
	/*
    @Autowired
    private BoardService boardService;

    @Autowired
    private NoticeService noticeService;
	 */

    // 1. 루트 접속 시 메인으로 리다이렉트
    @GetMapping("/")
    public String index() {
    	System.out.println("1. @GetMapping(\"/\")");
        return "redirect:/main";
    }

    // 2. 대시보드 화면
    @GetMapping("/main")
    public String mainPage(Model model) {
    	System.out.println("2. @GetMapping(\"/main\")");
        model.addAttribute("body", "/WEB-INF/views/main.jsp");
        return "layout";
    }
    
    /*
    // 3. 공지사항 목록
    @GetMapping("/notice")
    public String noticePage(Model model) {
        List<Notice> noticeList = noticeService.getAllNotices(); // 더미 또는 DB
        model.addAttribute("noticeList", noticeList);
        model.addAttribute("body", "notice.jsp");
        return "layout";
    }

    // 4. 게시판 목록
    @GetMapping("/board")
    public String boardList(Model model) {
        List<Board> boardList = boardService.getAllBoards();
        model.addAttribute("boardList", boardList);
        model.addAttribute("body", "board.jsp");
        return "layout";
    }

    // 5. 로그인 화면
    @GetMapping("/login")
    public String loginPage(@RequestParam(value = "warn", required = false) String warn, Model model) {
        if (warn != null) {
            model.addAttribute("warn", warn);
        }
        model.addAttribute("body", "loginForm.jsp");
        return "layout";
    }

    // 6. 게시물 보기
    @GetMapping("/board/view/{id}")
    public String boardView(@PathVariable("id") int boardId, Model model) {
        boardService.incrementViewCount(boardId);
        Board board = boardService.getBoardById(boardId);
        model.addAttribute("board", board);
        model.addAttribute("body", "boardView.jsp");
        return "layout";
    }

    // 7. 게시물 수정
    @GetMapping("/board/edit/{id}")
    public String boardEdit(@PathVariable("id") int boardId, Model model, HttpSession session, RedirectAttributes redirectAttrs) {
        UserInfo user = (UserInfo) session.getAttribute("user");
        if (user == null || !"admin".equalsIgnoreCase(user.getUserRole())) {
            redirectAttrs.addAttribute("warn", "수정 권한이 없습니다.");
            return "redirect:/board";
        }
        Board board = boardService.getBoardById(boardId);
        model.addAttribute("board", board);
        model.addAttribute("body", "boardUpdate.jsp");
        return "layout";
    }
    */
}
