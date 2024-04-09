import java.util.List;

public class Program {
    public static void main(String[] args) {
        // 1. khoi tao danh sach sinh vien
        List<Student> list = StudentUtils.generate();
        StudentUtils.print(list);
    }
}