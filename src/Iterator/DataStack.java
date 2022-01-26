package Iterator;

import java.util.Stack;

public class DataStack {
    private int[] items = new int[10];
    private int lenght;

    public DataStack() {
        lenght =- 1;
    }

    public DataStack(DataStack myStack) {
        this.items = myStack.items;
        this.lenght = myStack.lenght;
    }

    public int[] getItems() {
        return items;
    }

    public int getLenght() {
        return lenght;
    }

    public void push(int value){
        items[++lenght] = value;
    }

    public int pop(){
        return items[lenght--];
    }

    public static boolean equals(DataStack myStack1, DataStack myStack2){
        StackIterator it1 = new StackIterator(myStack1),
                it2 = new StackIterator(myStack2);
        while (it1.isEnd() || it2.isEnd()){
            if(it1.get() != it2.get()) break;
            StackIterator.increment(it1);
            StackIterator.increment(it2);
        }
        return !it1.isEnd() && !it2.isEnd();
    }
}
