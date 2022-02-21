package by.itClass;

import by.itClass.interfaces.IStack;

public class FixedStack implements IStack {
    private int [] array;
    private int top;

    public FixedStack(int size) {
        this.array = new int[size];
        this.top = -1;
    }

    public int[] getArray() {
        return array;
    }

    public int getTop() {
        return top;
    }

    @Override
    public void push(int item) {
        if (top+1<array.length){
        array[top+1]=item;
        top++;
        }else {
            System.out.println("Error: Stack is full");
        }
    }

    @Override
    public int pop() {
        if (top==-1) {
            return -999;
        }
        if (array[top]!=-1){
            int a = array[top];
            array[top--]=0;
            return a;
        }
        return 0;
    }
}
