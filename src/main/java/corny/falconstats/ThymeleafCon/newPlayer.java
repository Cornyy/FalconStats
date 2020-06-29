package corny.falconstats.ThymeleafCon;

import corny.falconstats.Entities.positions;

public class newPlayer
{
    private Integer number;
    private String firstName;
    private String lastName;
    private String password;
    private String firstPosition;
    private String secondPosition;
    private String thirdPosition;

    public newPlayer()
    {

    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public newPlayer(Integer number, String firstName, String lastName, String password,
                     String firstPosition, String secondPosition, String thirdPosition)
    {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.firstPosition = firstPosition;
        this.secondPosition = secondPosition;
        this.thirdPosition = thirdPosition;
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

    public void setFirstPosition(String firstPosition) {
        this.firstPosition = firstPosition;
    }

    public void setSecondPosition(String secondPosition) {
        this.secondPosition = secondPosition;
    }

    public void setThirdPosition(String thirdPosition) {
        this.thirdPosition = thirdPosition;
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

    public String getFirstPosition() {
        return firstPosition;
    }

    public String getSecondPosition() {
        return secondPosition;
    }

    public String getThirdPosition() {
        return thirdPosition;
    }
}
