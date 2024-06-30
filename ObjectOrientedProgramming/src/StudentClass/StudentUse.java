package StudentClass;

public class StudentUse {
    public static void main(String args[]){
        Student s1 = new Student("Sanskar" , 12);
        Student s2 = new Student("Harry" , 14);

        System.out.println(s1.getNumStudent());

        s1.print();
        s2.print();


        // System.out.println(s1);
        // System.out.println(s1.name + " " + s1.rollNo + " " +  s1.arr);
        // s1.name = "Sanskar";
        // System.out.println(s1.name + " " + s1.rollNo + " " +  s1.arr);
        // Student s2;
        // System.out.println(s2);
        // System.out.println(s1.name + " " + s1.getRollNo()  );
        // s1.name = "Sanskar Gupta";
        // // s1.setRollNo(45);

        
  }
}
