package sample;

import java.time.LocalDate;
import java.util.Date;

public class User {
    private String username;
    private String firstname;
    private String lastname;
    private LocalDate birthday;
    private String password;

    public User(String username, String firstname, String lastname, LocalDate birthday, String password) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthday=" + birthday +
                ", password='" + password + '\'' +
                '}';
    }
}
