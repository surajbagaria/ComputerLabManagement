import java.util.ArrayList;
import java.util.Iterator;
public class ComputerCluster extends LabResource {

	ArrayList labResource = new ArrayList();
	String clusterId;
	String supervisor;
	
	public ComputerCluster(String newClusterId, String newSupervisor) {
		System.out.println("Cluster is created");
		clusterId = newClusterId;
		supervisor = newSupervisor;
	}
	
	public String getClusterId() {return clusterId;}
	public String getSupervisor() {return supervisor;}
	
	public void add(LabResource newLabResource) {
		labResource.add(newLabResource);
	}
	
	public void remove(LabResource newLabResource) {
		labResource.remove(newLabResource);
	}
	
	public LabResource getResource(int resourceIndex) {
		return (LabResource) labResource.get(resourceIndex);
	}
	
	public boolean getStatus() {
		return true;
	}
	
	public String getResourceId() {
		return "";
	}
	
	public boolean isOldModel(int year) {
		return true;
	}
	

	public void displayResourceInfo() {
		System.out.println("Cluster ID: "+getClusterId()+ " Supervisor: "+getSupervisor());
		Iterator resourceIterator = labResource.iterator();
		while(resourceIterator.hasNext()) {
			LabResource resourceInfo = (LabResource) resourceIterator.next();
			if(resourceInfo.getStatus())
			resourceInfo.displayResourceInfo();
		}
	}
	
	public double getCostOfMaintainance() {
		Iterator resourceIterator = labResource.iterator();
		while(resourceIterator.hasNext()) {
			LabResource resource = (LabResource) resourceIterator.next();
			if(resource.getStatus())
			totalCost  = totalCost + resource.getCostOfMaintainance();
		}
		return totalCost;
	}
	
	public void showOlderModels(int year) {
		Iterator resourceIterator = labResource.iterator();
		while(resourceIterator.hasNext()) {
			LabResource resource = (LabResource) resourceIterator.next();
			if(resource.isOldModel(year))
			resource.showOlderModels(year);
		}
	}
	
	public void setInactive(String resourceId) {
		Iterator resourceIterator = labResource.listIterator();
		while(resourceIterator.hasNext()) {
			LabResource resource =(LabResource) resourceIterator.next();
			if(resource.getResourceId().equals(resourceId) || resource instanceof ComputerCluster) {
				resource.setInactive(resourceId);
			}
		}
	}
		
}
