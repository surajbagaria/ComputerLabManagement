
public class ResourceGenerator {

	public static void main(String[] args) {
		
		LabResource clusterA = new ComputerCluster("1", "Dev"); //This will create Cluster A(Component) object.
		LabResource clusterB = new ComputerCluster("2", "John"); //This will create Cluster B(Component) object.
		
		clusterA.add(new WorkStation("101", 2005, true, "Dev", 100.0)); //Adding WorkStation(Child) object in Cluster A.
		clusterA.add(new WorkStation("102", 2006, true, "Dev", 95.5)); //Adding WorkStation(Child) object in Cluster A.
		clusterA.add(new Printer("111", 2003, true, "Dev", 30.6)); //Adding Printer(Child) object in Cluster A.
		
		clusterB.add(clusterA); //Adding ClusterA(Component) in Cluster B.
		clusterB.add(new Printer("211", 2003, true, "John", 12.73)); //Adding WorkStation(Child) object in Cluster B.
		
		ResourceCreator resourceManager = new ResourceCreator(clusterB); //This will make Cluster B as Super Cluster.
		
		System.out.println("Following Cluster has: ");
		resourceManager.getResourceList(); //This will print all the resources objects in cluster B whose status is active.
		
		System.out.println("Total Maintainance Cost of whole Cluster is: "+resourceManager.getTotalCost()); //This will print the total Maintenance cost of entire Cluster.
		
		System.out.println("Following resources model year is less than 2004: ");
		resourceManager.displayOldModel(2004); //This will display all the resources whose model year is less than 2004.
		
		System.out.println("Removing resource with ID: 111");
		resourceManager.removeResource("111"); //This will make resource inactive whose resource ID is 111.
		resourceManager.getResourceList(); //This will again print all the resources except resource with resourceId = 111.
		
		
	}

}
