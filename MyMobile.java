package week1.day2;

public class MyMobile {
public void makecall() {
System.out.println("call connected");
}
public void sendmsg() {
	System.out.println("message sent");
}
private void paybills() {
	System.out.println("bills paid");

}
	public static void main(String[] args) {
		MyMobile mm= new MyMobile();
		mm.makecall();
		mm.sendmsg();
		mm.paybills();
	}

}
