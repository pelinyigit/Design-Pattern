import java.util.ArrayList;

// Element for VisitorPattern
// super class 
//Subject for Observer
//Target for AdapterPattern 
//AbstractFactory main class 
abstract public class Cattle {
	// Visitor pattern Concrete Element Methods
	
	abstract public Veterinary doVaccination(Veterinary vac);
	abstract public FoodAgricultureLivestock checkID(FoodAgricultureLivestock id);
	public Cattle cattle;
	public abstract void Accept(Ministry ministry);
	// Adapter method
	abstract public void Signals();
	// Abstract Factory's methods 
	abstract public Protein Create_Protein();
	abstract public Carbonhydrate Create_Carbonhydrate();

	
	// Observer pattern subject method
	public void Location(String a) { 
		a= "cattle out of farm";
		
		if(cattle.equals(a)) {
			System.out.println("Cattle is out of farm boundries");
		} else {
			System.out.println("Cattle is inside of the farm");
		}
	}
	
	public void Attach (Device device) {
		devices.add(device);
	}
	//Cattle constructor
	public Cattle(Cattle cattle) {
		this.cattle = cattle;
	}
	// Concrete element1 for visitorPat
	// Concrete Subjet 1 
	// Adapter
	//Concrete Factory 1
	class Milk_Cattle extends Cattle {
		

		public Milk_Cattle(Cattle cattle) {
			super(cattle);
			// TODO Auto-generated constructor stub
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

		
		// Adapter Method
		@Override
		public void Signals() {
			if(ZigbeeCattle == true && BluetoothCattle == false) {
				System.out.println("Zigbee Signal Has Been Detected!");
			} else if(BluetoothCattle == true && ZigbeeCattle == false){
				System.out.println("Bluetooth Signal Has Been Detected!");
			} else {
				System.out.println("Wrong Signal Has Been Detected!");
			}
		}

		@Override
		public void Accept(Ministry ministry) {
			// TODO Auto-generated method stub
			
		}
		// Visitor pattern methods
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
	// Concrete element2 for visitorPat
	// Concrete Subjet 2 
	//Adapter
	//Concrete Factory 2
	class Beef_Cattle extends Cattle {

		public Beef_Cattle(Cattle cattle) {
			super(cattle);
			// TODO Auto-generated constructor stub
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
		
		// Adapter Method
		@Override
		public void Signals() {
			if(ZigbeeCattle == true && BluetoothCattle == false) {
				System.out.println("Zigbee Signal Has Been Detected!");
			} else if(BluetoothCattle == true && ZigbeeCattle == false){
				System.out.println("Bluetooth Signal Has Been Detected!");
			} else {
				System.out.println("Wrong Signal Has Been Detected!");
			}
			
		}

		@Override
		public void Accept(Ministry ministry) {
			// TODO Auto-generated method stub
			
		}
		//Visitor pattern methods
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

	protected ArrayList<Device> devices = new ArrayList<Device>();
	// Cattle1 = zigbee
	boolean ZigbeeCattle;
	//cattle2 = BT
	boolean BluetoothCattle;
// ---------
}

	// ObjectStructure for Visitor pattern
	class CattleTypes{
		public void Accept(Cattle cattle) {
			
			for (int i = 0; i < cattles.size(); i++) {
				cattles.get(i).Accept(cattle);		}
		}
		private ArrayList<CattleTypes> cattles = new ArrayList<CattleTypes>();
	}
	
	//Observer for ObserverPattern
	abstract class Control {
		
		
	}

	// Concrete Observer for ObserverPattern
	class Device extends Control {
		
	
	private Device device; 
	public Device(Device device) {
		this.setDevice(device);
	}
	public Device getDevice() {
		return device;
	}
	public void setDevice(Device device) {
		this.device = device;
	}
	
}
