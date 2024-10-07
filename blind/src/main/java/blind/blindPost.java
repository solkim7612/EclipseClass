package blind;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/blindpost")
public class blindPost extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		
		String id = req.getParameter("id");
		
		post postdetail=null;
		DBDAO_blind dao = new DBDAO_blind();
		
		//
		postdetail = dao.selectPostDetail(id);
		
		String contents = postdetail.getContents();
		contents = contents.replace("\r\n", "<br>"); 
	    contents = contents.replace("\n", "<br>");  
		
		postdetail.setContents(contents);
		
		
		ArrayList<bestTopic> list = dao.selectAllBestTopic();
		
		
		
		//댓글
		
		int cnt_comm = dao.cnt_comm(id);
		req.setAttribute("cnt_comm", cnt_comm);
		
		
		ArrayList <Comment> comm = dao.selectAllComment(id);
		String comment_contetns = null;
		for(Comment comment : comm ) {
			comment_contetns = comment.getContents();
			comment_contetns = comment_contetns.replace("\r\n", "<br>");
			comment_contetns = comment_contetns.replace("\n", "<br>");
			comment.setContents(comment_contetns);
		}
		
		
		
		req.setAttribute("post_id", id);
		req.setAttribute("comments", comm);
		req.setAttribute("postdetail", postdetail);
		req.getRequestDispatcher("WEB-INF/views/postDetail.jsp").forward(req, resp);
	}

}
