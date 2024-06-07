package TeacherClass;

public class Teacher {
    private String name;
    private int id;

    public Teacher(String name , int id){
        this.name = name;
        this.id = id;
    }
    public Teacher(String name){
        this.name = name;
    }
    public Teacher(){}

    public void setTeacher(String name , int id){
        this.name = name;
        this.id = id;
    }

    public void printTeacherDetails(){
        System.out.println(this.name + " " + this.id);
    }
}
