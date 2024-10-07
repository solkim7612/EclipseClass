package day04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dan")
public class Dan extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//사용자 입력부분
		String su_=req.getParameter("su");
		int su=2;
		
		if(su_ !=null){
			su=Integer.parseInt(su_);
		}

		
		//데이터 만들기
		
		String result ="2*1=2";
		
		
		req.setAttribute("result", result);
		
		//응답
		req.getRequestDispatcher("WEB-INF/views/danView.jsp").forward(req,resp);
	}

	
}


