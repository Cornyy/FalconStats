package corny.falconstats;


import corny.falconstats.Entities.*;
import corny.falconstats.Repositiories.*;
import corny.falconstats.ThymeleafCon.loginUser;
import corny.falconstats.ThymeleafCon.newPlayer;
import corny.falconstats.ThymeleafCon.newRoster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


@RestController
public class appController {

    @Autowired
    public corny.falconstats.Repositiories.rolesRepository rolesRepository;
    @Autowired
    public corny.falconstats.Repositiories.positionsRepository positionsRepository;
    @Autowired
    public corny.falconstats.Repositiories.playersRepository playersRepository;
    @Autowired
    public corny.falconstats.Repositiories.baserunningStatisticsRepository baserunningStatisticsRepository;
    @Autowired
    public corny.falconstats.Repositiories.battingStatisticsRepository battingStatisticsRepository;
    @Autowired
    public pitchingStatisticsRepository pitchingStatisticsRepository;
    @Autowired
    public rosterRepository rosterRepository;

    @GetMapping("/")
    @ResponseBody
    public ModelAndView Welcome()
    {
        ModelAndView model = new ModelAndView("login");
        model.addObject("loginUser",new loginUser());
        return model;
    }

    @RequestMapping("/login")
    public ModelAndView login(@ModelAttribute loginUser loginUser, HttpSession session)
    {
        ModelAndView model;

        Iterable<players> playersList = playersRepository.findAll();
        for (players i:playersList)
        {
            if(i.getFirst_name().toUpperCase().equals(loginUser.getFirstName().toUpperCase()) && i.getLast_name().toUpperCase().equals(loginUser.getLastName().toUpperCase()) &&
            i.getPassword().equals(loginUser.getPassword()))
            {
                if(i.getRole().getRole_description().equals("admin")) {

                    model = new ModelAndView("fragments/home");

                    session.setAttribute("lastName", i.getLast_name());
                    session.setMaxInactiveInterval(3600);

                }
                else
                {
                    model = new ModelAndView("loginError");
                    model.addObject("message","You don't have permissions!");
                }
                return model;
            }
        }
        model = new ModelAndView("loginError");
        model.addObject("message","Incorrect data!");
        return model;
    }

    @RequestMapping("/logout")
    public ModelAndView logout(@ModelAttribute loginUser loginUser,HttpSession session)
    {
        ModelAndView model = new ModelAndView("loginError");
        model.addObject("message","You have logged out!");
        session.removeAttribute("lastName");
        return model;
    }

    // TYLKO DO ĆWICZEŃ, USUNĄĆ NA KOŃCU!!!!
    @PostMapping("/addPlayer")
    public @ResponseBody String addPlayer(@RequestParam Integer number,@RequestParam String firstName,
                                          @RequestParam String lastName, @RequestParam String password,
                                          @RequestParam String firstPosition,@RequestParam String secondPosition,@RequestParam String thirdPosition)
    {
        baserunning_statistics baseS = new baserunning_statistics(0,0,0);
        batting_statistics battS = new batting_statistics(0,0,0,0,0.0,0,0,0,0);
        pitching_statistics pitchS = new pitching_statistics(0,0,0,0,0,0,0,0,0);
        baserunningStatisticsRepository.save(baseS);
        battingStatisticsRepository.save(battS);
        pitchingStatisticsRepository.save(pitchS);

        Iterable<roles> roleList = rolesRepository.findAll();
        Iterable<positions> positionsList = positionsRepository.findAll();
        for (roles i:roleList)
        {
            if(i.getRole_description().equals("player"))
            {
                for(positions p1 : positionsList) {

                    if (p1.getDescription().equals(firstPosition)) {
                        for(positions p2 : positionsList)
                        {
                            if(p2.getDescription().equals(secondPosition))
                            {
                                for(positions p3 : positionsList)
                                {
                                    if(p3.getDescription().equals(thirdPosition))
                                    {
                                        players p = new players(number,firstName,lastName,password,baseS,pitchS,battS,p1,p2,p3,i);
                                        playersRepository.save(p);
                                        return "true";
                                    }
                                }
                            }
                        }
                    }
                }
                return"bad position";

            }
        }
        return "false";
    }


    @RequestMapping("/addNewPlayer")
    public ModelAndView addNewPlayer(@ModelAttribute newPlayer newPlayer)
    {
        ModelAndView model;
        baserunning_statistics baseS = new baserunning_statistics(0,0,0);
        batting_statistics battS = new batting_statistics(0,0,0,0,0.0,0,0,0,0);
        pitching_statistics pitchS = new pitching_statistics(0,0,0,0,0,0,0,0,0);
        baserunningStatisticsRepository.save(baseS);
        battingStatisticsRepository.save(battS);
        pitchingStatisticsRepository.save(pitchS);
        Iterable<roles> roleList = rolesRepository.findAll();
        Iterable<positions> positionsList = positionsRepository.findAll();
        for (roles i:roleList)
        {
            if(i.getRole_description().equals("player"))
            {
                for(positions p1 : positionsList) {

                    if (p1.getDescription().equals(newPlayer.getFirstPosition())) {
                        for(positions p2 : positionsList)
                        {
                            if(p2.getDescription().equals(newPlayer.getSecondPosition()))
                            {
                                for(positions p3 : positionsList)
                                {
                                    if(p3.getDescription().equals(newPlayer.getThirdPosition()))
                                    {
                                        players p = new players(newPlayer.getNumber(),newPlayer.getFirstName()
                                                ,newPlayer.getLastName(),newPlayer.getPassword(),baseS,pitchS,battS,p1,p2,p3,i);
                                        playersRepository.save(p);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        model = new ModelAndView("fragments/players");
        List<players> playersList = getPlayersList();
        model.addObject("playersList",playersList);
        return model;
    }

    private List<players> getPlayersList()
    {
        Iterable<players> playersL =playersRepository.findAll();
        List<players> playersList = new ArrayList<players>();
        for ( players i:playersL ) {
            if(i.getRole().getRole_description().equals("player")) {
                playersList.add(i);
            }
        }
        return playersList;
    }

    private List<roster> getRostersList()
    {
        Iterable<roster> RostersL = rosterRepository.findAll();
        List<roster> rosterList = new ArrayList<>();
        for( roster i:RostersL)
        {
            rosterList.add(i);
        }
        return rosterList;
    }

    @RequestMapping("/getOnePlayer")
    public players getOnePlayer(@RequestParam Integer number)
    {
        Iterable<players> playersList = playersRepository.findAll();
        for(players p : playersList)
        {
            if(p.getNumber() == number)
            {
                return p;
            }
        }
        return null;
    }
    @RequestMapping("/deletePlayer")
    public ModelAndView deletePlayer(@RequestParam Integer number, @ModelAttribute newPlayer newPlayer)
    {
        Iterable<players> playersList = playersRepository.findAll();
        for(players p : playersList)
        {
            if(p.getNumber() == number)
            {
                playersRepository.delete(p);
            }
        }
        playersList = getPlayersList();
        ModelAndView model = new ModelAndView("fragments/players");
        model.addObject("playersList",playersList);
        return model;
    }

    @GetMapping("/fragmentsHome")
    @ResponseBody
    public ModelAndView fragmentsHome(@ModelAttribute loginUser loginUser,HttpSession session)
    {
        ModelAndView model;
        if(session.getAttribute("lastName") != null) {
            model = new ModelAndView("fragments/home");
            model.addObject("loginUser", new loginUser());
        }
        else
        {
            model = new ModelAndView("loginError");
            model.addObject("message","Session expired! Login again");
        }
        return model;
    }



    @GetMapping("/fragmentsPlayers")
    @ResponseBody
    public ModelAndView fragmentsPlayers(newPlayer newPlayer)
    {
        List<players> playersList = getPlayersList();
        ModelAndView model = new ModelAndView("fragments/players");
        model.addObject("loginUser",new loginUser());
        model.addObject("playersList",playersList);
        return model;
    }

    @GetMapping("/fragmentsBaserunningStats")
    @ResponseBody
    public ModelAndView fragmentsBaserunningStats(newPlayer newPlayer)
    {
        List<players> playersList = getPlayersList();
        ModelAndView model = new ModelAndView("fragments/baserunning_statistics");
        model.addObject("loginUser",new loginUser());
        model.addObject("playersList",playersList);
        return model;
    }

    @GetMapping("/fragmentsBattingStats")
    @ResponseBody
    public ModelAndView fragmentsBattingStats(newPlayer newPlayer)
    {
        List<players> playersList = getPlayersList();
        ModelAndView model = new ModelAndView("fragments/batting_statistics");
        model.addObject("loginUser",new loginUser());
        model.addObject("playersList",playersList);
        return model;
    }

    @GetMapping("/fragmentsPitchingStats")
    @ResponseBody
    public ModelAndView fragmentsPitchingStats(newPlayer newPlayer)
    {
        List<players> playersList = getPlayersList();
        ModelAndView model = new ModelAndView("fragments/pitching_statistics");
        model.addObject("loginUser",new loginUser());
        model.addObject("playersList",playersList);
        return model;
    }

    @GetMapping("/fragmentsRoster")
    @ResponseBody
    public ModelAndView fragmentsRoster(newRoster newRoster)
    {
        List<players> playersList = getPlayersList();
        List<roster> rosterList = getRostersList();
        ModelAndView model = new ModelAndView("fragments/roster");
        model.addObject("loginUser",new loginUser());
        model.addObject("playersList",playersList);
        model.addObject("rosterList",rosterList);

        return model;
    }

    @GetMapping("/addRoster")
    @ResponseBody
    public ModelAndView addRoster(newRoster n)
    {
        roster r = new roster(n.getRosterName(),n.getPitcherName(),n.getCatcherName(),n.getFirstBaseName(),n.getSecondBaseName(),n.getShortstopName(),n.getThirdBaseName(),n.getLeftFieldName(),n.getCenterFieldName(),n.getRightFieldName());
        rosterRepository.save(r);
        List<players> playersList = getPlayersList();
        List<roster> rosterList = getRostersList();
        ModelAndView model = new ModelAndView("fragments/roster");
        model.addObject("loginUser",new loginUser());
        model.addObject("playersList",playersList);
        model.addObject("rosterList",rosterList);
        return model;
    }




}
