/**
 * 
 */
package hospital;

/**
 * @author Tomas
 *
 */
public class HospitalDirector {

	private HospitalBuilder hospitalBuilder = null;

	public HospitalDirector(HospitalBuilder hospitalBuilder) {
		this.hospitalBuilder = hospitalBuilder;
	}

	public void constructhospital() {
		hospitalBuilder.buildnFloor();
		hospitalBuilder.buildnRoom();
		hospitalBuilder.buildnElevators();
	}

	public Hospital gethospital() {
		return hospitalBuilder.getHospital();
	}
}
