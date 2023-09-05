package ch12api.exam.no5;

import java.util.Objects;

public class Student {
    private String studentNum;
    public Student(String studentNum){
        this.studentNum = studentNum;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return Objects.equals(studentNum, student.studentNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNum);
    }

    public String getStudentNum(){
        return studentNum;
    }
}
