import java.util.Scanner;
public class Areac {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the radius : ");
double radius = input.nextDouble();
double area = Math.PI *radius*radius;
System.out.println("The Area of the Circle is : " +area);
}
}

