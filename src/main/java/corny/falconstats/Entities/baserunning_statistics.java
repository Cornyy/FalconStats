package corny.falconstats.Entities;

import javax.persistence.*;

@Entity
@Table(name = "baserunning_statistics")
public class baserunning_statistics
{
    public void setStatistic_id(Integer statistic_id) {
        this.statistic_id = statistic_id;
    }

    public void setCs(Integer cs) {
        this.cs = cs;
    }

    public void setSb(Integer sb) {
        this.sb = sb;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    public Integer getStatistic_id() {
        return statistic_id;
    }

    public Integer getCs() {
        return cs;
    }

    public Integer getSb() {
        return sb;
    }

    public Integer getR() {
        return r;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer statistic_id;

    @Column(name = "cs", nullable = false)
    private Integer cs;

    @Column(name = "sb", nullable = false)
    private Integer sb;

    @Column(name = "r", nullable = false)
    private Integer r;

    public baserunning_statistics(Integer cs, Integer sb, Integer r)
    {
        this.cs = cs;
        this.sb = sb;
        this.r = r;
    }

    public baserunning_statistics()
    {

    }
}
