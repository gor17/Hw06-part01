package task1;

/*Есть 2 массива упорядоченных по возрастанию. Получите 3й массив, который объединит все эти элементы, но также в возрастающем порядке.

Пример ввода:
a = {1, 3, 5}
b = {2, 4, 8, 9, 12}
Результат:
c = {1, 2, 3, 4, 5, 8, 9, 12}
*/
public class Task01 {

    public static int[] arrMerge(int[] a, int[] b) {

        int[] c = new int[a.length + b.length];
        int iterA = a.length - 1;
        int iterB = b.length - 1;

        for (int i = c.length - 1; i >= 0; i--) {
            if (iterA < 0) {
                c[i] = b[iterB];
                iterB--;
            }
            if (iterB < 0) {
                c[i] = a[iterA];
                iterA--;
            } else if (a[iterA] > b[iterB]) {
                c[i] = a[iterA];
                iterA--;
            } else {
                c[i] = b[iterB];
                iterB--;
            }
        }
        return c;
    }

    public static void printArray(int[] array) {     //метод распечатывает массив
        System.out.println("Отсортированный упорядоченный массив выглядит следующим образом:\n");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4d", array[i]);
        }
        System.out.println("\n");
    }
}

