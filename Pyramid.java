import java.util.Scanner;
public class Pyramid {
public static void main (String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter the base length of Pyramid : ");
int l = in.nextInt();
System.out.println("Enter the base width of pyramid : ");
int w = in.nextInt();
System.out.println("Enter the base height of Pyramid : ");
int h = in.nextInt();
double volume = l*w*h /2;
System.out.println("Volume of the Pyramid : " +volume);
}
}
