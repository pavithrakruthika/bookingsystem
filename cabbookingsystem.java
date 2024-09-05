package javaclass;
import java.util.*;
class userdetails{
	String name;
	long phonenumber;
	void userd(){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your Name:");
		name=obj.next();
		System.out.println("Enter your phone number:");
		phonenumber=obj.nextLong();
		System.out.println("BOOK YOUR RIDE");
	}
}
class bookingportal extends userdetails{
	String sp,ep;int choice1,choice2,otp,randomnum; double totalkm,price;
	void bookingdetails() {
		Scanner obj=new Scanner (System.in);
		System.out.println("ENTER RIDING DETAILS");
		System.out.println("choice1= Access my current location");
		System.out.println("choice2=enter the location of pickup");
		System.out.println("Enter the choice:");
		choice1=obj.nextInt();
		if(choice1==1) {
			System.out.println("Access my current location");
		}
		if(choice1==2) {
			System.out.println("enter the pickup location:");
			sp=obj.next();
		}
		System.out.println("enter the drop location:");
		ep=obj.next();
		System.out.println("total distance:");
		totalkm=obj.nextDouble();
		System.out.println("SELECT THE MODE OF RIDING");
		System.out.println("choice1: CAB");
		System.out.println("choice2: AUTO");
		System.out.println("choice3: BIKE");
		choice2=obj.nextInt();
		if(choice2==1) {
			System.out.println("CAB");
	        price=totalkm*10;
	        System.out.println("total price:"+price);
	        
		}
		if(choice2==2) {
			System.out.println("AUTO");
			 price=totalkm*7;
			System.out.println("total price:"+price);
			
		}
		if(choice2==3) {
			System.out.println("BIKE");
			 price=totalkm*5;
			System.out.println("total price:"+price);
			
		}
		System.out.println("your otp :");
		Random random=new Random(1000);
		randomnum=random.nextInt(1000);
		System.out.println(+randomnum);
		
		System.out.println("thanks for selecting");
	}
	
}

class conformation extends bookingportal{
	void conform() {
		System.out.println("USER CONFORMATION");
		int c,randomnum;
		Scanner obj=new Scanner (System.in);
		System.out.println("total KMs:"+totalkm);
		System.out.println("total price:"+price);
		System.out.println("CAN CONFRIM BOOKING: YES/NO");
		c=obj.nextInt();
		if(c==1) {
			System.out.println("booking confirmed");
			 price=totalkm*10;
			 Random random=new Random(1000);
			 randomnum=random.nextInt(1000);

			 System.out.println("your vehicle number:"+randomnum);
		    System.out.println("OTP is sent to the registered mobile number");
		    System.out.println("Enter the OTP:");
		    otp=obj.nextInt();
		    System.out.println("OTP is confirmed!! Enjoy your journey");
		}
		if(c==2) {
			System.out.println("Booking cancled");
		}
		
	}
}


public class cabbookingsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
       conformation c=new conformation();
       c.userd();
       c.bookingdetails();
       c.conform();
       
	}

}
