package student;

public class Course{
    private String name="";
    private String teacher="";

    public Course(String name, String teacher){
        this.setName(name);
        this.setTeacher(teacher);
    }

    public String getName(){
        return name;
    }

    public String getTeacher(){
        return teacher;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setTeacher(String teacher){
        this.teacher=teacher;
    }
}