package com.springbook.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class UpdateBoardController{
	@RequestMapping(value="updateBoard.do")
	public String handleRequest(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("�� ���� ó��");
		
		//1. ����� �Է� ���� ����
	 /*	String title = request.getParameter("title");
	 	String content = request.getParameter("content");
	 	String seq = request.getParameter("seq");*/
	 	
	 	// 2. DB ���� ó��
	 	/*BoardVO vo = new BoardVO();
	 	vo.setTitle(title);
	 	vo.setContent(content);
	 	vo.setSeq(Integer.parseInt(seq));
	 	
	 	BoardDAO boardDAO = new BoardDAO();*/
	 	boardDAO.updateBoard(vo);
	 	
	 	//3.ȭ�� �׺���̼�
	 	return "getBoardList.do";
	}
}
