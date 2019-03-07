package za.ac.pentec.cput_two;

import java.util.*;

public class Cheetah implements Cat{

    private String name;

    public Map<String, String> getMap(){
        Map<String,String> map = new HashMap<>();
        map.put("Dog","RSA");
        map.put("Lion","USA");
        map.put("Cat","RUS");
        map.put("Tiger","CHN");
        map.put("Dog","ENG");
        return map;
    }

    public Set<String> getSet(){
        Set<String> set = new HashSet<>();
        set.add("Tiger");
        set.add("Lion");
        set.add("Snake");
        set.add("Aligator");
        set.add("Killer Whale");

        return set;
    }

    public List<String> getList(){
        List<String> list = new LinkedList<>();
        list.add("SpringBok");
        list.add("Giraffee");
        list.add("Jaguar");
        list.add("Cheetah");
        list.add("Whale");

        return list;
    }

    public Collection<String> getCollection(){
        Collection<String> collect = new ArrayList<>();
        ((ArrayList<String>) collect).add("Eagle");
        collect.add("Dove");
        collect.add("Great White");
        collect.add("Crocodile");
        collect.add("Flying Fish");

        return collect;
    }

    @Override
    public String getSound(){

        return "Prrr";

    }
    @Override
    public boolean hasWiskers(){
        return true;
    }
    @Override
    public boolean isBigCat(){
        return true;
    }
    @Override
    public String move(){
        return "Walk";
    }
    public boolean hasFourLegs(){
        return true;
    }
    public String eat(){
        return "Steak";
    }

}

