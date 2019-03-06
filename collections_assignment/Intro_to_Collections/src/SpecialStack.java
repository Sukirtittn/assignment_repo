import java.util.Stack;

public class SpecialStack extends Stack<Integer> {
    private Stack<Integer> minstack = new Stack<>();

    private void push(int element) {
        if (isEmpty()) {
            super.push(element);
            minstack.push(element);
        } else {
            super.push(element);
            int oldelement = minstack.pop();
            minstack.push(oldelement);
            if (element < oldelement)
                minstack.push(element);
            else
                minstack.push(oldelement);
        }
    }

    public Integer pop() {
        int x = super.pop();
        minstack.pop();
        return x;
    }

    private int getMin() {
        int min = minstack.pop();
        minstack.push(min);
        return min;
    }

    public boolean isEmpty() {
        return (super.isEmpty());
    }

    public static void main(String[] args) {
        SpecialStack specialStack = new SpecialStack();
        System.out.println("Stack is empty?:"+specialStack.isEmpty());
        specialStack.push(15);
        specialStack.push(25);
        specialStack.push(35);
        System.out.println("Element popped out of Stack:" + specialStack.pop());
        System.out.println("Min element of Stack:"+specialStack.getMin());
        specialStack.push(5);
        System.out.println("Min element of Stack:"+specialStack.getMin());
        System.out.println("Elements in stack:"+specialStack);
        System.out.println("Stack is empty?:"+specialStack.isEmpty());
    }
}
