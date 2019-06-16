// Visitor for visitor pattern
abstract class Ministry {
	abstract public void Visit(FoodAgricultureLivestock spring);
	abstract public void Visit(Veterinary autumn);	
	
}


// Concrete visitor1 for Visitor Pattern
class FoodAgricultureLivestock extends Cattle {
	public boolean ID;
	
	//Concrete Visitor takes a method from it's abstract class

	//Constructor
	public FoodAgricultureLivestock(Cattle cattle) {
		super(cattle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Signals() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Protein Create_Protein() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Carbonhydrate Create_Carbonhydrate() {
		// TODO Auto-generated method stub
		return null;
	}

	public void Accept(Ministry ministry) {
		// TODO Auto-generated method stub
		
	}
	//Visitor element methods
	@Override
	public Veterinary doVaccination(Veterinary vac) {
		System.out.println("Vaccination has been done to cattles.");
		return vac;
	}

	@Override
	public FoodAgricultureLivestock checkID(FoodAgricultureLivestock id) {
		System.out.println("ID has been checked.");
		return id;
	} 
	
	
}

//Concrete visitor2 for Visitor Pattern
class Veterinary extends Cattle{
	public boolean vaccination;
	
	//Constructor
	public Veterinary(Cattle cattle) {
		super(cattle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Signals() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Protein Create_Protein() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Carbonhydrate Create_Carbonhydrate() {
		// TODO Auto-generated method stub
		return null;
	}


	public void Accept(Ministry ministry) {
		// TODO Auto-generated method stub
		
	}
	//Visitor element methods
	@Override
	public Veterinary doVaccination(Veterinary vac) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FoodAgricultureLivestock checkID(FoodAgricultureLivestock id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class VisitorPattern{
	 public static void main(String[] args) {
		
		 CattleTypes c = new CattleTypes();
		 c.Accept(new Veterinary(null));
		 c.Accept(new FoodAgricultureLivestock(null));
		 
	}
}















