public class SortBubble {
    public static int[] bubbleSorter(int[] mass){     //МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
        for (int out = mass.length - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(mass[in] > mass[in + 1]) {
                    int dummy = mass[in];
                    mass[in] = mass[in + 1];
                    mass[in + 1] = dummy;
                }
            }
        }
        return mass;
    }
}
