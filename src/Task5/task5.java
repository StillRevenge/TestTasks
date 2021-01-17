package Task5;
import java.util.Scanner;

public class task5 {
    public static boolean palidrom(int num) {
        int check = 0, buf;
        int n=num;
        while (num > 0) {
            buf = num % 10;
            check = check* 10 + buf;
            num = num / 10;
        }
        if (check == n){
            return true;}
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int max = 0;
        int count= 0;
        int num;
        System.out.println("Введите количество чисел в последовательности, но не больше 100");
        Scanner in = new Scanner(System.in);
        max = in.nextInt();
        while(max>100)
        {
            System.out.println("Введеное значение больше допустимого");
            max=in.nextInt();
        }
        for(int i=0; i<max;i++)
        {
            num = in.nextInt();
            if(palidrom(num)) {
                count++;
            }
        }
        System.out.println("В этой последовательности "+ count+" палиндромов");
    }
}
