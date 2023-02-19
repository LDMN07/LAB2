import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        
        while (option != 4) {
            System.out.println("Menu:");
            System.out.println("1. Giai phuong trinh bac nhat");
            System.out.println("2. Giai phuong trinh bac 2");
            System.out.println("3. Tinh tien dien");
            System.out.println("4. Thoat chuong trinh");
            System.out.print("Chon chuc nang (1-4): ");
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println("Chon giai phuong trinh bac nhat");
                    break;
                case 2:
                    System.out.println("Cho giai phuong trinh bac 2");
                    break;
                case 3:
                    System.out.println("Chon tinh tien dien");
                    break;
                case 4:
                    System.out.println("Chon thoat chuong trinh");
                    break;
                default:
                    System.out.println("Nhap sai");
                    break;
            }
        }
        
        scanner.close();
    }
}
