package session2;

import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("1.Fahrenheit to Celsius");
        System.out.println("2.Celsius to Fahrenheit");
        System.out.println("0.Exit ");
        System.out.println("Enter your choice: ");
        while (true){
        int choice = input.nextInt();
        switch (choice){
            case 1: FahrenheittoCelsius();
                break;
            case 2: CelsiustoFahrenheit();
                break;
            case 0 : System.exit(0);
        }
    }
}

    public static void FahrenheittoCelsius () {
        Scanner inputTemp1 = new Scanner(System.in);
        System.out.println("Nhập độ F cần đổi sang độ C: ");
        double fa = inputTemp1.nextDouble();
        double ce = (5/9) * (fa - 32);
        System.out.println(+fa + "độ F bằng " + ce + " độ C");
    }

    public static void CelsiustoFahrenheit () {
        Scanner inputTemp2 = new Scanner(System.in);
        System.out.println("Nhập độ C cần đổi sang độ F: ");
        double ce = inputTemp2.nextDouble();
        double fa = (ce*9)/5  + 32;
        System.out.println(+ce + "độ C bằng " + fa + " độ F");
    }
}