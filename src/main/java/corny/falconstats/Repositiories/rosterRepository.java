package corny.falconstats.Repositiories;

import corny.falconstats.Entities.roles;
import corny.falconstats.Entities.roster;
import org.springframework.data.repository.CrudRepository;

public interface rosterRepository  extends CrudRepository<roster, Integer> {
}
