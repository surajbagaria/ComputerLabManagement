public abstract class LabResource {

	double totalCost = 0;
	
	public void add(LabResource newLabResource) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(LabResource newLabResource) {
		throw new UnsupportedOperationException();
	}
	
	public LabResource getResource(int resourceIndex) {
		throw new UnsupportedOperationException();
	}
	
	public String getResourceId() {
		throw new UnsupportedOperationException();
	}
	
	public int getModelYear() {
		throw new UnsupportedOperationException();
	}
	
	public boolean getStatus() {
		throw new UnsupportedOperationException();
	}
	
	public String getSupervisor() {
		throw new UnsupportedOperationException();
	}
	
	public double getCostOfMaintainance() {
		throw new UnsupportedOperationException();
	}
	
	public void displayResourceInfo() {
		throw new UnsupportedOperationException();
	}
	
	

	public boolean isOldModel(int year) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
	public void showOlderModels(int year) {
		throw new UnsupportedOperationException();
	}
	
	public void setInactive(String resourceId) {
		throw new UnsupportedOperationException();
	}
	
}
