
public class Bank_data {

	public static void main(String[] args) {
	Bank_details b1=new Bank_details();
	b1.setAc_type("Savings Account \n");
	b1.setName("Misba\n");
	b1.setAddress("Jayanagar 1st Block Bangalore-560011 \n");
	b1.setBal(5000);
    b1.setStatus("\nActive\n");
	b1.display();
    b1.deposite(600);
    b1.withdraw(500);
	}

}
