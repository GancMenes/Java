package engin.demirog.list.Gun3Odev2;

public class Student extends User{
    private int studentid;

    public Student() {
    }

    public Student(int id, String name, String lastName, String email, int studentid) {
        super(id, name, lastName, email);
        this.studentid = studentid;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
}
