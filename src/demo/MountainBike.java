package demo;

public class MountainBike extends Bicycle{

	public void chainRings() {
		System.out.println("some addition chain rings");
	}
public static void main(String []args) {
		
	MountainBike mb=new MountainBike();
		
	mb.chainRings();
		
		mb.currentGear();
		mb.currentPedal();
		mb.currentSpeed();
	}
}
