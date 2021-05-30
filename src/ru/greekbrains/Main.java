package ru.greekbrains;

public class Main {

    public static void main(String[] args) {
	//1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        System.out.println(within10and20(4, 1));
    //2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
        isPositiveOrNegative(-5);
    //3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        System.out.println(isNegative(-1));
    //4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз.
        printWordNTimes("TheStep", 5);
    //5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        System.out.println(leapYear(204));

    }

        public static boolean within10and20 (int a, int b) {
            int sum = a + b;
            if (sum > 10 && sum <=20) {
            return true;
            } else {
            return false;
            }
        }

        public static void isPositiveOrNegative(int number) {
            if (number >= 0) {
                System.out.println(number + " Положительное");
            } else{
                System.out.println(number + " Отрицательное");
            }
        }

        public static boolean isNegative(int a) {
            if (a < 0) {
            return true;
            }
            return false;
        }

        public static void printWordNTimes(String word, int iteration) {
            for (int i = 0; i < iteration; i++) {
                System.out.println(word);
            }
        }

        public static boolean leapYear (int year) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }

}
