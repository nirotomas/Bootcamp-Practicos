/**
 * 
 */
package hospital;

/**
 * @author Tomas
 *
 */
public class BigHospital implements HospitalBuilder {
	private Hospital hospital;

	public BigHospital() {
		hospital = new Hospital();
	}

	@Override
	public void buildnRoom() {
		hospital.setnRoom("100");
	}

	@Override
	public void buildnFloor() {
		hospital.setnFloor("4");
	}

	@Override
	public void buildnElevators() {
		hospital.setnElevators("3");
	}

	@Override
	public Hospital getHospital() {
		return hospital;
	}
}
