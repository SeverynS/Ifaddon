import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("List of tasks: \n " +
                "WhileDoWhile \n " +
                "\t 1) whileMix \n " +
                "\t 2) doWhileMix \n " +
                "\t 3) from50to201 \n " +
                "4) OneToNineSum \n " +
                "5) SumOfSometh \n " +
                "6) MultSome \n " +
                "7) OddSum \n " +
                "8) MultByThree"
        );

        System.out.println("Enter your choice: "); //как бы ещё сделать так, чтоб значение вводилось в этой же строке?
        switch (reader.readLine()) {
            case "1":
                WhileDoWhile.whileMix();
                break;
            case "2":
                WhileDoWhile.doWhileMix();
                break;
            case "3":
                WhileDoWhile.from50to201();
                break;
            case "4":
              OneToNineSum.main(null);
                break;
            case "5":
                SumOfSomth.main(null);
                break;
            case "6":
                MultSome.main(null);
                break;
            case "7":
                OddSum.main(null);
                break;
            case "8":
                MultByThree.main(null);

        }
    }
}
