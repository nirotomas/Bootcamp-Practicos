/**
 * 
 */
package hospital;

/**
 * @author Tomas Niro
 *
 */
public class Hospital extends Building {

	private String nfloor;
	private String nRoom;
	private String nElevators;

	public String getnFloor() {
		return nfloor;
	}

	public void setnFloor(String nfloor) {
		this.nfloor = nfloor;
	}

	public String getnRoom() {
		return nRoom;
	}

	public void setnRoom(String nRoom) {
		this.nRoom = nRoom;
	}

	public String getnElevators() {
		return nElevators;
	}

	public void setnElevators(String nElevators) {
		this.nElevators = nElevators;
	}

	@Override
	public String wBuild(){
		return "Hospital";
	}
	
	public String toString() {
		return "\n number of floors: " + nfloor + "\t number of rooms: " + nRoom + "\t nElevators: " + nElevators;
	}
	
	
}
