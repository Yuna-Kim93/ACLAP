package bit.com.a.dto;

public class scheduleDto {
	private int scheduleNum;
	private String rdate;
	private int memNum;
	private String name;	//수강신청자 이름
	private int classNum;
	private int del;
	
	private String instructor;
	private String title;
	private String information;
	
	public scheduleDto() {
	}
	
	public scheduleDto(int scheduleNum, String rdate, int memNum, int classNum, int del) {
		super();
		this.scheduleNum = scheduleNum;
		this.rdate = rdate;
		this.memNum = memNum;
		this.classNum = classNum;
		this.del = del;
	}

	public scheduleDto(int scheduleNum, String rdate, int memNum, int classNum, int del, String instructor,
			String title, String information) {
		super();
		this.scheduleNum = scheduleNum;
		this.rdate = rdate;
		this.memNum = memNum;
		this.classNum = classNum;
		this.del = del;
		this.instructor = instructor;
		this.title = title;
		this.information = information;
	}

	public int getScheduleNum() {
		return scheduleNum;
	}

	public void setScheduleNum(int scheduleNum) {
		this.scheduleNum = scheduleNum;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

	public int getMemNum() {
		return memNum;
	}

	public void setMemNum(int memNum) {
		this.memNum = memNum;
	}

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	
	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	@Override
	public String toString() {
		return "scheduleDto [scheduleNum=" + scheduleNum + ", rdate=" + rdate + ", memNum=" + memNum + ", classNum="
				+ classNum + ", del=" + del + "]";
	}
	
	
}
