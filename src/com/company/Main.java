package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b); // код не работает, т.к. возникает ошибка деления на 0.
        // В качестве способа решения добавила в divide проверку на равенство y=0, и  в этом случае
        // возврат результата = 0

        calc.println.accept(c);
    }
}
