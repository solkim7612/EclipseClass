package day08.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/logoutex")
public class LogOutSevlet  extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		//세션 지우기 
		
		
		//세션저장소 얻어오기
		HttpSession  session = req.getSession();
		session.invalidate();
		
		//
		System.out.println(" 로그아웃");
		//메인페이지로 리다이랙트  ( 웹브라우저에게 재요청 하세요 !! 라는 의미)
	   // resp.sendRedirect("/day08/loginex");
		
		resp.sendRedirect("/day08/mainex");
		
	}

}
