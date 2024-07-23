public class StackUsingArray {
    private int dynamicArray[];
    private int size;
    private int topIndex;

    StackUsingArray() {
        this.dynamicArray = new int[2];
        this.topIndex = -1;
    }

    StackUsingArray(int size) {
        this.dynamicArray = new int[size];
        this.topIndex = -1;
    }

    public void push(int num) {
        if (topIndex >= this.dynamicArray.length - 1) {
            increaseArraySize();
        }
        this.dynamicArray[topIndex + 1] = num;
        topIndex++;
        size++;
    }

    private void increaseArraySize() {
        int temp[] = this.dynamicArray;
        this.dynamicArray = new int[2 * this.dynamicArray.length];
        int count = 0;
        for (int i : temp) {
            this.dynamicArray[count] = i;
            count++;
        }
    }

    public int size() {
        return size;
    }

    public int top() throws StackEmptyException {
        if (topIndex == -1)
            throw new StackEmptyException();
        return this.dynamicArray[topIndex];
    }

    public int pop() throws StackEmptyException {
        if (topIndex == -1)
            throw new StackEmptyException();

        int removedElement = this.dynamicArray[topIndex];
        topIndex--;
        size--;
        return removedElement;
    }

    public boolean isEmpty() {
        if (topIndex == -1)
            return true;
        else
            return false;
    }
}