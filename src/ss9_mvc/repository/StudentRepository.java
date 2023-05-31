package ss9_mvc.repository;

import ss9_mvc.model.Student;

public class StudentRepository implements IStudentRepository{
    static public Student[] students = new Student[100];
    static int size = 0;

    static {
        students[0] = new Student(1, "Nguyễn Văn A", 9.6);
        students[1] = new Student(2, "Nguyễn Văn B", 5.6);
        students[2] = new Student(3, "Nguyễn Văn C", 6.7);
        students[3] = new Student(4, "Nguyễn Văn D", 8.7);
        size = 4;
    }

    @Override
    public Student[] findAll() {
        return students;
    }

    public int getSize() {
        return size;
    }

    public int addSize(){
        return ++size;
    }
}
