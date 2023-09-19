package algorithm;

/**
 * 스택
 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 */
public class Stack {
    /*
     * stack : LIFO(Last In First Out) 쌓이는 데이터
     * queue : FIFO(First In First Out) 먼저 들어온 데이터가 먼저 나간다. 정류장 줄서기
     */
    private int[] stack;

    public Stack() {
        this.stack = new int[0];
    }

    public void push(int x) {
        int newSize = this.stack.length + 1;
        int[] newStack = new int[newSize];
        for (int i = 0; i < this.stack.length; i++) {
            newStack[i] = this.stack[i];
        }
        newStack[newSize - 1] = x;
        this.stack = newStack;
    }

    public void pop() {
        if (this.stack.length == 0) {
            System.out.println(-1);
        }
        int[] newStack = new int[this.stack.length - 1];
        for (int i = 0; i < newStack.length; i++) {
            newStack[i] = this.stack[i];
        }
        System.out.println(this.stack[this.stack.length - 1]);
        this.stack = newStack;
    }

    public void size() {
        System.out.println(this.stack.length);
    }

    public void empty() {
        if (this.stack.length == 0) {
            System.out.println(1);
            return;
        }
        System.out.println(0);
    }

    public void top() {
        if (this.stack.length == 0) {
            System.out.println(-1);
        }
        System.out.println(this.stack[this.stack.length - 1]);
    }
}
