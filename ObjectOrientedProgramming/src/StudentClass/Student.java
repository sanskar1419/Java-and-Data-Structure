package StudentClass;
public class Student {
    String name;
    final private int rollNo;
    final private int id = 12345;
    private static int numStudent;
    static int a = 10;
    static int b = 30;

    Student(String name , int rollNo){
        this.name = name;
        this.rollNo = rollNo;
        Student.numStudent++;
    }

    static void print(){
        System.out.println(a + " " + b + " " + numStudent );
    }


    public int getRollNo(){
        return rollNo;
    }

    public void setRollNo(int num){
        if(num<=0){
            return;
        }

        
        // rollNo = num;
    }


    public int getNumStudent(){
        return numStudent;
       
    }
}
