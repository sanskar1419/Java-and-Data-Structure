package StudentClass;
public class Student {
    String name;
    final private int rollNo;
    final private int id = 12345;

    Student(String name , int rollNo){
        this.name = name;
        this.rollNo = rollNo;
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
}
