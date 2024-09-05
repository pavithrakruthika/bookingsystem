package javaclass;
import java.util.Scanner;

public class ticketbooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		String moviename[]= new String[2];
		int price[]=new int[2];
		String row1[]=new String[6];
		String row2[]=new String[6];
		int spos[]=new int[6];
		int i,p=0,count=0,cost=0,n=0,a=0;
		String m;
		//adminwork
		System.out.println("MOVIES");
		for(i=0;i<moviename.length;i++){
			moviename[i]=obj.next();
              
		}
		System.out.println("PRICE");
		for(i=0;i<price.length;i++) {
			price[i]=obj.nextInt();	
		}
		System.out.println("ROW1");
		for(i=0;i<row1.length;i++) {
			row1[i]=obj.next();
		}
		System.out.println("ROW2");
		for(i=0;i<row2.length;i++) {
			row2[i]=obj.next();
		}
		//coustemer
		System.out.println("enter the movie name");
		m=obj.next();
		for(i=0;i<moviename.length;i++) {
			if(m.equals(moviename[i])) {
				System.out.println(m);
				//System.out.println(i);
				p=i;
			}
		}
		System.out.println("price:"+price[p]);
		cost=price[p];
		System.out.println("number of tickets:");
		count=obj.nextInt();
		System.out.println("row");
		n=obj.nextInt();
		if(n==1) {
		for(i=0;i<row1.length;i++) {
			System.out.println(row1[i]);
		}
		System.out.println("enter the seats:");
		for(i=0;i<count;i++) {
			spos[i]=obj.nextInt();
			a=spos[i];
			row1[a-1]="blocked";
			
		}
		}
		if(n==2) {
			for(i=0;i<row2.length;i++) {
				System.out.println(row2[i]);
			}
			
			for(i=0;i<count;i++) {
				spos[i]=obj.nextInt();
				a=spos[i];
				row2[a-1]="blocked";

		}
		}
		for(i=0;i<row1.length;i++) {
			System.out.println(row1[i]);
		}
		for(i=0;i<row2.length;i++) {
			System.out.println(row2[i]);
		}
		System.out.println("TOTAL AMOUNT");
		cost=cost*count;
		System.out.println(cost);
	}

}
