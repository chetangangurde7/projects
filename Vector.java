import java.util.Vector;
class Vec
{
public static void main(String [] args)
{
Vector v=new Vector(10);
v.add("C programming");
v.add("C++");
v.add("JAVA");
v.add("HTML");
System.out.println("size is:"+v.size());
System.out.println("Initial Capacity:"+v.capacity());
v.addElement("Data Structure");
v.addElement("Phython");
System.out.println("After adding element size is:"+v.size());
v.removeElementAt(3);
System.out.println("Vector Size is:"+v.size());
System.out.println("Elements:"+v);
}
}
