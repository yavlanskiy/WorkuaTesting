package Model;

/**
 * Created by YavlanskiyMS on 26.02.2016.
 * UserDegreeCandidate
 */
public class UserDegreeCandidate {

    private String name;
    private String lastName;
    private String eMail;
    private String pass;

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
}
