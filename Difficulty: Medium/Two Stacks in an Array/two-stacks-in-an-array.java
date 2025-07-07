class twoStacks {
    int top1;
    int top2;
    int arr[];
    int size;

    twoStacks() {
        size = 1000;
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        if (top1 < top2 - 1) {
            arr[++top1] = x;
        }
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        if (top1 < top2 - 1) {
            arr[--top2] = x;
        }
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        if (top1 >= 0) {
            return arr[top1--];
        }
        return -1;
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        if (top2 < size) {
            return arr[top2++];
        }
        return -1;
    }
}
