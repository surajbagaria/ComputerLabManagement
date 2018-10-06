
public class WorkStation extends LabResource {

	String typeOfResource;
	String resourceId;
	int modelYear;
	boolean status;
	String supervisor;
	double costOfMaintainance;
	
	public WorkStation(String newResourceId, int newModelYear, boolean newStatus, String newSupervisor, double newCostOfMaintainance) {
		typeOfResource = "WorkStation";
		resourceId = newResourceId;
		modelYear = newModelYear;
		status = newStatus;
		supervisor = newSupervisor;
		costOfMaintainance = newCostOfMaintainance;
		System.out.println("WorkStation object is created");
	}
	
	public String getResourceId() {
		return resourceId;
	}
	
	public int getModelYear() {
		return modelYear;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public String getSupervisor() {
		return supervisor;
	}
	
	public double getCostOfMaintainance() {
		return costOfMaintainance;
	}
	
	public void displayResourceInfo() {
		System.out.println("Resource: "+typeOfResource+" Resource Id: "+getResourceId()+" Model Year: "+getModelYear()+" Status: "+getStatus()+" Supervisor: "+getSupervisor()+" Cost of Maintainance: "+getCostOfMaintainance());
	}
	
	public boolean isOldModel(int year) {
		if(year >= modelYear)
			return true;
		else
			return false;
	}
	
	public void showOlderModels(int year) {
		System.out.println("Resource: "+typeOfResource+" Resource Id: "+getResourceId()+" Model Year: "+getModelYear()+" Status: "+getStatus()+" Supervisor: "+getSupervisor()+" Cost of Maintainance: "+getCostOfMaintainance());
	}
	
	public void setInactive(String resourceId) {
		status = false;
	}
	
}
