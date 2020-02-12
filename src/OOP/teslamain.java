package OOP;

public class teslamain {

	public static void main(String[] args) {
	
		tesla tes1=new tesla();
		
		
		tes1.vin=99536;
		tes1.model="Y";
		tes1.price=80000.00;
	    tes1.color="white";
				
	    tes1.display();
	    
		tesla tes2=new tesla();

		tes2.vin=9865566;
		tes2.model="S";
		tes2.price=60000.00;
	    tes2.color="silver";
				
	    tes2.display();
		
		tesla tes3=new tesla();
		
		tes3.vin=9945476;
		tes3.model="X";
		tes3.price=70000.00;
	    tes3.color="red";
				
	    tes3.display();
	    
		tesla tes4=new tesla();
		
		tes4.vin=95471236;
		tes4.model="3";
		tes4.price=750000.00;
	    tes4.color="black";
				
		
	    tes4.display();
	}

}
