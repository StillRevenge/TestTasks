package Task1;

import java.util.Scanner;

public class Task1 {
    public static void provChet(double a) // проверка числа, является ли оно четным или нет
    {
        if(a%2==0)
        {
            System.out.println("chetnoe");
        }
        else { System.out.println("nechetnoe");}
        return;
    }

    public static boolean checkString(String CheckStr) // проверка строки, является ли она числом или просто символами
    {
        boolean rez = true;
        String CheckStr1=CheckStr.replaceAll(",", ".");
        try {
            Double.parseDouble(CheckStr1);
        } catch (Exception e) {
            rez=false;
        }
        return rez;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        String inputString = in.nextLine();
        double i = 0;
        if(checkString(inputString)){
            inputString = inputString.replaceAll(",", ".");
            i = Double.parseDouble(inputString);
        }
        else {
            System.out.println("это не число");
            return;
        }
        if(i%1==0)
        {
            System.out.println("целое");
        }
        else {System.out.println("вы ввели не целое число");
            return;}
        provChet(i);

    }
}
