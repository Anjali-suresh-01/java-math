import java.util.Scanner;
public class Cylindercsa {
public static void main (String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Radius of Cylinder : ");
int r = in.nextInt();
System.out.println("height of the Cylinder : " );
int h = in.nextInt();
double volume =  2* Math.PI *r*h;
System.out.println("Volume of the Cylinder : " +volume);
}
}
