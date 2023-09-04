package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
   private long id;
   private String studentName;
    private String studentAddress;
    private String studentEmail;

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                '}';
    }

    public Student(long id, String studentName, String studentAddress, String studentEmail) {
        this.id = id;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentEmail = studentEmail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
}
