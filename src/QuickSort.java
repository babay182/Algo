public class QuickSort {
    public static int[] quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return array;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return array;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            return quickSort(array, low, j);

        if (high > i)
            return quickSort(array, i, high);

        return array;
    }
}
