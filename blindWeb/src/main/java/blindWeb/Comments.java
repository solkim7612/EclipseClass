package blindWeb;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Comments {
    
	private String commentsId;
    private String postId;
    private String userId;
    private String commentsUserCompany;
    private String commentsContents;
    private Date commentsDate;

    // Getters and Setters
    public String getCommentsId() {
        return commentsId;
    }

    public void setCommentsId(String commentsId) {
        this.commentsId = commentsId;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCommentsUserCompany() {
        return commentsUserCompany;
    }

    public void setCommentsUserCompany(String commentsUserCompany) {
        this.commentsUserCompany = commentsUserCompany;
    }

    public String getCommentsContents() {
        return commentsContents;
    }

    public void setCommentsContents(String commentsContents) {
        this.commentsContents = commentsContents;
    }

    public Date getCommentsDate() {
        return commentsDate;
    }

    public void setCommentsDate(Date commentsDate) {
        this.commentsDate = commentsDate;
    }

    // Formatted date as a string
    public String getFormattedCommentsDate() {
        if (commentsDate != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return sdf.format(commentsDate);
        }
        return "";
    }
    
    @Override
    public String toString() {
        return "Comments {" +
                "commentsId='" + commentsId + '\'' +
                ", postId='" + postId + '\'' +
                ", userId='" + userId + '\'' +
                ", commentsUserCompany='" + commentsUserCompany + '\'' +
                ", commentsContents='" + commentsContents + '\'' +
                ", commentsDate='" + getFormattedCommentsDate() + '\'' +
                '}';
    }
}