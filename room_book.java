package p3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class room_book
{
public int n1,n2,n3,n4,no1,no2,no3,no4,ch1 ;
public void room_bk() throws IOException 
{
 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Choose Room");
 System.out.println("1.Single Room");
 System.out.println("2.Double Room");
 System.out.println("3.Twin Room");
 System.out.println("4.Deluxe Room");
 ch1 = Integer.parseInt(br.readLine());
 switch(ch1)
{
 case 1: System.out.println("Available Rooms are: 10,15,18,19");
         System.out.println("Cost per Room : 1000");
         System.out.println("Enter Room No:");
         no1 = Integer.parseInt(br.readLine());
         System.out.println("Enter Number of Rooms:");
         n1 = Integer.parseInt(br.readLine());
         System.out.println("Total Cost:" +n1*1000);
         
 break;
 case 2: System.out.println("Available Rooms are: 8,11,13,16");
         System.out.println("Cost per Room : 2000");
         System.out.println("Enter Room No:");
         no2 = Integer.parseInt(br.readLine());
         System.out.println("Enter Number of Rooms:");
         n2 = Integer.parseInt(br.readLine());
         System.out.println("Total Cost:" +n2*2000);
         
 break;
 case 3: System.out.println("Available Rooms are: 5,7,12,20");
         System.out.println("Cost per Room : 3000");
         System.out.println("Enter Room No:");
         no3 = Integer.parseInt(br.readLine());
         System.out.println("Enter Number of Rooms:");
         n3 = Integer.parseInt(br.readLine());
         System.out.println("Total Cost:" +n3*3000);
         
 break;
 case 4: System.out.println("Available Rooms are: 2,4,17,21");
         System.out.println("Cost per Room : 5000");
         System.out.println("Enter Room No:");
         no4 = Integer.parseInt(br.readLine());
         System.out.println("Enter Number of Rooms:");
         n4 = Integer.parseInt(br.readLine());
         System.out.println("Total Cost:" +n4*5000);
         
 break;
}
}
public static void main(String args[]) throws IOException 
{
 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
 room_book rb= new room_book();
 rb.room_bk();
}
}
