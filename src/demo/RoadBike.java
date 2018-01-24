package demo;

public class RoadBike extends Bicycle {

	public void dropHandleBAr() {
		System.out.println("drop handle bar");
	}
	
	public static void main(String []args) {
		
		RoadBike rb=new RoadBike();
		
		rb.dropHandleBAr();
		
		rb.currentGear();
		rb.currentPedal();
		rb.currentSpeed();
	}
}
