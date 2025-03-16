package org.TechnicalService;

import org.Model.Monster;
import org.Model.Character;
import java.util.List;

public class PersonageDAO {

    public static List<Monster> findAllMonsters(){
        return EntityManager.getInstance().findAll(Monster.class);
    }

    public static Character findCharacterByName(String name){
        return EntityManager.getInstance().findByAttribute(Character.class, "name", name);
    }

    //public List<Character>
}
