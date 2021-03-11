/*
* Посчитаем сумму нескольких чётных чисел 8+10+12+14
* */
public class OddSum {
    public static void main(String[] args) {
        int k = 0;
        for(int i = 0; i <= 99; i++) {
            if(i == 8 || i == 10 || i == 12 || i == 14)
                k = k + i;
        }
        System.out.println(k);
    }
}
