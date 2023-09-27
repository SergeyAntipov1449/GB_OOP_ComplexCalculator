package Classes;

import Interfaces.iCalculator;
import Interfaces.iLogger;


/**
 * @author Developer Name.
 * @version 1.0.
 * @apiNote Класс для описания калькулятора комплексных чисел.
 */
public class ComplexNumsCalculator implements iCalculator {
    private iLogger logs;

    /**
     * Констурктор класса
     * @param logs логер сообщений
     */
    public ComplexNumsCalculator(iLogger logs) {
        this.logs = logs;

    }

    @Override
    public ComplexNumber addition(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber res = num1.addition(num2);
        logs.writeLog("Результат сложения: " + res);
        return res;
    }

    @Override
    public ComplexNumber multiplication(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber res = num1.multiplication(num2);
        logs.writeLog("Результат умножения: " + res);
        return res;
    }

    @Override
    public ComplexNumber division(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber res = num1.division(num2);
        logs.writeLog("Результат деления: " + res);
        return res;
    }
}
