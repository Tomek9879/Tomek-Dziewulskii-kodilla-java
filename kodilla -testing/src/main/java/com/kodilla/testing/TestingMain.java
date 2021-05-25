package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
public class TestingMain {

    public static void main (String [] args ){

        Calculator calculator = new Calculator();
        int liczba1=3;
        int liczba2=4;
        int liczba3=10;
        int liczba4=4;
        // test dodawania liczb
        int wynik = calculator.add(liczba1,liczba2);
        if(wynik ==(liczba1+liczba2))
            System.out.println("Wynik  dodawania liczb:"+liczba1+" i "+liczba2+" jest prawidłowy i wynosi "+wynik);
        else
            System.out.println("Wynik  dodawania liczb:"+liczba1+" i "+liczba2+" jest nieprawidłowy i wynosi "+wynik);

        // test odejmowania liczb
        wynik=calculator.subtract (liczba3,liczba4);
        if(wynik==(liczba3-liczba4))
            System.out.println("Wynik  odejmowania liczb:"+liczba3+" i "+liczba4+" jest prawidłowy i wynosi "+wynik);
        else
            System.out.println("Wynik  odejmowania liczb:"+liczba3+" i "+liczba4+" jest nieprawidłowy i wynosi "+wynik);



    }
}
