import java.util.List;

public class Program {
    public static void main(String[] args) {
        // 1. khoi tao danh sach sinh vien
        List<Student> list = StudentUtils.generate();
        StudentUtils.print(list);

        StudentUtils.sortByName(list);
        StudentUtils.print(list);

        // 3. sort tang diem
        StudentUtils.sortByAvg(list);
        StudentUtils.print(list);
     
        // sort tuoi giam
        StudentUtils.sortByAgeDescending(list);
        StudentUtils.print(list);
       
        // @TODO: tinh diem trung binh toan bo in ra
        System.out.println("Avg = " + StudentUtils.avg(list));
       
        // @TODO: lay ds ten hoc sinh gioi in ra
        System.out.println(StudentUtils.goodStudentName(list));
    }
}