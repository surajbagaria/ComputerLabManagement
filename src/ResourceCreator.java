
public class ResourceCreator {

	LabResource resourceList;
	
	public ResourceCreator(LabResource newResourceList) {
		resourceList = newResourceList;
	}
	
	public void getResourceList() {
		resourceList.displayResourceInfo();
	}
	
	public double getTotalCost() {
		return resourceList.getCostOfMaintainance();
	}
	
	public void displayOldModel(int year) {
		resourceList.showOlderModels(year);
	}
	
	public void removeResource(String givenResourceId) {
		resourceList.setInactive(givenResourceId);
	}
}
