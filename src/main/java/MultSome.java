/*
* Посчитаем произведение 48121620. То есть нужно все эти числа перемножить между собой
* */

public class MultSome {
    public static void main(String[] args) {
        multThis("48121620");
    }

    public static void multThis(String userInput) {
        int result = 1;
        int temp = 0;

        for(int i = 0; i < userInput.length(); i++) {
            temp = Character.getNumericValue(userInput.charAt(i));
            if(temp != 0)
                result = result * temp;
        }

        System.out.println(result);
    }
}
