package blindWeb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PostDAO {

    public List<Post> getTop10() {
        List<Post> topTopics = new ArrayList<>();

        String query = "SELECT * FROM ( "
                     + "SELECT p.post_id AS postId, p.userId AS userId, p.post_usercompany AS postUserCompany, "
                     + "p.post_title AS postTitle, p.post_date AS postDate, p.post_contents AS postContents, "
                     + "COUNT(c.comments_id) AS commentCount "
                     + "FROM post p "
                     + "LEFT JOIN comments c ON p.post_id = c.post_id "
                     + "GROUP BY p.post_id, p.userId, p.post_usercompany, p.post_title, p.post_date, p.post_contents "
                     + "ORDER BY COUNT(c.comments_id) DESC "
                     + ") WHERE ROWNUM <= 10";

        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Post post = new Post(query, query, query, query);
                
                // ResultSet에서 각 컬럼값을 가져옵니다.
                post.setPostId(rs.getString("postId"));
                post.setUserId(rs.getString("userId"));
                post.setPostUserCompany(rs.getString("postUserCompany"));
                post.setPostTitle(rs.getString("postTitle"));
                post.setPostDate(rs.getString("postDate"));
                post.setPostContents(rs.getString("postContents"));
                post.setCommentCount(rs.getInt("commentCount"));

                topTopics.add(post);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return topTopics;
    }

    public Post getPostById(String postId) {
        Post post = null;
        String query = "SELECT * FROM post WHERE post_id = ?";

        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, postId); // postId를 쿼리 파라미터에 설정

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    post = new Post(query, query, query, query);
                    post.setPostId(rs.getString("post_id"));
                    post.setUserId(rs.getString("userId"));
                    post.setPostUserCompany(rs.getString("post_usercompany"));
                    post.setPostTitle(rs.getString("post_title"));
                    post.setPostDate(rs.getString("post_date"));
                    post.setPostContents(rs.getString("post_contents"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return post;
    }
}