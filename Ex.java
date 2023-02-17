import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("nhap vao ho va ten: ");
        String name = x.nextLine();

        System.out.println("nhap ma sinh vien: ");
        String id = x.nextLine();

        System.out.println("ten cua ban la: "+name);
        System.out.println("mssv: "+id);
    }
}
