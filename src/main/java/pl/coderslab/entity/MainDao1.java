package pl.coderslab.entity;

public class MainDao1 {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
//        User user = new User();
//        user.setUserName("thth");
//        user.setEmail("thtrh");
//        user.setPassword("123456");
//        userDao.create(user)
//        ;
//        User read = userDao.read(1);
//        System.out.println(read);
//        User readNotExist = userDao.read(8);
//        System.out.println(readNotExist);

//        User userToUpdate = userDao.read(1);
//        userToUpdate.setUserName("Jan");
//        userToUpdate.setEmail("Kowalski");
//        userToUpdate.setPassword("asdfghhjjjk");
//        userDao.update(userToUpdate);

//        User secondUser = new User();
//        secondUser.setUserName("marek");
//        secondUser.setEmail("marek@coderslab.pl");
//        secondUser.setPassword("pass");
//        userDao.create(secondUser);
//        User[] all = userDao.findAll();
//        for (User u : all) {
//            System.out.println(u);

//        User secondUser = new User();
//        secondUser.setUserName("marek");
//        secondUser.setEmail("marek@coderslab.pl");
//        secondUser.setPassword("pass");
//        userDao.create(secondUser);
//        User[] all = userDao.findAll();
//        for (User u : all) {
//            System.out.println(u);
//        }
        userDao.delete(14);
    }
}
