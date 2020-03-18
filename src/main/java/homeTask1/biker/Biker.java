package homeTask1.biker;


import homeTask1.equipment.Equipment;

import java.util.ArrayList;
import java.util.List;

public class Biker {
    private List<Equipment> equip = new ArrayList<>();

    public Biker(){}

    public void addEquipment(Equipment e){
        equip.add(e);
    }

    public void deleteEquip(Equipment e){equip.remove(e);}
    public List<Equipment> getEquip()
    {
        return equip;
    }
}
