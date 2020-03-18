package homeTask1.equipService;


import homeTask1.equipment.Equipment;

import java.util.List;

public interface EquipService {
     List<Equipment> sort(List<Equipment> e);
     List<Equipment> findByCriteria(List<Equipment> e, double min, double max);
     double FullPrice(List<Equipment> e);
}
