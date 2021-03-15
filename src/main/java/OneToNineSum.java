/*
* Посчитаем сумму чисел 1, 2, …, 9
* */

public class OneToNineSum {

    public static void main(String[] args) {
        int k = 0;
        for(int i = 1; i <= 9; i++) {
            k = k + i;
        }
        System.out.println(k);
    }
}
