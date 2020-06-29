package corny.falconstats.Entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "roles")
public class roles
{

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer role_id;


    @Column(name = "role_description", nullable = false)
    private String role_description;

    public roles(String role_description)
    {
        this.role_description = role_description;
    }

    public roles()
    {

    }

    public Integer getRole_id() {
        return role_id;
    }

    public String getRole_description() {
        return role_description;
    }

    public void setRole_description(String role_description) {
        this.role_description = role_description;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public void fillWithTestdata()
    {

    }
}
