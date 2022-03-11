package engin.demirog.list.Gun3Odev2;

public class InstructorManager {

    public void add(Instructor instructor){
        System.out.println("Yeni kullanıcı eklendi " + instructor.getName());
    }
    public void change(Instructor instructor){
        System.out.println("Yeni kullanıcı değiştirildi " + instructor.getName());
    }

    public void registerDepartmen(Instructor instructor){
        System.out.println("Yeni departman kaydedildi");
    }

}
