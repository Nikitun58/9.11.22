
        import java.util.Arrays;
        import java.util.stream.IntStream;

        public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача №1");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
                System.out.println("Сумма трат за месяц составила " + IntStream.of(arr).sum() + " рублей.");
        }
        // Задача №2
        System.out.println("Задача №2");
        int min = arr[0];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальное число = " + min +" | Максимальное число = " + max + " |");
        // Задача №3
        System.out.println("Задача №3");
        double averagesum= (double) IntStream.of(arr).sum()/ arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averagesum + " рублей");
        // Задача №4
        System.out.println("Задача №4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


}