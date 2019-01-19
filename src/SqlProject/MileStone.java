package SqlProject;


public class MileStone {
	
	private int projectId;
	
	private int msId;
	
	private String name;
	
	private String date;
	
	private int amount;
	
	public MileStone(){
		
	}
	public MileStone(int _projectId,int _msId,int _amount,String _name,String _date){
	
		this.projectId=_projectId;
		this.msId=_msId;
		this.amount=_amount;
		this.name=_name;
		this.date=_date;
		}

	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int _ProjectId) {
		this.projectId = _ProjectId;
	}
	public int getmsId() {
		return msId;
	}
	public void setmsId(int _msId) {
		this.msId = _msId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int _amount) {
		this.amount = _amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String _name) {
		this.name = _name;
	}
	
}
