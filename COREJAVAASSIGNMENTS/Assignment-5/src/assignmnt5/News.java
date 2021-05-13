package assignmnt5;



public class News {
	int newsId; 
	String postedByUser; 
	String commentByUser; 
	String comment;
	
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	
	
	public int getnewsId() {
		return newsId;
	}
	public void setnewsId(int newsId) {
		newsId = newsId;
	}
	public String getpostedByUser() {
		return postedByUser;
	}
	public void setpostedByUser(String postedByUser) {
		postedByUser = postedByUser;
	}
	
	public String getcommentByUser() {
		return commentByUser;
	}
	public void setcommentByUser(String commentByUser) {
		commentByUser = commentByUser;
	}
	
	public String getcomment() {
		return comment;
	}
	public void setcomment(String comment) {
		comment = comment;
	}
	
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";

}


	
	}

