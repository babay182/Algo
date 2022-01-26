package Iterator;

public class StackIterator {
    private DataStack stack;
    private int index;

    public StackIterator(DataStack stack) {
        this.stack = stack;
        index = 0;
    }

    public static StackIterator increment(StackIterator s){
        s.index++;
        return s;
    }

    public int get(){
        if(index < stack.getLenght()){
            return stack.getItems()[index];
        }
        return 0;
    }

    public boolean isEnd(){
        return index != stack.getLenght() + 1;
    }
}
