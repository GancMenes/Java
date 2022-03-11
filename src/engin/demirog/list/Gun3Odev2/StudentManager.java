package engin.demirog.list.Gun3Odev2;

public class StudentManager {

    public void add(Student student){
        System.out.println("Yeni öğrenci kaydoldu " + student.getName() + "numarası " + student.getStudentid());
    }
    public void change(Student student){
        System.out.println("Öğrenci sınıf değiştirdi  " + student.getName() + "numarası " + student.getStudentid());
    }

}
