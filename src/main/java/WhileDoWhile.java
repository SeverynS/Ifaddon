/*for(int i=0; i<=99;i++) {sout(i);}
* перепиши код используя while and do-while
*
* Как сделать так, чтобы этот код печатал числа не от 0 до 99, а от 50 до 201?
* */
public class WhileDoWhile {
    public static void main(String[] args) {
        whileMix();
        doWhileMix();
        from50to201();
    }
    public static void whileMix() {
        int i = 0;
        while(i <=99) {
            System.out.println(i);
            i++;
        }
    }

    public static void doWhileMix() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while(i <= 99);
    }

    public static void from50to201() {
        for(int i=0; i <= 210;i++) { //если я правильно понял задание
            if(i >= 50 && i <= 201)
                System.out.println(i);
        } //
    }
}
