package SqlProject;

import java.util.*;

public class CM {
	
	private int projectId;
	
	private String stage;
	
	private ArrayList<String> tools;
	
	public CM(){
		
	}
	public CM(int _projectId,String _stage,int _age,ArrayList<String> _tools){
	
		this.projectId=_projectId;
		this.stage=_stage;
		this.tools=_tools;
		}

	public String getStage() {
		return stage;
	}
	public void setStage(String _stage) {
		this.stage = _stage;
	}
	
	public ArrayList<String> getTools() {
	    return tools;
	  }
public void setTools(ArrayList<String> _tools) {
	  this.tools = _tools;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int _ProjectId) {
		this.projectId = _ProjectId;
	}
}
