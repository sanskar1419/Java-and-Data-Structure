// Further addition in the class could be
/*
 1. Add an element at particular index
 2. Remove an element from particular Index
 */

package DynamicArray;

public class DynamicArray {
    private int dynamicArr[];
    private int nextElementIndex;

    public DynamicArray(){
    this.dynamicArr = new int[5];
    nextElementIndex = 0;
    }

    public int size(){
        return nextElementIndex;
    }

    public boolean isEmpty(){
        return nextElementIndex == 0;
    }

    public int get(int n){
        if(n>=nextElementIndex){
            // Throw Error
            return -1;
        }

        return dynamicArr[n];
    }

    public void set(int index , int value){
        if(index >= nextElementIndex){
            // Throw Error
            System.out.println("Index Out Of Bound !!!");
            return;
        }

        dynamicArr[index] = value;
    }

    public void add(int value){
        if(nextElementIndex == dynamicArr.length){
          doubleCapacity();
        } 
            dynamicArr[nextElementIndex] = value;
            nextElementIndex++;
    }

    private void doubleCapacity(){
        int newArr[] = new int[dynamicArr.length * 2];
          for(int i = 0 ; i < dynamicArr.length ; i++){
            newArr[i] = dynamicArr[i];
          }
          dynamicArr = newArr;
    }

    public void print(){
        for(int i = 0 ; i<nextElementIndex ; i++){
            System.out.print(dynamicArr[i] + " ");
        }
        System.out.println();
    }

    public void removeLastElement(){
        if(isEmpty() == true){
            System.out.println("Index Out Of Bond !!!");
            return;
        }
        dynamicArr[nextElementIndex - 1] = 0;
        nextElementIndex--;
    }

    public static void add(int index , int value){
       
    }
    
}
