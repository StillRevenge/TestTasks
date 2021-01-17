package Task2;

import java.util.Scanner;

public class Task2 {
    public static boolean checkString(String CheckStr) // проверка строки, является ли она числом или просто символами
    {
        boolean rez = true;
        String CheckStr1 = CheckStr.replaceAll(",", ".");
        try {
            Double.parseDouble(CheckStr1);
        } catch (Exception e) {
            rez = false;
        }
        return rez;
    }

    public static double nod(double a, double b)//ищем нод чисел по теореме Эвклида
    {
        while ((a!=0)&(b!=0))
        {
            if(a>b)
                a=a%b;
            else
                b=b%a;
        }
        return a+b;
    }

    public static double lcm(double a, double b)//находим НОК
    {
        return a/nod(a,b)*b;
    }

    public static void main(String[] args){
        String firstNum, secondNum;
        System.out.println("Введите 2 целых числа");
        Scanner in = new Scanner(System.in);
        firstNum = in.nextLine();
        double first, second;
        if(checkString(firstNum))
        {
            firstNum = firstNum.replaceAll(",", ".");
            first = Double.parseDouble(firstNum);
        }
        else {
            System.out.println("введено некоректное число");
            return;
        }
        if(first%1==0)//проверка является ли первое число целым
        {
            System.out.println("корректное число");
        }
        else {
            System.out.println("некорректное");
        }
        secondNum = in.nextLine();
        if(checkString(firstNum))
        {
            secondNum = secondNum.replaceAll(",", ".");
            second = Double.parseDouble(secondNum);
        }
        else {
            System.out.println("введено некоректное число");
            return;
        }
        if(second%1==0)//является ли второе число целым
        {
            System.out.println("корректное число");
        }
        else {
            System.out.println("некорректное");
            return;
        }
        System.out.print("НОД чисел = ");
        System.out.printf("%.0f", nod(first,second));
        System.out.println();
        System.out.print("НОК чисел = ");
        System.out.printf("%.0f",  lcm(first,second));
    }
}
