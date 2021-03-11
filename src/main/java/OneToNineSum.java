/*
* Посчитаем сумму чисел 1, 2, …, 9
* */

public class OneToNineSum {

    public static void main(String[] args) {
        int k = 0;
        for(int i = 0; i <= 99; i++) {
            if(i > 0 && i <= 9)
            k = k + i;
        }
        System.out.println(k);
    }
}
