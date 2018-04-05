/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajecia5;

import java.util.function.BinaryOperator;

/**
 *
 * @author Student
 */
public class Kalkulator {
    public Integer wykonaj(int a, int b, BinaryOperator<Integer> expression)
    {
        return expression.apply(a, b);
    }
}
