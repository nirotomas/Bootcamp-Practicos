/**
 * 
 */
package hospital;



/**
 * @author Tomas
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Using Factory Design Pattern, so if we want to build a house, the parameter is "house"
		BuildingFactory buildingFactory = new BuildingFactory();
		Building hospital = buildingFactory.getBuilding("hospital");
		
		//Using Builder Design Pattern
		HospitalBuilder hospitalBuilder = new BigHospital();
		HospitalDirector hospitalDirector = new HospitalDirector(hospitalBuilder);
		hospitalDirector.constructhospital();
		hospital = hospitalDirector.gethospital(); // how does it works?
		System.out.println("Big hospital "+ hospital);
		
		hospitalBuilder = new SmallHospital();
		hospitalDirector = new HospitalDirector(hospitalBuilder);
		hospitalDirector.constructhospital();
		hospital = hospitalDirector.gethospital(); // how does it works?
		System.out.println("\nSmall hospital "+ hospital);
				
	}

}
