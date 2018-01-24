package demo;

public class TandemBike extends Bicycle{
	
	public void seat1() {
		System.out.println("Seat 1");
	}
	public void seat2() {
		System.out.println("Seat 2");
	}
	public void handleBar1() {
		System.out.println("set of handle bar 1");
	}
	public void handleBar2() {
		System.out.println("set of handle bar 2");
	}
	public static void main(String []args) {
		
		TandemBike tb=new TandemBike();
		tb.seat1();
		tb.seat2();
		tb.handleBar1();
		tb.handleBar2();
		tb.currentGear();
		tb.currentPedal();
		tb.currentSpeed();
	}
}
