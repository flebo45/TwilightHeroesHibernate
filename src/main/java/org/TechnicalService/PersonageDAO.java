package org.TechnicalService;

import org.Model.Monster;
import java.util.List;

public class PersonageDAO {

    public static List<Monster> findAllMonsters(){
        return EntityManager.getInstance().findAll(Monster.class);
    }

    //public List<Character>
}
