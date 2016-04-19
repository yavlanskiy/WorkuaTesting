package Model;

import utils.StringHelper;

/**
 * Created by YavlanskiyMS on 26.02.2016.
 * UserDegreeCandidate
 */
public class UserDegreeCandidate {

    private String name;
    private String lastName;
    private String eMail;
    private String pass;


    public UserDegreeCandidate() {
    }

    public UserDegreeCandidate(String eMail, String pass) {
        this.eMail = eMail;
        this.pass = pass;
    }

    public UserDegreeCandidate(String name, String lastName, String eMail, String pass) {
        this.name = name;
        this.lastName = lastName;
        this.eMail = eMail;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public UserDegreeCandidate setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserDegreeCandidate setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String geteMail() {
        return eMail;
    }

    public UserDegreeCandidate seteMail(String eMail) {
        this.eMail = eMail;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public UserDegreeCandidate setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public UserDegreeCandidate setRandomUser() {
        this.setName("Max");
        this.setLastName("Maximov");
        this.seteMail((StringHelper.generateRandomEmail()));
        setPass("123456qwerty");
        return this;
    }

//    public UserDegreeCandidate setRandomUser() {
//        this.setName(String.format("%s %s",
//                StringHelper.generateRandomString(4, 10),
//                StringHelper.generateRandomString(4, 10)));
//        this.setLastName(StringHelper.generateRandomString(4,10));
//        this.seteMail((StringHelper.generateRandomEmail()));
//        setPass("123456qwerty");
//        return this;
//    }
}
