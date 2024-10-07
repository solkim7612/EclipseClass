package blind;

public class post {
	String title;
	String company;
	String id;
	String contents;
	String date;
	
	@Override
	public String toString() {
		return "post [title=" + title + ", company=" + company + ", id=" + id + ", contents=" + contents + ", date="
				+ date + "]";
	}
	public post(String title, String company, String id, String contents, String date) {
		super();
		this.title = title;
		this.company = company;
		this.id = id;
		this.contents = contents;
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getDate() {
		return date.substring(0, 11);
	}
	public void setDate(String date) {
		this.date = date;
	}
}
