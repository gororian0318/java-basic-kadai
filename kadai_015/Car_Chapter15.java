package text.kadai_015;

public class Car_Chapter15 {
	
	private int gear = 0;
	private int speed = 0;
	
	public Car_Chapter15( int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	// ギアの値により速度を変える
	public void gearChange( int afterGear ) {
		
		if( ( afterGear < 0 ) || ( afterGear > 5 ) ) {
		return;
		
		}
		
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました" );
		
		int run = this.speed * afterGear;
		System.out.println("速度は時速" + run + "kmです" );
		
		
	}


}
