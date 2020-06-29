package corny.falconstats.Entities;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class players
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer player_id;

    @Column(name = "number", nullable = false)
    private Integer number;

    @Column(name = "first_name", nullable = false,length = 20)
    private String first_name;

    @Column(name = "last_name", nullable = false,length = 30)
    private String last_name;

    @Column(name = "password", nullable = false,length = 30)
    private String password;

    @ManyToOne
    @JoinColumn(name = "baserun_statistic_id")
    private baserunning_statistics baserunning_statistics;

    @ManyToOne
    @JoinColumn(name = "pitching_statistic_id")
    private pitching_statistics pitching_statistics;

    @ManyToOne
    @JoinColumn(name = "batting_statistic_id")
    private batting_statistics batting_statistics;

    @ManyToOne
    @JoinColumn(name = "first_position_id")
    private positions first_position;

    @ManyToOne
    @JoinColumn(name = "second_position_id")
    private positions second_position;

    @ManyToOne
    @JoinColumn(name = "third_position_id")
    private positions third_position;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private roles role;


    public players(Integer number,String first_name, String last_name, String password, baserunning_statistics baserunning_statistics, pitching_statistics pitching_statistics, batting_statistics batting_statistics, positions first_position, positions second_position, positions third_position, roles role)
    {
        this.number = number;
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
        this.baserunning_statistics = baserunning_statistics;
        this.pitching_statistics = pitching_statistics;
        this.batting_statistics = batting_statistics;
        this.first_position = first_position;
        this.second_position = second_position;

        this.third_position = third_position;
        this.role = role;
    }


    public players(Integer number,String first_name,String last_name,String password,roles role)
    {
        this.number = number;
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
        this.role = role;
    }


    public players()
    {

    }

    public void setPlayer_id(Integer player_id) {
        this.player_id = player_id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBaserunning_statistics(corny.falconstats.Entities.baserunning_statistics baserunning_statistics) {
        this.baserunning_statistics = baserunning_statistics;
    }

    public void setPitching_statistics(corny.falconstats.Entities.pitching_statistics pitching_statistics) {
        this.pitching_statistics = pitching_statistics;
    }

    public void setBatting_statistics(corny.falconstats.Entities.batting_statistics batting_statistics) {
        this.batting_statistics = batting_statistics;
    }

    public void setFirst_position(positions first_position) {
        this.first_position = first_position;
    }

    public void setSecond_position(positions second_position) {
        this.second_position = second_position;
    }

    public void setThird_position(positions third_position) {
        this.third_position = third_position;
    }

    public void setRole(roles role) {
        this.role = role;
    }

    public Integer getPlayer_id() {
        return player_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPassword() {
        return password;
    }

    public corny.falconstats.Entities.baserunning_statistics getBaserunning_statistics() {
        return baserunning_statistics;
    }

    public corny.falconstats.Entities.pitching_statistics getPitching_statistics() {
        return pitching_statistics;
    }

    public corny.falconstats.Entities.batting_statistics getBatting_statistics() {
        return batting_statistics;
    }

    public positions getFirst_position() {
        return first_position;
    }

    public positions getSecond_position() {
        return second_position;
    }

    public positions getThird_position() {
        return third_position;
    }

    public roles getRole() {
        return role;
    }

    public boolean isSame(players player)
    {
        if(this.number == player.getNumber() && this.last_name.equals(player.getLast_name()))
        {
            return true;
        }
        return false;
    }
}
