package ch15collection.exam.no8;

import java.util.Objects;

public class Student {
    private int studentNum;
    private String name;

    public Student(int studentNum, String name){
        this.studentNum = studentNum;
        this.name = name;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return studentNum == student.studentNum;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNum=" + studentNum +
                ", name='" + name + '\'' +
                '}';
    }
}
