import java.util.Arrays;

public class ArrayProj {
    public static void main(String[] args) {

        int[] numbers = new int[10]; // 0,1,2,3,4
        int[] numbers2 = {1, 2, 3, 4, 10};

        numbers[0] = 3234;
        numbers[1] = 34;
        numbers[2] = 3;
        numbers[3] = 32;
        numbers[4] = 34;

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Сумма элементов массива: " + sum);

        int sum1 = 0;
        for (int intnum : numbers2) {
            sum1 = sum1 + intnum;
        }
        System.out.println("Сумма элементов массива: " + sum1);

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int element = Arrays.binarySearch(numbers, 34);
        if (element < 0) {
            System.out.println("В массиве нет такого элемента");
        } else {
            System.out.println(numbers[element]);
        }

        System.out.println(Arrays.equals(numbers, numbers2));

        Arrays.fill(numbers2, 50);
        System.out.println(Arrays.toString(numbers2));

    }

}
