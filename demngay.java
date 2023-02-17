
import java.util.Scanner;

public class demngay {
    public static void main(String[] args) {
        int month, year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month");
        month = sc.nextInt();
        while (month <= 0 || month > 12) {
            System.out.println("Enter again month");
            month = sc.nextInt();
        }

        System.out.println("Enter year");
        year = sc.nextInt();
        while (year <= 2022) {
            System.out.println("Enter again year");
            year = sc.nextInt();
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    System.out.println("29 days");
                }
                else{
                    System.out.println("28 days");
                }
                break;
            default:
                break;
        }
    }
}