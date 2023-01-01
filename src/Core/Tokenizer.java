package Core;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer {
    private List<Token> tokens;
    public Tokenizer() {
        tokens = new ArrayList<>();
    }
    public void AddToken(IState lastState, String param){
        Token token = new Token(lastState, param);
        tokens.add(token);
    }
    public Token getToken(int i){
        return tokens.get(i);
    }
    public int getSize(){
        return tokens.size();
    }
}
