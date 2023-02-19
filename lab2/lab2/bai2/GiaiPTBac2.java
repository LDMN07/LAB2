import java.util.Scanner;

public class GiaiPTBac2 {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh ax^2 + bx + c = 0");

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap he so a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap he so  b: ");
        double b = sc.nextDouble();

        System.out.print("Nhap he so  c: ");
        double c = sc.nextDouble();

        double delta = b*b - 4*a*c;

        if (delta < 0) {
            System.out.println("phuong trinh vo nghiem.");
        } else if (delta == 0) {
            double x = -b / (2*a);
            System.out.println("phuong trinh co nghiem kep x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("phuong trinh co hai nghiem phan biet:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        sc.close();
    }
}