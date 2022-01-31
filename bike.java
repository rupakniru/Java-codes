package rupak;
interface bike1{
	public void throttle();
}
public class bike implements bike1{
   
	private int gear;
	private int speed;
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void run()
	{
		System.out.println("i'm bike");
	}
	public void throttle()
	{
		System.out.println(10);
	}
	
}
