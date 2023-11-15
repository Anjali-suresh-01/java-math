import java.util.Scanner;
public class Sphere {
public static void main (String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter the radius of sphere : ");
int r = in.nextInt();
double volume = 4/3*Math.PI *r*r*r;
System.out.println("Volume of the Sphere : " +volume);
}
}
