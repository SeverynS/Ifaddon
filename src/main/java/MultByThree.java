import java.math.BigInteger;

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
        BigInteger bigInteger = BigInteger.valueOf(5);
        int i = 0;

        while(i++ < 100) {
            System.out.println("a" + i  + " = " + bigInteger);
            bigInteger = ((bigInteger.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE)));
        }
    }
}
