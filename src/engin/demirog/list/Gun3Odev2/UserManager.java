package engin.demirog.list.Gun3Odev2;

public class UserManager {

    public void attendance(User user){
        System.out.println("Kullanıcı bugün oturum açtı" +  user.getName());
    }

    public void delete(User user){
        System.out.println("Kullanıcı silindi " + user.getName());
    }
}
