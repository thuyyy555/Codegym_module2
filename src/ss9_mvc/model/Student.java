package ss9_mvc.model;

import ss9_mvc.repository.StudentRepository;

public class Student {
    private int id; // biến toàn cục, biến đối tượng
    private String name;
    private double score;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if ( score < 0 || score > 10) {
            System.out.println("Điểm không hợp lệ");
            // exception
        } else {
            this.score = score;
        }
    }

    public void setId(int id){
        this.id=id;
    }

    public Student(){
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
