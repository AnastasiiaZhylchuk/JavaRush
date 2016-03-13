package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами.
Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
        double res1 = convertEurToUsd(10, 0.75);
        double res2 = convertEurToUsd(1, 0.75);
        System.out.println(res1);
        System.out.print(res2);
    }

    public static double convertEurToUsd(int eur, double course){
        double eu = (double)eur;
        double usd = eu * course;
        return usd;
    }
}
