package com.springbook.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

public class LogoutController implements Controller{
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("�α׾ƿ� ó��");
		
		//1. �������� ����� ���� ��ü�� ���� �����Ѵ�.
		HttpSession session = request.getSession();
		session.invalidate();
		
		//2. ���� ���� ��, ����ȭ������ �̵��Ѵ�.
	 	ModelAndView mav = new ModelAndView();
	 	mav.setViewName("redirect:login.jsp");
	 	return mav;
	}
}
