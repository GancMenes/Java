package engin.demirog.list.Gun2Odev1;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(1,"Jack","Sparrow","jsparrow@gmail.com");
        Student student2 = new Student(2,"Davy","Kones","djones@gmail.com");

        Student student3 = new Student();
        student3.id = 3;
        student3.name = "Elizabeth";
        student3.lastname = "Pearl";
        student3.email = "epearl@gmail.com";

        StudentManager studentManager = new StudentManager();

        studentManager.add(student1);
        studentManager.delete(student2);


    }
}
