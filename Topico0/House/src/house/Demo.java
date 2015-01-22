/**
 * 
 */
package house;

/**
 * @author Tomas
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Using Builder Design Pattern
		
		HouseBuilder houseBuilder = new CabinHouseBuilder();
		HouseDirector houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		House house = houseDirector.getHouse(); // how does it works?
		System.out.println("Cabin house "+ house);
		
		houseBuilder = new ModernHouseBuilder();
		houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		house = houseDirector.getHouse(); // how does it works?
		System.out.println("\nModern House "+ house);
				
	}

}
