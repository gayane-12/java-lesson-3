package tasks;

public class MainTasks {
    public static void main(String[] args) {
        System.out.println("1. Create an array and fill it with two numbers.");
        int[] arrayForTaskOne = {10, 20};

        System.out.println("2. Create an array and fill it with numbers from 1:1000.");
        int[] arrayForTaskTwo = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arrayForTaskTwo[i] = i;
        }

        System.out.println("3. Create an array and fill it with odd numbers from -20:20.");
        int[] arrayForTaskThree = new int[20];
        for (int i = 0, j = -19; i < 20; i++, j+=2) {
            arrayForTaskThree[i] = j;
        }

        System.out.println("4. Create an array and fill it. Print all elements which can be divided by 5.");
        int[] arrayForTaskFour = {10, 30, 7, 45, 6, 12, 9, 5, 0, 1, 21};
        for (int i = 0; i < arrayForTaskFour.length; i++) {
            if(arrayForTaskFour[i] % 5 == 0)
                System.out.print(arrayForTaskFour[i] + " ");
        }

        System.out.println("\n5. Create an array and fill it. Print all elements which are between 24.12 and 467.23.");
        int[] arrayForTaskFive = {59, 25, 34, 7, 634, 6, 467, 468, 12, 12, 8, 0, 0, 31, 24};
        for (int i = 0; i < arrayForTaskFive.length; i++) {
            if(arrayForTaskFive[i] > 24.12 && arrayForTaskFive[i] < 467.23)
                System.out.print(arrayForTaskFive[i] + " ");
        }

        System.out.println("\n6. Create an array and fill it. Print count of elements which can be divided by 2.");
        int[] arrayForTaskSix = {0, 80, 34, 78, 12, 130, 23, 56, 7, 12, 2};
        int countOfEvens = 0;
        for (int i = 0; i < arrayForTaskSix.length; i++) {
            if(arrayForTaskSix[i]%2==0)
                countOfEvens++;
        }
        System.out.print(countOfEvens);

        System.out.println("\n7. Given an integer, 0< N < 21 , print its first 10 multiples. Each multiple  N x i (where 0<i<11) should be printed on a new line in the form: N x i = result.");
        int integerForTaskSeven = 3;
        for (int i = 1; i <= 10; i++) {
            System.out.println(integerForTaskSeven + " X " + i + " = " + (integerForTaskSeven*i));
        }


    }
}
