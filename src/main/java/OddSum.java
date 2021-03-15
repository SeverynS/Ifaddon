/*
* Посчитаем сумму нескольких чётных чисел 8+10+12+14
* */
public class OddSum {
    public static void main(String[] args) {
        int k = 0;
        for(int i = 8; i <= 14; i += 2) {
                k = k + i;
        }
        System.out.println(k);
    }
}
