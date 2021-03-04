package management;

public class Grades {
    private Double p1;
    private Double p2;
    private Double p3;
    private Double finalgrade;
    private Double homeworksgrade;
    private Double TOTALGRADE;
    public Grades() {
    	this.p1 = 0.0;
    	this.p2 = 0.0;
    	this.p3 = 0.0;
    	this.homeworksgrade = 0.0;
    	this.finalgrade = 0.0;
    	this.TOTALGRADE = 0.0;
    	
    }
	public Double getP1() {
		return p1;
	}
	public void setP1(Double p1) {
		this.p1 = p1;
	}
	public Double getP2() {
		return p2;
	}
	public void setP2(Double p2) {
		this.p2 = p2;
	}
	public Double getP3() {
		return p3;
	}
	public void setP3(Double p3) {
		this.p3 = p3;
	}
	public Double getFinalgrade() {
		return finalgrade;
	}
	public void setFinalgrade(Double finalgrade) {
		this.finalgrade = finalgrade;
	}
	public Double getHomeworksgrade() {
		return homeworksgrade;
	}
	public void setHomeworksgrade(Double homeworksgrade) {
		this.homeworksgrade = homeworksgrade;
	}
	public Double getTOTALGRADE() {
		return TOTALGRADE;
	}
	public void setTOTALGRADE(Double tOTALGRADE) {
		TOTALGRADE = tOTALGRADE;
	}
	
	
}