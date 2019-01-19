package SqlProject;

import java.util.*;


public class Project {
	

	private int id;
	
	private String projectname;
	
	private ArrayList<Engineer> engineers;
	
	private String descrption;
	
	private String startdate;
	
	
	public Project(){
		
	}
	public Project(int _id,String _projectname,ArrayList<Engineer> _engineers,String _startdate,String _descrption){
	
		this.id=_id;
		this.projectname=_projectname;
		this.setEngineers(_engineers);
		this.startdate=_startdate;
		this.descrption=_descrption;
}

	public String getStartDate() {
		return startdate;
	}
	public void setStartDate(String _startdate) {
		this.startdate = _startdate;
	}
	
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String _projectname) {
		this.projectname = _projectname;
	}

	public int getId() {
		return id;
	}
	public void setId(int _id) {
		this.id = _id;
	}
	public String getdescrption() {
		return descrption;
	}
	public void setdescrption(String _descrption) {
		this.descrption = _descrption;
	}
	public ArrayList<Engineer> getEngineers() {
		return engineers;
	}
	public void setEngineers(ArrayList<Engineer> _engineers) {
		this.engineers = _engineers;
	}
}
