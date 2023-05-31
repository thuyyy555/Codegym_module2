package ss9_mvc.repository;

import ss9_mvc.model.Student;

public interface IStudentRepository {
    Student[] findAll();
    public int getSize();
    public int addSize();
}
