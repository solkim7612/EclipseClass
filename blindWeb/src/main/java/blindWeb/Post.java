package blindWeb;

import java.util.Date;

public class Post {
    private String postId;
    private String userId;
    private String postUserCompany;
    private String postTitle;
    private String postDate;
    private String postContents;
    private int commentCount;

  
    public Post(String userId, String postUserCompany, String postDate, String postContents) {
        this.userId = userId;
        this.postUserCompany = postUserCompany;
        this.postDate = postDate;
        this.postContents = postContents;
    }


	// Getter and Setter methods
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

    public String getPostUserCompany() {
        return postUserCompany;
    }

    public void setPostUserCompany(String postUserCompany) {
        this.postUserCompany = postUserCompany;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getPostContents() {
        return postContents;
    }

    public void setPostContents(String postContents) {
        this.postContents = postContents;
    }
    
    public int getCommentCount() {
  		return commentCount;
  	}

  	public void setCommentCount(int commentCount) {
  		this.commentCount = commentCount;
  	}

  	public String toString() {
  	    return "Post {" +
  	            "postId='" + postId + '\'' +
  	            ", userId='" + userId + '\'' +
  	            ", postUserCompany='" + postUserCompany + '\'' +
  	            ", postTitle='" + postTitle + '\'' +
  	            ", postDate='" + postDate + '\'' +
  	            ", postContents='" + postContents + '\'' +
  	            ", commentCount=" + commentCount +
  	            '}';
  	}
  	
  	
}