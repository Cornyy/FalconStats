package corny.falconstats.Entities;


import javax.persistence.*;


@Entity
@Table(name = "rosters")
public class roster
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer roster_id;

    @Column(name = "roster_name", nullable = false)
    private String roster_name;

    @Column(name = "pitcher")
    private String pitcher;

    @Column(name = "catcher")
    private String catcher;

    @Column(name = "firstBase")
    private String firstBase;

    @Column(name = "secondBase")
    private String secondBase;

    @Column(name = "shortstop")
    private String shortstop;

    @Column(name = "thirdBase")
    private String thirdBase;

    @Column(name = "leftField")
    private String leftField;

    @Column(name = "centerField")
    private String centerField;

    @Column(name = "rightField")
    private String rightField;


    public roster() {
    }

    public roster(String roster_name, String pitcher, String catcher, String firstBase, String secondBase, String shortstop, String thirdBase, String leftField, String centerField, String rightField) {
        this.roster_id = roster_id;
        this.roster_name = roster_name;
        this.pitcher = pitcher;
        this.catcher = catcher;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.shortstop = shortstop;
        this.thirdBase = thirdBase;
        this.leftField = leftField;
        this.centerField = centerField;
        this.rightField = rightField;
    }

    public String getRoster_name() {
        return roster_name;
    }

    public void setRoster_name(String roster_name) {
        this.roster_name = roster_name;
    }

    public String getPitcher() {
        return pitcher;
    }

    public void setPitcher(String pitcher) {
        this.pitcher = pitcher;
    }

    public String getCatcher() {
        return catcher;
    }

    public void setCatcher(String catcher) {
        this.catcher = catcher;
    }

    public String getFirstBase() {
        return firstBase;
    }

    public void setFirstBase(String firstBase) {
        this.firstBase = firstBase;
    }

    public String getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(String secondBase) {
        this.secondBase = secondBase;
    }

    public String getShortstop() {
        return shortstop;
    }

    public void setShortstop(String shortstop) {
        this.shortstop = shortstop;
    }

    public String getThirdBase() {
        return thirdBase;
    }

    public void setThirdBase(String thirdBase) {
        this.thirdBase = thirdBase;
    }

    public String getLeftField() {
        return leftField;
    }

    public void setLeftField(String leftField) {
        this.leftField = leftField;
    }

    public String getCenterField() {
        return centerField;
    }

    public void setCenterField(String centerField) {
        this.centerField = centerField;
    }

    public String getRightField() {
        return rightField;
    }

    public void setRightField(String rightField) {
        this.rightField = rightField;
    }

    public Integer getRoster_id() {
        return roster_id;
    }

    public void setRoster_id(Integer roster_id) {
        this.roster_id = roster_id;
    }
}

