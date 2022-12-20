public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;
    public Stack(int s) {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int j) {
        stackArray[++top] = j;
    }
    public int pop() {
        return stackArray[top--];
    }
    public int top() {
        return stackArray[top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    public static void main(String[] args) {
        //thêm 1 phần tử vào stack
        Stack theStack = new Stack(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        //lấy 1 phần tử ra khỏi stack
        int element = theStack.pop();
        System.out.println("pop element: " + element);


        //lấy phần tử trên cùng của ngăn xếp
        element = theStack.top();
        System.out.println("top element is : " + element);

        //kiểm tra ngăn xếp rỗng
        boolean checkEmpty = theStack.isEmpty();
        System.out.println("The Stack is empty? : " + checkEmpty);

        //print stack
        // while (!theStack.isEmpty()) {
        //     element = theStack.pop();
        //     System.out.print(element + " ");
        // }
    }
}

