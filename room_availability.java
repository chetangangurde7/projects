package p2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class room_availability
{
public void room_avb() throws IOException 
{
 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Choose Room");
 System.out.println("1.Single Room");
 System.out.println("2.Double Room");
 System.out.println("3.Twin Room");
 System.out.println("4.Deluxe Room");
 int ch = Integer.parseInt(br.readLine());
 switch(ch)
{
 case 1: System.out.println("Available Rooms are: 10,15,18,19");
 break;
 case 2: System.out.println("Available Rooms are: 8,11,13,16");
 break;
 case 3: System.out.println("Available Rooms are: 5,7,12,20");
 break;
 case 4: System.out.println("Available Rooms are: 2,4,17,21");
 break;
}
}
 public static void main(String args[]) throws IOException 
{
 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
 room_availability r= new room_availability();
 r.room_avb();
}
}