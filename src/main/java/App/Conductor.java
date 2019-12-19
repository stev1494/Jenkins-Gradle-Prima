package App;

public class Conductor {

	private int age;
	private int licensePoints;
	
	public Conductor() {}
	
	public Conductor(int age, int licensePoints) {
		this.age = age;
		this.licensePoints = licensePoints;
	}

	public int getAge() {
		return age;
	}

	public int getLicensePoints() {
		return licensePoints;
	}

	public void setLicensePoints(int licensePoints) {
		this.licensePoints = licensePoints;
	}
	
}
