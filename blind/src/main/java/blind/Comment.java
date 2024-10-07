package blind;

public class Comment {

	String comment_id;
	String post_id;
	String user_id;
	String company;
	String contents;
	String date;
	public Comment(String comment_id, String post_id, String user_id, String company, String contents, String date) {
		super();
		this.comment_id = comment_id;
		this.post_id = post_id;
		this.user_id = user_id;
		this.company = company;
		this.contents = contents;
		this.date = date;
	}
	public Comment(String post_id, String user_id, String company, String contents, String date) {
		super();
		this.post_id = post_id;
		this.user_id = user_id;
		this.company = company;
		this.contents = contents;
		this.date = date;
	}
	public String getComment_id() {
		return comment_id;
	}
	public void setComment_id(String comment_id) {
		this.comment_id = comment_id;
	}
	public String getPost_id() {
		return post_id;
	}
	public void setPost_id(String post_id) {
		this.post_id = post_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Comment [comment_id=" + comment_id + ", post_id=" + post_id + ", user_id=" + user_id + ", company="
				+ company + ", contents=" + contents + ", date=" + date + "]";
	}
	
	
	
}
