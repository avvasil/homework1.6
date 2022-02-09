package pro.sky;

public class Main {

    static int[] arr = generateRandomArray();

    public static void main(String[] args) {
	
        //task1

        int sum = 0;

        for (int element: arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        //task2

        int minSpendingPerDay = 200001;
        int maxSpendingPerDay = 99999;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSpendingPerDay)
                minSpendingPerDay = arr[i];
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpendingPerDay + " рублей.");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSpendingPerDay)
                maxSpendingPerDay = arr[i];
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSpendingPerDay + " рублей.");

        //task3

        float sumFloat = sum;
        float averageSpendingPerDay = sumFloat / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpendingPerDay + " рублей.");


        //task4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
