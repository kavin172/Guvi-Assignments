package Question5;

import java.util.Stack;

public class StackDataStructure {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        StackDataStructure st = new StackDataStructure();
        //push data to stack
        st.pushDataToStack(stack, 10);
        st.pushDataToStack(stack, 15);
        st.pushDataToStack(stack, 20);
        st.pushDataToStack(stack, 30);

        //pop data from stack
        st.popDataFromStack(stack);

        //isEmpty
        System.out.println("Is Stack empty "+st.isEmptyStack(stack));

        System.out.println("data presents in stack "+stack);

    }
    public void pushDataToStack(Stack<Integer> stack, int value){
        System.out.println("Data Pushed to Stack is " + stack.push(value));
    }
    public void popDataFromStack(Stack<Integer> stack){
        System.out.println("Data Removed From Stack is " + stack.pop());
    }
    public boolean isEmptyStack(Stack<Integer> stack){
        return stack.isEmpty();
    }
}
