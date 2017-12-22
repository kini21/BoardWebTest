package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class InsertBoardController {
	
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("�� ��� ó��");
		
		//1. ����� �Է� ���� ����
	/* 	String title = request.getParameter("title");
	 	String writer = request.getParameter("writer");
	 	String content = request.getParameter("content");*/
	 	
	 	// 2. DB ���� ó��
	 	/*BoardVO vo = new BoardVO();
	 	vo.setTitle(title);
	 	vo.setWriter(writer);
	 	vo.setContent(content);*/
	
	 	boardDAO.insertBoard(vo);
	 	return "redirect:getBoardList.do";
	}
}
