public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] expenseRecords = new int[30];
        for (int i = 0; i < expenseRecords.length; i++) {
            expenseRecords[i] = random.nextInt(100_000) + 100_000;
        }
        return expenseRecords;
    }
    public static void main(String[] args) {

        System.out.println("    Массивы часть 2.");
        System.out.println("ДЗ");
        //Задание 1.
        System.out.println("    Задание 1");
        int[] expenseRecords = generateRandomArray();
        int sumWastes = 0;
        for (int wastes : expenseRecords) {
            sumWastes += wastes;
        }
        System.out.println("Сумма трат за месяц составила " + sumWastes + " рублей");

        //Задание 2.
        System.out.println();
        System.out.println("    Задание 2");
        int max = -1;
        for (int maxExpenses : expenseRecords) {
            if (maxExpenses > max) {
                max = maxExpenses;
            }
        }
        int min = 5000000;
        for (int minExpenses : expenseRecords) {
            if (minExpenses < min) {
                min = minExpenses;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");

    }

}