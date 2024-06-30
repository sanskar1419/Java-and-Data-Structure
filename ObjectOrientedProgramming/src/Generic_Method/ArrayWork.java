package Generic_Method;


public class ArrayWork {
    public static<T> void PrintArray(T arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Bounding it to class vehicle and it derived class
    public static<T extends Vehicle> void printArray( T arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            arr[i].print();
        }
    }

    // Using Interface will guaranties that print method is there
    // Bounding it to class which implements PrintInterface 
    public static<T extends PrintInterface> void printArray1( T arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            arr[i].print();
        }
    }



    public static void main(String args[]){
     Integer arr[] = {1,2,3,4,5};
     String arrS[] = {"ab","cde","fgh"};
     Vehicle v[] = new Vehicle[5];
     for(int i=0 ; i < v.length ; i++){
        v[i] = new Vehicle(i+10 , "Black");
     }
     PrintArray(arr);
     PrintArray(arrS);
     PrintArray(v);
     System.out.println(".........................................................");
     printArray(v);
     System.out.println(".........................................................");
     printArray1(v);
    }

}
