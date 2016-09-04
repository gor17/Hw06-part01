package task2;

/*2. Есть массив с числами упорядоченными по возрастанию, нужно определить есть ли в этом массиве 2 числа, сумма которых равна "sum".

Пример ввода:
a = {1, 5, 7, 9, 12}
sum = 12
Результат:
true - так как 5 + 7 = 12

a = {1, 5, 7, 9, 12}
sum = 3
Результат:
false - так как нет двух чисел, которые в сумме дают 3
 */
public class Task02 {

    public static boolean ifSumOkey(int sum, int[] array) {

        boolean exist = false;
        for (int i = 0; i < array.length; i++) {
            int j = i;
            while (j != array.length - 1) {
                if ((array[i] + array[j] == sum)) {
                    exist = true;
                }
                j++;
            }
        }
        return exist;
    }
}
