package corny.falconstats.Entities;

import javax.persistence.*;

@Entity
@Table(name="batting_statistics")
public class batting_statistics
{
    public void setStatistic_id(Integer statistic_id) {
        this.statistic_id = statistic_id;
    }

    public void setFirstBase(Integer firstBase) {
        FirstBase = firstBase;
    }

    public void setSecondBase(Integer secondBase) {
        SecondBase = secondBase;
    }

    public void setThirdBase(Integer thirdBase) {
        ThirdBase = thirdBase;
    }

    public void setAb(Integer ab) {
        this.ab = ab;
    }

    public void setAvg(Double avg) {
        this.avg = avg;
    }

    public void setBb(Integer bb) {
        this.bb = bb;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public void setHr(Integer hr) {
        this.hr = hr;
    }

    public void setSo(Integer so) {
        this.so = so;
    }

    public Integer getStatistic_id() {
        return statistic_id;
    }

    public Integer getFirstBase() {
        return FirstBase;
    }

    public Integer getSecondBase() {
        return SecondBase;
    }

    public Integer getThirdBase() {
        return ThirdBase;
    }

    public Integer getAb() {
        return ab;
    }

    public Double getAvg() {
        return avg;
    }

    public Integer getBb() {
        return bb;
    }

    public Integer getH() {
        return h;
    }

    public Integer getHr() {
        return hr;
    }

    public Integer getSo() {
        return so;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer statistic_id;

    @Column(name="1B", nullable = false)
    private Integer FirstBase;

    @Column(name="2B", nullable = false)
    private Integer SecondBase;

    @Column(name="3B", nullable = false)
    private Integer ThirdBase;

    @Column(name="ab", nullable = false)
    private Integer ab;

    @Column(name="avg", nullable = false)
    private Double avg;

    @Column(name="bb", nullable = false)
    private Integer bb;

    @Column(name="h", nullable = false)
    private Integer h;

    @Column(name="hr", nullable = false)
    private Integer hr;

    @Column(name="so", nullable = false)
    private Integer so;

    public batting_statistics()
    {

    }

    public batting_statistics(Integer firstBase, Integer secondBase, Integer thirdBase, Integer ab, Double avg, Integer bb, Integer h, Integer hr, Integer so) {
        FirstBase = firstBase;
        SecondBase = secondBase;
        ThirdBase = thirdBase;
        this.ab = ab;
        this.avg = avg;
        this.bb = bb;
        this.h = h;
        this.hr = hr;
        this.so = so;
    }


}
