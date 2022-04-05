import java.util.Date;

public class Bank_details {
	private String ac_type;
	private String name;
	private String address;
	private float bal;
	private String status;
	public int date;
	
	public String getAc_type() {
		return ac_type;
	}
	public void setAc_type(String ac_type) {
		this.ac_type = ac_type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getBal() {
		return bal;
	}
	public void setBal(float bal) {
		this.bal = bal;
	}
	public String getStatus() {
		return status;
	}public void setStatus(String status) {
this.status=status;
		
	}
	
	public void deposite(float d) {
		bal+=d;
		System.out.println(name+ " has Rs" +bal);
	}
	public void withdraw(float amt) {
		if(amt<=bal) {
		bal-=amt;
		System.out.println(name+ " has Rs" +bal);
		}else {
			System.out.println( "Withdraw by" +name+ "fails");
		}
	}
	public void display() {
		System.out.println("ac_type :" +ac_type+ "name: " +name+ "address:"+address+ "bal:"+bal+   "\nstatus:"+status);
		System.out.println("\n");

	Date date=new Date();
	System.out.println("create date"+date);
	System.out.println("\n");
}
}

