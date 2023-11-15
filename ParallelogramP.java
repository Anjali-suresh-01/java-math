import java.util.Scanner;
public class ParallelogramP {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter the side of the parallelogram : ");
int side = in.nextInt();
System.out.println("Enter the base of the parallelogram : ");
int base = in.nextInt();
int perimeter = 2 * (side + base);
System.out.println(" perimeter of the parallelogram is : " +perimeter);
}
}
