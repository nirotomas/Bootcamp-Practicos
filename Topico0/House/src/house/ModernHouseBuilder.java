/**
 * 
 */
package house;

/**
 * @author Tomas
 *
 */
public class ModernHouseBuilder implements HouseBuilder{

	private House house;
	
	public ModernHouseBuilder() {
		house = new House();
	}

	@Override
	public void buildFloor() {
		house.setFloor("Engineered Wood");
	}

	@Override
	public void buildWall() {
		house.setWall("brick wall");
	}

	@Override
	public void buildRoof() {
		house.setRoof("solar shingle");
	}

	@Override
	public House getHouse() {
		return house;
	}

}
