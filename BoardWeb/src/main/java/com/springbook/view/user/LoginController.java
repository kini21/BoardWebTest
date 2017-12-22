package com.springbook.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

@Controller
public class LoginController{
	@RequestMapping(value="/login.do")
	public String login(UserVO vo, UserDAO userDAO) {
		System.out.println("�α��� ó��");
		
		// 1. ����� �Է� ���� ����
		/*String id = request.getParameter("id");
		String password = request.getParameter("password");*/
		
		//2. DB ���� ó��
		/*UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		
		UserDAO userDAO = new UserDAO();
		UserVO user = userDAO.getUser(vo);*/
		
		//3.ȭ�� �׺���̼�
		if(userDAO.getUser(vo) != null) {
			return "getBoardList.do";
		} else {
			return "login.jsp";
		}
	}

}
