package blind;

public class bestTopic {

	String id;
	String title;
	String cnt_comment;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCnt_comment() {
		return cnt_comment;
	}
	public void setCnt_comment(String cnt_comment) {
		this.cnt_comment = cnt_comment;
	}
	public bestTopic(String id, String title, String cnt_comment) {
		super();
		this.id = id;
		this.title = title;
		this.cnt_comment = cnt_comment;
	}
	@Override
	public String toString() {
		return "bestTopic [id=" + id + ", title=" + title + ", cnt_comment=" + cnt_comment + "]";
	}
	
	
}
