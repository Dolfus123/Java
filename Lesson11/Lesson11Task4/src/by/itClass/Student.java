package by.itClass;

public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private String faculty;

    public Student() {
    }

    public Student(String name, int age, String faculty) {
        this.name = name;
        this.age = age;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public int compareTo(Student s) {
             return  this.age-s.age;
    }

     public String toString(){
         return name+"; "+ age+"; "+faculty;
     }

}
