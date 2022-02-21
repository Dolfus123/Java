package by.itClass;

import by.itClass.interfaces.IStack;

public class DynamicStack implements IStack {

    private int [] array;
    private int top;
    private int size = 5;

    public DynamicStack() {
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
        if (top+1>=array.length){
            int [] newArray = new int[array.length*2];
            for (int i=0;array.length>i; i++){
                newArray[i]=array[i];
            }
            array=newArray;
            System.out.println("Message: Stack is add");
        }
        array[top+1]=item;
        top++;

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
