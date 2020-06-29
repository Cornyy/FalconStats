package corny.falconstats.ThymeleafCon;

public class loginUser
{
    private String firstName;
    private String lastName;
    private String password;

    public loginUser()
    {

    }
    public loginUser(String firstName, String lastName, String password)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
