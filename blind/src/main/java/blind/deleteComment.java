package blind;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deletecomm")
public class deleteComment extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		
		DBDAO_blind dao = new DBDAO_blind();
		
		String comm_id = req.getParameter("comm_id");
		String post_id = req.getParameter("post_id");
		
		dao.deleteComment(comm_id);
		
		resp.sendRedirect("/blind/blindpost?id="+post_id);
		
		
		
	}
}
