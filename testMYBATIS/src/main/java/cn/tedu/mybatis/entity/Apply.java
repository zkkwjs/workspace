package cn.tedu.mybatis.entity;

//提交的申请属性类
public class Apply {
	
	private int id;
	private String name;
	private String club;
	private String job;
	private String newjob;
	private String newclub;
	private String time;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getNewjob() {
		return newjob;
	}
	public void setNewjob(String newjob) {
		this.newjob = newjob;
	}
	public String getNewclub() {
		return newclub;
	}
	public void setNewclub(String newclub) {
		this.newclub = newclub;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Apply [id=" + id + ", name=" + name + ", club=" + club + ", job=" + job + ", newjob=" + newjob
				+ ", newclub=" + newclub + ", time=" + time + "]";
	}
	
	
}
