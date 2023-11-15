import java.util.Scanner;
public class prism {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter the length of the prism : ");
double l = in.nextDouble();
System.out.println("Enter the breadth of the prism : ");
double b = in.nextDouble();
System.out.println("Enter the height of the prism : ");
double h = in.nextDouble();
double volume = l*b*h;
System.out.println("Volume of the Prism is : " +volume);
}
}
