import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("nhap so: ");
        int a = x.nextInt();

        String result = (a%2==0)?"so chan":"so le";
        System.out.println(result);

        if(a%2==0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }
}
