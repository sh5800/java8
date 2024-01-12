package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapExample {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1,"Shreyash","secrete","shreyash@gmail.com"));
        users.add(new User(2,"Kashyap","secrete","kashyap@gmail.com"));
        users.add(new User(3,"Aryan","secrete","aryan@gmail.com"));

        System.out.println(users);

        List<UserDTO> userDTOS = new ArrayList<>();
        for(User user: users){
            userDTOS.add(new UserDTO(user.getId(),user.getUserName(),user.getEmail()));
        }

        System.out.println(userDTOS);

        List<UserDTO> collect = users.stream().map((User user) -> new UserDTO(user.getId(), user.getUserName(), user.getEmail())).collect(Collectors.toList());
        System.out.println(collect);
    }

}

class UserDTO{
    private int id;
    private String userName;
    private String password;
    private String email;

    public UserDTO(int id, String userName, String email) {
        super();
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class User{
    private int id;
    private String userName;
    private String password;
    private String email;

    public User(int id, String userName, String password, String email) {
        super();
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
