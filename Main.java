import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Your test code can go here
        Student student1 = new Student("Nguyen Van A", 12345, "CNTT");
        Student student2 = new Student("Pham Thi X", 54321, "KinhTe");
        Advisor advisor = new Advisor("Le Thi B", "AdvisorEmail");
        KLTN<Student, Advisor> kltn1 = new KLTN<>(student1, advisor,"JOLO");
        KLTN<Student, Advisor> kltn2 = new KLTN<>(student2, advisor,"ABC");
        
        Teacher teacher = new Teacher("Tran Van C", 11223, "TeacherEmail", "Professor");
        KLTN<Student, Teacher> kltn3 = new KLTN<>(student1, teacher,"DEF");
    
        List <KLTN<?, ?>> kltnlList = new ArrayList<KLTN<?,?>>();
        kltnlList.add(kltn1);
        kltnlList.add(kltn2);
        kltnlList.add(kltn3);
        ListSortable sorter = new ListSortable();
        kltnlList = ListSortable.sort(kltnlList);
        sorter.printf(kltnlList);
    }
}
