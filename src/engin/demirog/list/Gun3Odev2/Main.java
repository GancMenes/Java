package engin.demirog.list.Gun3Odev2;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1,"Jack","Sparrow","jsparrow@hmail.com");
        User user2 = new User();
        user2.setId(2);
        user2.setName("Davy");
        user2.setLastName("Jones");
        user2.setEmail("djones@gmail.com");


        Student student = new Student();
        student.setId(3);
        student.setName("Rick");
        student.setLastName("Sanchez");
        student.setEmail("rsanchez@gmail.com");

        Instructor instructor = new Instructor();
        instructor.setInstructoryear(2015);
        instructor.setId(4);
        instructor.setName("Black");
        instructor.setLastName("Pearl");
        instructor.setEmail("bpearl@gmail.com");
        instructor.setInstructorDepartment("Physics");



        UserManager userManager = new UserManager();
        userManager.attendance(user1);
        userManager.delete(user2);


        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);





    }
}
