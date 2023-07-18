package p1;
import p2.*;
import p3.*;
import p4.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

public class hotel_login
{
public void hotel_lgn() throws IOException 
{
 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

System.out.println("----------------------------------------------------------------");
System.out.println("Welcome to Hotel Reservation System");
System.out.println("----------------------------------------------------------------");

System.out.println("--Please log in to the system--");
System.out.println("");

try
{
String user="admin";
String pass="123";
System.out.println("Enter Username:");
String username = br.readLine();
System.out.println("");
System.out.println("Enter Password:");
String password = br.readLine();

if(username.equals(user) && password.equals(pass))
{
  System.out.println("\n--Access Granted! Welcome!--");
}
else
{
 System.out.println("Access Denied! Invalid username or password");
}
}
catch(Exception e)
{
 System.out.println("Not a valid input");
}
}
 public static void main(String args[]) throws IOException 
{
String cn = "yes";
 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
 hotel_login h = new hotel_login();
 h.hotel_lgn();
do
{
System.out.println("Choose Option:");
System.out.println("a.Book Room");
System.out.println("b.Check Room Availability");
System.out.println("c.Order Food");
char ch = (char)br.read();
switch (ch)
{ 
case 'a': System.out.println("1.Book Room");
        room_book rb= new room_book();
        rb.room_bk();
        break;
case 'b': System.out.println("2.Check Room Availability");
        room_availability r= new room_availability();
        r.room_avb();
        break;
case 'c': System.out.println("3.Order Food");
        food_order f= new food_order();
        f.food();
        break;

}

System.out.println("Do You want to Continue(1.yes/2.no):");
cn = br.readLine();
}while(cn == "yes");

}
}




