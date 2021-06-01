package bit.com.a.dto;

public class reviewDto {

	private int classNum;
	private int memNum;
	private String rContent;
	private String name;
	private double starPoint;
	private double cleanness; //청결도
	private double rComm;
	private double satisfy;  //만족도
	private double rLocation;
	private double accuracy;
	private int del;
	private String image1;
	private String image2;
	private String image3;
	private String wdate;
	
	public reviewDto() {
		// TODO Auto-generated constructor stub
	}

	public reviewDto(int classNum, int memNum, String rContent, String name, double starPoint, double cleanness,
			double rComm, double satisfy, double rLocation, double accuracy, int del, String image1, String image2,
			String image3) {
		super();
		this.classNum = classNum;
		this.memNum = memNum;
		this.rContent = rContent;
		this.name = name;
		this.starPoint = starPoint;
		this.cleanness = cleanness;
		this.rComm = rComm;
		this.satisfy = satisfy;
		this.rLocation = rLocation;
		this.accuracy = accuracy;
		this.del = del;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
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

	public String getrContent() {
		return rContent;
	}

	public void setrContent(String rContent) {
		this.rContent = rContent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getStarPoint() {
		return starPoint;
	}

	public void setStarPoint(double starPoint) {
		this.starPoint = starPoint;
	}

	public double getCleanness() {
		return cleanness;
	}

	public void setCleanness(double cleanness) {
		this.cleanness = cleanness;
	}

	public double getrComm() {
		return rComm;
	}

	public void setrComm(double rComm) {
		this.rComm = rComm;
	}

	public double getSatisfy() {
		return satisfy;
	}

	public void setSatisfy(double satisfy) {
		this.satisfy = satisfy;
	}

	public double getrLocation() {
		return rLocation;
	}

	public void setrLocation(double rLocation) {
		this.rLocation = rLocation;
	}

	public double getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(double accuracy) {
		this.accuracy = accuracy;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

	@Override
	public String toString() {
		return "reviewDto [classNum=" + classNum + ", memNum=" + memNum + ", rContent=" + rContent + ", name=" + name
				+ ", starPoint=" + starPoint + ", cleanness=" + cleanness + ", rComm=" + rComm + ", satisfy=" + satisfy
				+ ", rLocation=" + rLocation + ", accuracy=" + accuracy + ", del=" + del + ", image1=" + image1
				+ ", image2=" + image2 + ", image3=" + image3 + "]";
	}

	
}
