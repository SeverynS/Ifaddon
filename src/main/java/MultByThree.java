/*
* Посчитаем значения последовательности чисел по такому правилу:
a1 = 5,
a2 = a1х3 + 1,
a3 = a2х3 + 1,
…
a100 = a99*3 + 1.
* */
public class MultByThree {
    public static void main(String[] args) {
        long first = 5;
        long second = 0;
        int i = 1;

        while(i < 100) {
            if(i == 1)
                System.out.println(("a" + i + " = " + first));
            second = first * 3 + 1;
            System.out.println("a" + (i + 1) + " = " + second); //костыль
            first = first * 3 + 1;
            i++;
        }
    }
}
