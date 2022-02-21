import by.itClass.DynamicStack;
import by.itClass.FixedStack;
import by.itClass.interfaces.IStack;

public class Runner {
    static void loadValues(IStack obj, int value){
        obj.push(value);
    }

    static void printStack(IStack obj){
        System.out.println(obj.pop());
    }

    public static void main(String[] args) {
        FixedStack fixedStack = new FixedStack(5);
        loadValues(fixedStack, 11);
       loadValues(fixedStack, 66);
        printStack(fixedStack);
        printStack(fixedStack);
        printStack(fixedStack);
        System.out.println("-----------------------------------");
        DynamicStack dynStack = new DynamicStack();
        loadValues(dynStack, 34);
        loadValues(dynStack, 43);
        loadValues(dynStack, 1);
        loadValues(dynStack, 2);
        loadValues(dynStack, 3);
        loadValues(dynStack, 4);
        loadValues(dynStack, 5);

        printStack(dynStack);
        printStack(dynStack);
        printStack(dynStack);

    }
}
