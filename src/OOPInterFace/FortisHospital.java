package OOPInterFace;

//Fortis hospital is child to US medical and have to use interfare key word and that is 'implements'
// Have to add un implemented method
// We can have one parent class but multiple parent interfaces : Hospital is the only parent class here
public class FortisHospital extends Hospital implements USMedical, UKMedical, IndianMedical{

	int MIN_FEE = 50;
	// static final int MIN_FEE = 50; // bedafault its final 
	
 //USmedical
	@Override
	public void physoServices() {
		System.out.println("FH-- physioservices");
		
	}
	// over loaded
	@Override
	public void physioServices(int a) {		
		System.out.println("FH-- physioservices" + a);
	}
	@Override
	public void oncologyServices() {
		System.out.println("FH-- oncologyervices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("FH-- dentalservices");
		
	}
// UKMedical
	@Override
	public void gynecServices() {
		System.out.println("FH-- gynecservices");
		
	}

	@Override
	public void gastroServices() {
		System.out.println("FH-- gastroservices");
		
	}
	// IndianMedical
	@Override
	public void pediaServices() {
		System.out.println("FH-- pediaservices");
		
	}

	@Override
	public void nuroServices() {
		System.out.println("FH-- nuroservices");
		
		// CommonMethod
	}

	@Override
	public void emergencyServices() {
		
		System.out.println("FH-- emergencyServices");
	}
	
	// individual method
	
public void medicalTrainingServices() {
		
		System.out.println("FH-- medicalTrainingServices");
	}
public void pathologyServices() {
	
	System.out.println("FH-- pathologyServices");
}
@Override
public void physioServices() {
	
	
}


// method hiding
public static void billing() {
	System.out.println("fh--billing");	
	}
//@Override
//
public void helpDesk() {
	System.out.println("fh-- helpDesk"); // instead of default have to write public
}

// WHO -> grandparent
@Override
public void CovidVaccin() {
System.out.println("fh--CovidVaccin");
	
}
// Hospital Class-> can be override
@Override
public void medicalRnD() {
	System.out.println("FH --medicalRnD");
}





}
