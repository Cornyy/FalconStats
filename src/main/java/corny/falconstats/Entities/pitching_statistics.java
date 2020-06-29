package corny.falconstats.Entities;

import javax.persistence.*;

@Entity
@Table(name="pitching_statistics")
public class pitching_statistics
{
    public void setStatistic_id(Integer statistic_id) {
        this.statistic_id = statistic_id;
    }

    public void setBb(Integer bb) {
        this.bb = bb;
    }

    public void setBf(Integer bf) {
        this.bf = bf;
    }

    public void setHb(Integer hb) {
        this.hb = hb;
    }

    public void setSo(Integer so) {
        this.so = so;
    }

    public void setBk(Integer bk) {
        this.bk = bk;
    }

    public void setEra(Integer era) {
        this.era = era;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public void setHr(Integer hr) {
        this.hr = hr;
    }

    public void setSO_BB(Integer SO_BB) {
        this.SO_BB = SO_BB;
    }

    public Integer getStatistic_id() {
        return statistic_id;
    }

    public Integer getBb() {
        return bb;
    }

    public Integer getBf() {
        return bf;
    }

    public Integer getHb() {
        return hb;
    }

    public Integer getSo() {
        return so;
    }

    public Integer getBk() {
        return bk;
    }

    public Integer getEra() {
        return era;
    }

    public Integer getH() {
        return h;
    }

    public Integer getHr() {
        return hr;
    }

    public Integer getSO_BB() {
        return SO_BB;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer statistic_id;

    @Column(name = "bb", nullable = false)
    private Integer bb;

    @Column(name = "bf", nullable = false)
    private Integer bf;

    @Column(name = "hb", nullable = false)
    private Integer hb;

    @Column(name = "so", nullable = false)
    private Integer so;

    @Column(name = "bk", nullable = false)
    private Integer bk;

    @Column(name = "era", nullable = false)
    private Integer era;

    @Column(name = "h", nullable = false)
    private Integer h;

    @Column(name = "hr", nullable = false)
    private Integer hr;

    @Column(name = "SO_BB", nullable = false)
    private Integer SO_BB;

    public pitching_statistics( Integer bb, Integer bf, Integer hb, Integer so, Integer bk, Integer era, Integer h, Integer hr, Integer so_bb)
    {
        this.bb = bb;
        this.bf = bf;
        this.hb = hb;
        this.so = so;
        this.bk = bk;
        this.era = era;
        this.h = h;
        this.hr = hr;
        SO_BB = so_bb;
    }
    public pitching_statistics()
    {

    }

}
