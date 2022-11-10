import java.util.*;

public class Main {
    public static void main(String[] args) {

        Stadium s1 = new Stadium("Luz", "Porutgal", 60000);
        Team t1 = new Team("Benfica", 1, 1, s1);

        Stadium s2 = new Stadium("Dragão", "Portugal", 47000);
        Team t2 = new Team("Porto", 2, 2, s2);

        ArrayList<Team> TeamArrayList = new ArrayList<Team>();

        TeamArrayList.add(t1);
        TeamArrayList.add(t2);
        System.out.println(TeamArrayList.toString());

        Vector<Stadium> stadiumVector = new Vector<Stadium>();
        stadiumVector.add(s1);
        stadiumVector.add(s2);
        System.out.println(stadiumVector.toString());

        Stack<Team> teamStack = new Stack<Team>();
        teamStack.push(t1);
        teamStack.push(t2);

        Team peakTeam = teamStack.peek();
        Team popTeam = teamStack.pop();

        while (!teamStack.empty()) {
            teamStack.pop();
        }

        List<Team> teamList = new LinkedList<Team>();
        //teamList.add(s1);
        //teamList.add(s2);

        Iterator<Team> iterator = teamList.iterator();

        while (iterator.hasNext()) {
        Team next = iterator.next();
        System.out.println(next.getClass());
        if(next.getStadium().getCapacity()< 60000){
            iterator.remove();
        }
        }
        for (Team team: teamList){
            System.out.println(team.toString());
        }
        for(Stadium stadium : stadiumVector){
            System.out.println(stadium);
        }

        Map<String, Stadium> stadiumMap = new HashMap<String, Stadium>();
        stadiumMap.put(s1.getName(), s1);
        stadiumMap.put(s2.getName(), s2);

        if(stadiumMap.containsKey("Luz")) {
            Stadium ss = stadiumMap.get("Luz");
        }

        Set<String> keys = stadiumMap.keySet();
        for (String key:keys){
            System.out.println(key);
        }

        Collection<Stadium> stadiumSet = stadiumMap.values();

    }

}