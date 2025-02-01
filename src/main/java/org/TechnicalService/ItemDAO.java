package org.TechnicalService;

import org.Model.Armor;
import org.Model.Weapon;

import java.util.List;

public class ItemDAO {

    public static List<Armor> findAllArmors(){
        return EntityManager.getInstance().findAll(Armor.class);
    }

    public static List<Weapon> findAllWeapons(){
        return EntityManager.getInstance().findAll(Weapon.class);
    }
}
