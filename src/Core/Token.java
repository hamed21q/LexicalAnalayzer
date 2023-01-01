package Core;

public class Token {
    public String tokenType;
    public String tokenValue;
    public Token(IState state, String param) {
        tokenType = state.getClass().getName();
        tokenValue = param;
    }
}
