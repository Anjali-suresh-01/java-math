import java.util.Scanner;
public class AreaIT {
public static void main (String[] args) {
Scanner input = new Scanner (System.in);
System.out.println("Enter the base height : ");
int base = input.nextInt();
System.out.println("Enter the height : ");
int height = input.nextInt();
double Area = base*height/2;
System.out.println("Area of the Isoceles Triangle :" +Area);
}
}
