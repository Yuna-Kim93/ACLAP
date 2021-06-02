package bit.com.a.dto;

public class participateDto {
	private int classNum;
	private int memNum;
	private String cDate;
	private String name;
	private int rPoint;	// 결제 금액
	private String primaryCategory;
	private String secondaryCategory;
	private String title;
	private int joinNum;	// 신청한 사람 수
	
	public participateDto() {
	}

	public participateDto(int classNum, int memNum, String cDate, String name, int rPoint, String primaryCategory,
			String secondaryCategory, String title, int joinNum) {
		super();
		this.classNum = classNum;
		this.memNum = memNum;
		this.cDate = cDate;
		this.name = name;
		this.rPoint = rPoint;
		this.primaryCategory = primaryCategory;
		this.secondaryCategory = secondaryCategory;
		this.title = title;
		this.joinNum = joinNum;
	}

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}

	public int getMemNum() {
		return memNum;
	}

	public void setMemNum(int memNum) {
		this.memNum = memNum;
	}
	
	public String getcDate() {
		return cDate;
	}

	public void setcDate(String cDate) {
		this.cDate = cDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getrPoint() {
		return rPoint;
	}

	public void setrPoint(int rPoint) {
		this.rPoint = rPoint;
	}

	public String getPrimaryCategory() {
		return primaryCategory;
	}

	public void setPrimaryCategory(String primaryCategory) {
		this.primaryCategory = primaryCategory;
	}

	public String getSecondaryCategory() {
		return secondaryCategory;
	}

	public void setSecondaryCategory(String secondaryCategory) {
		this.secondaryCategory = secondaryCategory;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getJoinNum() {
		return joinNum;
	}

	public void setJoinNum(int joinNum) {
		this.joinNum = joinNum;
	}

	@Override
	public String toString() {
		return "participateDto [classNum=" + classNum + ", memNum=" + memNum + ", cDate=" + cDate + ", name=" + name
				+ ", rPoint=" + rPoint + ", primaryCategory=" + primaryCategory + ", secondaryCategory="
				+ secondaryCategory + ", title=" + title + ", joinNum=" + joinNum + "]";
	}

}
