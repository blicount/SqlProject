package SqlProject;

import java.util.ArrayList;

public class Grades {
	
	private int engineerId;
	
	private int projectId;
	
	private ArrayList<Integer> grades;
	
	
	public Grades(){
		
	}
	public Grades(int _projectId,int _engineerId,ArrayList<Integer> _grades){
	
		this.projectId=_projectId;
		this.engineerId=_engineerId;
		this.grades=_grades;

		}

	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int _ProjectId) {
		this.projectId = _ProjectId;
	}
	public int getEngineerId() {
		return engineerId;
	}
	public void setEngineerId(int _engineerId) {
		this.engineerId = _engineerId;
	}

}
