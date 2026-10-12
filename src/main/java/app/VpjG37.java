package app;

import java.util.Scanner;

public class VpjG37 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        upr1_zad2();
    }
    
    static void upr1_zad1() {
        // Аз съм Иван Иванов, фн 12345, и уча програмиране.
        System.out.printf("Аз съм %s, фн %s, и уча %s%n", "Ивайло Танев", "128152", "програмиране");
    }
    
    static void upr1_zad2() {
        //Метод zad_2, който прочита две цели числа, след което извежда сбора им и първото на степен
        //второто чрезMath.pow. Числата се четат с nextLine() и се превръщат с Integer.parseInt. Да се
        //прихваща изключение с try…catch, за да не гърми програмата, ако потребителят напише буква
        //вместо число. Изключението е NumberFormatException; в catch изведете в конзолата разбираемо
        //съобщение
        
        int ch1, ch2;
        
        try {
            ch1 = Integer.parseInt(reader.nextLine());
            ch2 = Integer.parseInt(reader.nextLine());
        } catch(NumberFormatException err) {
            System.out.println("Грешка при въвеждане на числа на нов ред");
            System.out.println(err);
            
            return;
        }
        
        int sbor = ch1 + ch2;
        double stepen = Math.pow(ch1, ch2);
        
        System.out.printf("%d %.0f", sbor, stepen);
    }
}
