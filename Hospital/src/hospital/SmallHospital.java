/**
 * 
 */
package hospital;

/**
 * @author Tomas
 *
 */
public class SmallHospital implements HospitalBuilder {
	private Hospital hospital;

	public SmallHospital() {
		hospital = new Hospital();
	}

	@Override
	public void buildnRoom() {
		hospital.setnRoom("50");
	}

	@Override
	public void buildnFloor() {
		hospital.setnFloor("2");
	}

	@Override
	public void buildnElevators() {
		hospital.setnElevators("1");
	}

	@Override
	public Hospital getHospital() {
		return hospital;
	}
}
