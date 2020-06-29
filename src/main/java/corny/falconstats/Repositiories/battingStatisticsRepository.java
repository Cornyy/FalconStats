package corny.falconstats.Repositiories;

import corny.falconstats.Entities.batting_statistics;
import corny.falconstats.Entities.players;
import org.springframework.data.repository.CrudRepository;

public interface battingStatisticsRepository extends CrudRepository<batting_statistics,Integer> {
}
