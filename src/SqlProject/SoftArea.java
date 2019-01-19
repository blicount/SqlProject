package SqlProject;

public class SoftArea {
	

	private int id;
	
	private String SoftAreaName;

	private String expertise;

	
	public SoftArea(){
		
	}
	public SoftArea(int _id,String _SoftAreaName,String _expertise){
	
		this.id=_id;
		this.SoftAreaName=_SoftAreaName;
		this.expertise=_expertise;

		}

	public String getSoftAreaName() {
		return SoftAreaName;
	}
	public void setSoftAreaNamee(String _SoftAreaName) {
		this.SoftAreaName = _SoftAreaName;
	}
	
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String _expertise) {
		this.expertise = _expertise;
	}

	public int getId() {
		return id;
	}
	public void setId(int _id) {
		this.id = _id;
	}
}
