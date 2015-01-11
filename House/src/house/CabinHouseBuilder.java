/**
 * 
 */
package house;

/**
 * @author Tomas
 *
 */
public class CabinHouseBuilder implements HouseBuilder {
	private House house;

	public CabinHouseBuilder() {
		house = new House();
	}

	@Override
	public void buildFloor() {
		house.setFloor("slab");
	}

	@Override
	public void buildWall() {
		house.setWall("wood wall");
	}

	@Override
	public void buildRoof() {
		house.setRoof("wood roof");
	}

	@Override
	public House getHouse() {
		return house;
	}
}
