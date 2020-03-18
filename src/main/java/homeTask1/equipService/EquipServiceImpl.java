package homeTask1.equipService;


import homeTask1.equipment.Equipment;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EquipServiceImpl implements EquipService {
    @Override
     public List<Equipment> sort(List<Equipment> e) {
        e.sort(Comparator.comparingDouble(Equipment::getWeight).reversed());
        return e;
    }

    @Override
    public List<Equipment> findByCriteria(List<Equipment> e, double min, double max) {
        return e.stream()
                .filter(x -> x.getCost() > min && x.getCost() < max)
                .collect(Collectors.toList());
    }

    @Override
    public double FullPrice(List<Equipment> e) {
        return e.stream()
                .mapToDouble(Equipment::getCost)
                .reduce(0.0,Double::sum);
    }
}
