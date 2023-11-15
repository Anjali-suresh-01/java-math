import java.util.Scanner;
public class Cone {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter radius of the cone : ");
int r = input.nextInt();
System.out.println("Enter the height of the cone : ");
int h = input.nextInt();
double volume = Math.PI *r*r*h/3;
System.out.println("Volume Of The Cone is : " +volume);
}
}
