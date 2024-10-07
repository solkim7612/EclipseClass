package blindWeb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CommentsDAO {
    
    // Method to get a list of comments by postId
    public List<Comments> getCommentsByPostId(String postId) {
        List<Comments> commentsList = new ArrayList<>();
        
        // Correct SQL query with WHERE clause
        String query = "SELECT "
                + "    p.post_title AS post_title, "
                + "    c1.company_name AS company_name, "
                + "    RPAD(p.userId,8,'*') AS userId, "
                + "    p.post_contents AS post_contents, "
                + "    p.post_date AS post_date, "
                + "    LISTAGG("
                + "        c2.company_name || '(' || RPAD(s.userId,8,'*') || '): ' || s.comments_contents || ' ' || TO_CHAR(s.comments_date, 'YYYY-MM-DD') || CHR(10), CHR(10) "
                + "    ) WITHIN GROUP (ORDER BY s.comments_date) AS comments "
                + "FROM post p "
                + "JOIN comments s ON p.post_id = s.post_id "
                + "JOIN company c1 ON p.post_userCompany = c1.company_id "
                + "JOIN company c2 ON s.comments_userCompany = c2.company_id "
                + "WHERE p.post_id = ? "
                + "GROUP BY "
                + "    p.post_title, "
                + "    p.post_date, "
                + "    c1.company_name, "
                + "    p.userId, "
                + "    p.post_contents "
                + "ORDER BY p.post_date";
        
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            
            // Setting the postId in the query
            pstmt.setString(1, postId);
            
            // Executing the query
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Comments comment = new Comments();
                    
                    // Setting fields from ResultSet
                    comment.setPostId(postId);
                    comment.setCommentsUserCompany(rs.getString("company_name"));
                    comment.setUserId(rs.getString("userId"));
                    comment.setCommentsContents(rs.getString("comments"));
                    comment.setCommentsDate(rs.getDate("post_date"));
                    
                    commentsList.add(comment);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return commentsList;
    }
}