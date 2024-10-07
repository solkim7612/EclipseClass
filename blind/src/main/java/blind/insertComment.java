package blind;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/insertComment")
public class insertComment extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		
		String user_id = req.getParameter("user_Id");
		String post_id = req.getParameter("post_id");
		String contents = req.getParameter("contents");
		
		DBDAO_blind dao = new DBDAO_blind();
		
		int result = dao.insertComm(user_id, post_id, contents);
		
		System.out.println(result);
		
		resp.sendRedirect("/blind/blindpost?id="+post_id);
		
	}

}
