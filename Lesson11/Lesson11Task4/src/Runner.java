import by.itClass.Student;
import static java.util.Arrays.sort;

public class Runner {
    public static void main(String[] args) {
        Student [] array = new Student[5];
        array[0]= new Student ("Vitaliy", 24,"Arh");
        array[1]=new Student("Artem", 28,"Inf");
        array[2]=new Student("Gena", 21,"Arh");
        array[3]=new Student("Shasha", 22,"Inf");
        array[4]= new Student("Oly", 25,"Inf");

        info(array);
        sort(array);
        System.out.println("By sort:");
        info(array);
    }

    public static void info(Student[] s) {
        for (int i=1;s.length>i;i++ ){
            System.out.println(s[i].toString());
        }
    }
}
