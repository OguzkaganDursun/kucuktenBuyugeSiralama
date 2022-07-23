import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenler tanimlandi.
        int s1,s2,s3;
        //  3  5  4
        //Kullanicidan veriler alindi.
        Scanner scan = new Scanner(System.in);

        System.out.print("1. Sayiyi Giriniz : ");
        s1 = scan.nextInt();

        System.out.print("2. Sayiyi Giriniz : ");
        s2 = scan.nextInt();

        System.out.print("3. Sayiyi Giriniz : ");
        s3 = scan.nextInt();

        if ((s1 < s2) && (s1 < s3))
        {
            if (s2 < s3)
            {
                System.out.println("---------------------------");
                System.out.println(s1 + "<" + s2 + "<" + s3 );
            }
            else
            {
                System.out.println("---------------------------");
                System.out.println(s1 + "<" + s3 + "<" + s2 );
            }
        }
        else if ((s2 < s1) && (s2 < s3))
        {
            if (s1 < s3)
            {
                System.out.println("---------------------------");
                System.out.println(s2 + "<" + s1 + "<" + s3 );
            }
            else
            {
                System.out.println("---------------------------");
                System.out.println(s2 + "<" + s3 + "<" + s1 );
            }
        }
        else if ((s3 < s1) && (s3 < s2))
        {
            if (s1 < s2)
            {
                System.out.println("---------------------------");
                System.out.println(s3 + "<" + s1 + "<" + s2 );
            }
            else
            {
                System.out.println("---------------------------");
                System.out.println(s3 + "<" + s2 + "<" + s1 );
            }
        }
        else
        {
            System.out.println("---------------------------");
            System.out.println("Girilen Sayilar Birbirinden Farkli Olmalidir.");
        }
    }
}
