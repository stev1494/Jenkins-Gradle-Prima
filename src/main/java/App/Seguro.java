package App;


public class Seguro {
	
	public static double calculatePrimaValue(double basicRate, 
			double ageFactor, 
			int safeDriverReduction) {
		return basicRate*ageFactor-safeDriverReduction;
	}
	

	public static double ageFactor(Conductor driver) {
		int age = driver.getAge();
		if(age >= 18 && age < 25) return 2.8;
		else if(age >= 25 && age < 35) return 1.8;
		else if(age >= 35 && age < 45) return 1.0;
		else if(age >= 45 && age < 65) return 0.8;
		else if(age >= 65 && age <= 90) return 1.5;
		else return 0;
	}
	
	public static int pointsCanLose(double ageFactor) {
		if(ageFactor == 2.8) return 1;
		else if(ageFactor == 1.8) return 3;
		else if(ageFactor == 1.0) return 5;
		else if(ageFactor == 0.8) return 7;
		else if(ageFactor == 1.5) return 5;
		else return 0;
	}
	
	public static int safeDriverReduction(Conductor driver) {
		double ageFactor = ageFactor(driver);
		int licensePoints = driver.getLicensePoints();
		if(licensePoints <= 0) {
			return -1;
		}
		if(licensePoints > 30) {
			return 1;
		}
		int pointsCanLose = pointsCanLose(ageFactor);
		if(ageFactor == 2.8 && 30 - licensePoints <= pointsCanLose) return 50; 
		else if(ageFactor == 1.8 && 30 - licensePoints <= pointsCanLose) return 50;
		else if(ageFactor == 1.0 && 30 - licensePoints <= pointsCanLose) return 100;
		else if(ageFactor == 0.8 && 30 - licensePoints <= pointsCanLose) return 150;
		else if(ageFactor == 1.5 && 30 - licensePoints <= pointsCanLose) return 200;
		else return 0;
	}
}
