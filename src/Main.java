import Core.Data;
import Core.StateManager;
import Core.Token;
import Core.Tokenizer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        StateManager stateManager = new StateManager();
        Tokenizer tokenizer = new Tokenizer();
        Data data = new Data(input, tokenizer, stateManager);
        data.process();
        for (int i = 0; i < tokenizer.getSize(); i++) {
            Token token = tokenizer.getToken(i);
            System.out.print("\nToken: " + i);
            System.out.print(" | Token Type: " + token.tokenType);
            System.out.println(" | Token Value: " + token.tokenValue + " |");
            System.out.print("...................");
        }
    }
}