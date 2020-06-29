package corny.falconstats.ThymeleafCon;

public class newRoster {

    private String rosterName;
    private String pitcherName;
    private String catcherName;
    private String firstBaseName;
    private String secondBaseName;
    private String shortstopName;
    private String thirdBaseName;
    private String leftFieldName;
    private String centerFieldName;
    private String rightFieldName;

    public newRoster() {

    }

    public newRoster(String rosterName, String pitcherName, String catcherName, String firstBaseName, String secondBaseName, String shortstopName, String thirdBaseName, String leftFieldName, String centerFieldName, String rightFieldName) {
        this.rosterName = rosterName;
        this.pitcherName = pitcherName;
        this.catcherName = catcherName;
        this.firstBaseName = firstBaseName;
        this.secondBaseName = secondBaseName;
        this.shortstopName = shortstopName;
        this.thirdBaseName = thirdBaseName;
        this.leftFieldName = leftFieldName;
        this.centerFieldName = centerFieldName;
        this.rightFieldName = rightFieldName;
    }

    public String getRosterName() {
        return rosterName;
    }

    public void setRosterName(String rosterName) {
        this.rosterName = rosterName;
    }

    public String getPitcherName() {
        return pitcherName;
    }

    public void setPitcherName(String pitcherName) {
        this.pitcherName = pitcherName;
    }

    public String getCatcherName() {
        return catcherName;
    }

    public void setCatcherName(String catcherName) {
        this.catcherName = catcherName;
    }

    public String getFirstBaseName() {
        return firstBaseName;
    }

    public void setFirstBaseName(String firstBaseName) {
        this.firstBaseName = firstBaseName;
    }

    public String getSecondBaseName() {
        return secondBaseName;
    }

    public void setSecondBaseName(String secondBaseName) {
        this.secondBaseName = secondBaseName;
    }

    public String getShortstopName() {
        return shortstopName;
    }

    public void setShortstopName(String shortstopName) {
        this.shortstopName = shortstopName;
    }

    public String getThirdBaseName() {
        return thirdBaseName;
    }

    public void setThirdBaseName(String thirdBaseName) {
        this.thirdBaseName = thirdBaseName;
    }

    public String getLeftFieldName() {
        return leftFieldName;
    }

    public void setLeftFieldName(String leftFieldName) {
        this.leftFieldName = leftFieldName;
    }

    public String getCenterFieldName() {
        return centerFieldName;
    }

    public void setCenterFieldName(String centerFieldName) {
        this.centerFieldName = centerFieldName;
    }

    public String getRightFieldName() {
        return rightFieldName;
    }

    public void setRightFieldName(String rightFieldName) {
        this.rightFieldName = rightFieldName;
    }

}
