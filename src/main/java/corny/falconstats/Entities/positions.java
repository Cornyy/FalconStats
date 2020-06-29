package corny.falconstats.Entities;

import javax.persistence.*;

@Entity
@Table(name = "positions")
public class positions
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer position_id;

    @Column(name = "description", nullable = false)
    private String description;

    public void setPosition_id(Integer position_id) {
        this.position_id = position_id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public positions(String description)
    {
        this.description = description;
    }

    public positions()
    {

    }

    public Integer getPosition_id() {
        return position_id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
