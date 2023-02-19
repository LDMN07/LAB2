import java.util.Scanner;
public class tinhtiendien {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so dien su dung trong thang: ");
        int soDien = scanner.nextInt();
        
        int tien;
        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }
        
        System.out.println("so tien dien phai tra la: " + tien + "dong");
    }
}


