package org.example;

import Classes.ComplexNumber;
import Classes.ComplexNumsCalculator;
import Classes.ConsoleLogger;
import Interfaces.iCalculator;
import Interfaces.iLogger;

import java.util.Scanner;

/**
 * @author Developer Name.
 * @version 1.0.
 * @apiNote Программа-каькулятор для комплексных чисел.
 */
public class Main {
    public static void main(String[] args) {
        iLogger logs = new ConsoleLogger();
        iCalculator calc = new ComplexNumsCalculator(logs);
        Scanner scan = new Scanner(System.in);


        System.out.println("Действительная часть первого числа:");
        double realPart1 = scan.nextDouble();
        System.out.println("Мнимая часть первого числа:");
        double imagPars1 = scan.nextDouble();
        ComplexNumber firstNum = new ComplexNumber(realPart1, imagPars1);


        System.out.println("Действительная часть второго числа:");
        double realPart2 = scan.nextDouble();
        System.out.println("Мнимая часть второго числа:");
        double imagPart2 = scan.nextDouble();
        ComplexNumber secondNum = new ComplexNumber(realPart2, imagPart2);

        calc.addition(firstNum, secondNum);
        calc.multiplication(firstNum, secondNum);
        calc.division(firstNum, secondNum);
    }
}