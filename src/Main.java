import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world of ARRAYS Part II!");

        //task1
        int[] salaryArrays = {10, 12, 23, 30, 26};
        System.out.print(Arrays.toString(salaryArrays) + " Массив из целоочисленных элементов.Зарплата по таймингу.");
        int totalSalary = 0;
        for (int index = 0; index < salaryArrays.length; index++) {
            totalSalary += salaryArrays[index];
        }

        System.out.println("\n" + totalSalary + "-а условная единица.Общая зарплата за весь период.");
        System.out.println("***end of the task 1***");

        //task2
        int[] expensesForThePeriod = {102, 205, 301, 280, 202};
        System.out.print(Arrays.toString(expensesForThePeriod) + " Массив из целоочисленных элементов.Траты за периоды.");
        int min = 102;
        for (int index = 0; index < expensesForThePeriod.length; index++) {
            if (expensesForThePeriod[index] < min) {
                min = expensesForThePeriod[index];
            }
        }
        System.out.println("\n" + "Минимальная сумма трат за период составила " + min + "-условные единицы.");
        System.out.println("=========================================================");
        int max = 301;
        for (int index = 0; index < expensesForThePeriod.length; index++) {
            if (expensesForThePeriod[index] > max) {
                max = expensesForThePeriod[index];
            }
        }
        System.out.println("\n" + "Максимальная сумма трат за период составила " + max + "-условную единицу.");
        System.out.println("***end of the task 2***");

        //task3
        int[] expensesOfUser = {111, 256, 350, 280, 200};
        System.out.print(Arrays.toString(expensesOfUser) + " Массив из целоочисленных элементов.Траты за периоды некоего пользователя Х.");
        int expenses = 0;
        for (int index = 0; index < expensesOfUser.length; index++) {
            expenses += expensesOfUser[index];
        }
        System.out.println("\n" + expenses / expensesOfUser.length + "-условных единиц средние траты составили за период.");
        System.out.println("***end of the task 3***");

        //task4
        char[] chars = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.print(Arrays.toString(chars) + "массив из символов ");
        for (int i = chars.length - 1; i >= 0; i--)
            System.out.print(" " + chars[i]);
        System.out.println("\n"+"***END OF HOME WORK 9***");


    }


}








