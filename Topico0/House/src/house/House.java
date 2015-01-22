/**
 * 
 */
package house;

/**
 * @author Tomas Niro
 *
 */
public class House {

	private String floor;
	private String wall;
	private String roof;

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getWall() {
		return wall;
	}

	public void setWall(String wall) {
		this.wall = wall;
	}

	public String getRoof() {
		return roof;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}

	public String toString() {
		return "\n floor: " + floor + "\t wall: " + wall + "\t roof: " + roof;
	}
}
