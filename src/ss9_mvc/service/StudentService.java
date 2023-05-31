package ss9_mvc.service;

import ss9_mvc.model.Student;
import ss9_mvc.repository.IStudentRepository;
import ss9_mvc.repository.StudentRepository;

import java.util.Scanner;

public class StudentService implements IStudentService{
    Scanner scanner = new Scanner(System.in);
    private IStudentRepository iStudentRepository = new StudentRepository();
    @Override
    public void display() {
        Student[] students = iStudentRepository.findAll();

        for (int i = 0; i < iStudentRepository.getSize(); i++) {
            System.out.printf("Thông tin sinh viên thứ %d:\n", i + 1);
            System.out.println(students[i]);
        }
    }

    @Override
    public void create() {
        StudentRepository.students[iStudentRepository.getSize()] = new Student();
        System.out.print("Nhâp họ tên học sinh: ");
        StudentRepository.students[iStudentRepository.getSize()].setName(scanner.nextLine());
        System.out.print("Nhâp điểm của học sinh: ");
        StudentRepository.students[iStudentRepository.getSize()].setScore(Double.parseDouble(scanner.nextLine()));
        System.out.print("Nhâp id của học sinh: ");
        StudentRepository.students[iStudentRepository.getSize()].setId(Integer.parseInt(scanner.nextLine()));
        iStudentRepository.addSize();
    }

    @Override
    public Student update() {
        System.out.print("Nhâp id của học sinh cần sửa thông tin: ");
        int findID=Integer.parseInt(scanner.nextLine());
        Student[] students = iStudentRepository.findAll();
        for (int i = 0; i < iStudentRepository.getSize(); i++) {
            if(findID==StudentRepository.students[i].getId()){
                System.out.print("Nhâp họ tên học sinh: ");
                StudentRepository.students[i].setName(scanner.nextLine());
                System.out.print("Nhâp điểm của học sinh: ");
                StudentRepository.students[i].setScore(Double.parseDouble(scanner.nextLine()));
                return StudentRepository.students[findID-1];
            }
        }
        return StudentRepository.students[findID-1];
    }

    @Override
    public void delete() {
        System.out.print("Nhâp id của học sinh cần xóa thông tin: ");
        int deleteID=Integer.parseInt(scanner.nextLine());
        Student[] students = iStudentRepository.findAll();
        for (int j = deleteID-1; j < iStudentRepository.getSize()-1; j++) {
                    students[j]=students[j+1];
        }
        students[iStudentRepository.getSize()-1] = null;
    }
}
