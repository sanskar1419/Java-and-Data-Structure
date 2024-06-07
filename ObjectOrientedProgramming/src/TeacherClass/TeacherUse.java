package TeacherClass;

public class TeacherUse {

    public static void main(String args[]){
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher("Potter");
        Teacher t3 = new Teacher("Harry", 43);

        t1.printTeacherDetails();
        t2.printTeacherDetails();
        t3.printTeacherDetails();
    }
}
