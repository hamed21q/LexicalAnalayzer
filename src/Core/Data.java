package Core;

public class Data {
    private String input;
    public int first;
    public int forward;
    private Tokenizer tokenizer;
    private StateManager stateManager;
    public Data(String inpuString, Tokenizer tokenizer, StateManager st) {
        input = inpuString + '$';
        this.stateManager = st;
        this.tokenizer = tokenizer;
        first = 0;
        forward = 0;
    }
    public void process(){
        while(first < input.length() && forward < input.length()){
            char c = input.charAt(forward);
            this.goNext(c);
            forward++;
            if(c == '$') break;
        }
    }
    private void goNext(char c){
        IState state = stateManager.goNext(c);
        if(state != null){
            String value = input.substring(first, forward);
            tokenizer.AddToken(state, value);
            this.resetFirst();
            stateManager.resetCurrent();
        }

    }
    public void resetForward(){
        forward = first;
        //called when error found
    }
    public void resetFirst(){
        first = forward;
        forward--;
        //called when token found
    }
}
