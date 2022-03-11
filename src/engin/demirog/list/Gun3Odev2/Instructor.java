package engin.demirog.list.Gun3Odev2;

public class Instructor extends User{
    private int instructoryear;
    private String instructorDepartment;

    public Instructor() {
    }

    public Instructor(int id, String name, String lastName, String email, int instructoryear, String instructorDepartment) {
        super(id, name, lastName, email);
        this.instructoryear = instructoryear;
        this.instructorDepartment = instructorDepartment;
    }

    public void add(Instructor instructor){
        System.out.println("Öğretmen "  + instructor.getName() + " " + instructoryear+ "yılında kaydedildi ");
    }

    public void changed(Instructor instructor){
        System.out.println("Öğretmen dersi değiştirdi" + instructor.getName());
    }

    public int getInstructoryear() {
        return instructoryear;
    }

    public void setInstructoryear(int instructoryear) {
        this.instructoryear = instructoryear;
    }

    public String getInstructorDepartment() {
        return instructorDepartment;
    }

    public void setInstructorDepartment(String instructorDepartment) {
        this.instructorDepartment = instructorDepartment;
    }
}
