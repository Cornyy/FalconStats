package corny.falconstats.Repositiories;

import corny.falconstats.Entities.pitching_statistics;
import corny.falconstats.Entities.players;
import org.springframework.data.repository.CrudRepository;

public interface pitchingStatisticsRepository extends CrudRepository<pitching_statistics,Integer> {
}
