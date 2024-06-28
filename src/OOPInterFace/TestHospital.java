package OOPInterFace;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.physioServices();
		fh.physioServices(10);
		fh.dentalServices();
		fh.gastroServices();
		fh.gynecServices();
		fh.nuroServices();
		fh.emergencyServices();
		
		fh.medicalTrainingServices();
		
		fh.pediaServices();
		fh.pathologyServices();
		
		System.out.println(USMedical.MIN_FEE);// 10
		//USMedical.MIN_FEE = 100;can not be done because it is final in nature so can not modify
		//System.out.println(FortisHospital.MIN_FEE);//10// can be call it by class name
		System.out.println(fh.MIN_FEE);// 50 updated value
		
		// top casting: means child class object can be refrred by parents interface referrence variable
		 USMedical.billing();// USMedical---billing
		 FortisHospital.billing();
		 fh.helpDesk();// US-- helpDesk
		 fh.CovidVaccin();
		 
		 // WHO-> can access parent class
		 fh.medicalNews();
		 fh.medicalRnD();
		
	 USMedical us = new FortisHospital();
		us.oncologyServices();
		
		us.dentalServices();
		us.emergencyServices();
		
	// down casting is not allowed in the interface. Down casting is oppsit to topcasting.	
		
	//FortisHospital f = new USMedical ();

	}

}
