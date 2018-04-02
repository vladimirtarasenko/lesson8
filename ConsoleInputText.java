package HashMaps;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleInputText implements InputText {

    @Override
    public String read() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Please enter the quantity of words you would like to enter");
        int words = Main5.scanner.nextInt();
        System.out.println("Please enter the text. Type  'finish' when you want to finish");
        for (int i = 0; i <= words; i++) {
            stringBuilder.append(Main5.scanner.nextLine());
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
