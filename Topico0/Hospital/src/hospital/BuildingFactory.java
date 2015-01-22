package hospital;

public class BuildingFactory {

	public Building getBuilding(String type){
		
		if ("House".equals(type))
			return new Hospital();
		/*else if ("House".equals(type))
			return new House();*/
		else return null;
	}
	
}
