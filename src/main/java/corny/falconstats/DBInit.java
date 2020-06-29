package corny.falconstats;

import corny.falconstats.Entities.players;
import corny.falconstats.Entities.positions;
import corny.falconstats.Entities.roles;
import corny.falconstats.Repositiories.playersRepository;
import corny.falconstats.Repositiories.positionsRepository;
import corny.falconstats.Repositiories.rolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class DBInit
{
    @Autowired
    public rolesRepository rolesRepository;
    @Autowired
    public positionsRepository positionsRepository;
    @Autowired
    public playersRepository playersRepository;


    public DBInit()
    {

    }

    @PostConstruct
    public void rolesInit()
    {
        roles a = new roles("admin");
        roles c = new roles("coach");
        roles p = new roles("player");
        rolesRepository.save(a);
        rolesRepository.save(c);
        rolesRepository.save(p);

        players admin = new players(0,"Admin","Admin","qwerty",a);
        playersRepository.save(admin);
    }

    @PostConstruct
    public void positionsInit()
    {
        positions p = new positions("P");
        positions c = new positions("C");
        positions f = new positions("1B");
        positions s = new positions("2B");
        positions ss = new positions("SS");
        positions t = new positions("3B");
        positions l = new positions("LF");
        positions cf = new positions("CF");
        positions r = new positions("RF");
        positions n = new positions("Null");

        positionsRepository.save(p);
        positionsRepository.save(c);
        positionsRepository.save(f);
        positionsRepository.save(s);
        positionsRepository.save(ss);
        positionsRepository.save(t);
        positionsRepository.save(l);
        positionsRepository.save(cf);
        positionsRepository.save(r);
        positionsRepository.save(n);


    }
}
