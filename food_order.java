package p4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class food_order
{
public void food() throws IOException 
{
 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Menu");
 System.out.println("1.Pasta");
 System.out.println("2.Pizza");
 System.out.println("3.Dosa");
 System.out.println("4.Burger");
 int ch = Integer.parseInt(br.readLine());
 switch(ch)
{
 case 1: System.out.println("You have selected Pasta");
         System.out.println("Cost per Plate : 200");
         System.out.println("Enter Room No:");
         int no1 = Integer.parseInt(br.readLine());
         System.out.println("Enter Quantity:");
         int n1 = Integer.parseInt(br.readLine());
         System.out.println("Total Cost:" +n1*200);
         
 break;
 case 2: System.out.println("You have selected Pizzaa");
         System.out.println("Cost per Plate : 400");
         System.out.println("Enter Room No:");
         int no2 = Integer.parseInt(br.readLine());
         System.out.println("Enter Quantity:");
         int n2 = Integer.parseInt(br.readLine());
         System.out.println("Total Cost:" +n2*400);
         
 break;
 case 3: System.out.println("You have selected Dosa");
         System.out.println("Cost per Plate : 150");
         System.out.println("Enter Room No:");
         int no3 = Integer.parseInt(br.readLine());
         System.out.println("Enter Quantity:");
         int n3 = Integer.parseInt(br.readLine());
         System.out.println("Total Cost:" +n3*150);
         
 break;
 case 4: System.out.println("You have selected Burger");
         System.out.println("Cost per Plate : 250");
         System.out.println("Enter Room No:");
         int no4 = Integer.parseInt(br.readLine());
         System.out.println("Enter Quantity:");
         int n4 = Integer.parseInt(br.readLine());
         System.out.println("Total Cost:" +n4*250);
         
 break;
}
}
public static void main(String args[]) throws IOException 
{
 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
 food_order f= new food_order();
 f.food();
}
}