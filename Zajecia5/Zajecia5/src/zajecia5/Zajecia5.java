/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajecia5;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 *
 * @author Student
 */
public class Zajecia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestInterface x = (a, b) -> {return a + b;};
        
       UnaryOperator<Integer> un = (a) -> {return a + 1;};
       BinaryOperator<Integer> bin = (a, b) -> {return a + b;};
       Consumer<Integer> con = (a) -> { System.out.println(a);};
       Supplier<Integer> supp = () -> { return 5;};
       Function<Integer, String> func = (a) -> {return "a";};
       Predicate<Integer> pred = (a) -> {return true;};
       
       BinaryOperator<Integer> dodaj = (a, b) -> {return a + b;};
       BinaryOperator<Integer> odejmij = (a, b) -> {return a - b;};
       BinaryOperator<Integer> podziel = (a, b) -> {return a / b;};
       BinaryOperator<Integer> pomnoz = (a, b) -> {return a * b;};
       
       Kalkulator licz = new Kalkulator();
       System.out.println("2 + 3 = " + licz.wykonaj(2, 3, dodaj));
       System.out.println("2 - 3 = " + licz.wykonaj(2, 3, odejmij));
       System.out.println("2 * 3 = " + licz.wykonaj(2, 3, pomnoz));
       System.out.println("2 / 3 = " + licz.wykonaj(2, 3, podziel));
       
    }
    
}
