
import homeTask1.equipService.EquipServiceImpl;
import homeTask1.equipService.EquipService;

import homeTask1.biker.Biker;
import homeTask1.equipment.Equipment;
import homeTask1.equipment.elements.Chest;
import homeTask1.equipment.elements.Feet;
import homeTask1.equipment.elements.Helmet;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.containsInAnyOrder;


public class TestFirstTask {

    private static final Logger log = Logger.getLogger(TestFirstTask.class);

    private static Biker biker = new Biker();
    private EquipService methods = new EquipServiceImpl();
    private List<Equipment> equip = biker.getEquip();
    private double min=10.0;
    private double max = 20.0;


    @BeforeClass
    public static void initData(){
        biker.addEquipment(new Helmet("Dragon Helmet", 15, 1.25));
        biker.addEquipment(new Chest("Dragon Chest", 34.2, 5.11));
        biker.addEquipment(new Feet("Dragon Feet", 20.5, 3.15));
        BasicConfigurator.configure();
    }
    @Test
    public void shouldReturnFullPrice()throws Exception{
        log.info("Сумма всех элементов экипировки:" + methods.FullPrice(equip));
        assertEquals(69.7, methods.FullPrice(equip));


    }

    @Test
    public void shouldAddEquipInList()throws Exception{
        List<Equipment> expected = new ArrayList<>(List.of(
                new Chest("Dragon Chest", 34.2, 5.11),
                new Feet("Dragon Feet", 20.5, 3.15),
                new Helmet("Dragon Helmet", 15, 1.25)
                ));

       assertThat(expected, containsInAnyOrder(equip.toArray()));
    }

    @Test
    public void shouldSortByWeight()throws Exception{
        List<Equipment> expected = new ArrayList<>(List.of(
                new Chest("Dragon Chest", 34.2, 5.11),
                new Feet("Dragon Feet", 20.5, 3.15),
                new Helmet("Dragon Helmet", 15, 1.25)
        ));


        List<Equipment> actual = methods.sort(equip);
      log.info("Отсортированный список:\n" + actual);

        assertEquals(expected,actual);

    }

    @Test
    public void shouldFindElementsByCriteria()throws Exception{
        List<Equipment> list1 = new ArrayList<>(List.of(
                new Chest("Dragon Chest", 34.2, 5.11),
                new Feet("Dragon Feet", 20.5, 3.15),
                new Helmet("Dragon Helmet", 15, 1.25)
        ));

        List<Equipment> expected = methods.findByCriteria(list1,min,max);
        List<Equipment> actual = methods.findByCriteria(equip,min,max);
        assertThat(expected, containsInAnyOrder(actual.toArray()));
    }
}
