package day08;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/surveyex2")
public class SurveyTwo  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		
		
		  req.setCharacterEncoding("utf-8");
		  String animal  = req.getParameter("animal"); 
		  
		  
		  //클라이언트마다 사용할 수 있는 저장소   세션얻어오기   => 각 클라이언트마다 제공되는 저장소 
		  HttpSession   session  = req.getSession();
		  
		  //세션저장소 저장하기 
		  session.setAttribute("servey1", animal);
		  
		  
		 req.getRequestDispatcher("WEB-INF/views/serveyTwo.jsp").forward(req, resp);
		
		
	}

}
