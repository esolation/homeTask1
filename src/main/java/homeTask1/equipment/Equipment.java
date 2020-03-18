package homeTask1.equipment;

import java.util.Objects;

public class Equipment{
     private String nameOf;
     private double cost;
     private double weight;

     public Equipment(){}

     public Equipment(String nameOf, double cost, double weight) {
         this.nameOf = nameOf;
         this.cost = cost;
         this.weight = weight;
     }

     public String getNameOf() {
        return nameOf;
    }

    public void setNameOf(String nameOf) {
        this.nameOf = nameOf;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

     @Override
     public String toString() {
         return "\n"+"Equipment{" +
                 "nameOf='" + nameOf + '\''  +
                 ", cost=" + cost  +
                 ", weight=" + weight +
                 '}';
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return Double.compare(equipment.cost, cost) == 0 &&
                Double.compare(equipment.weight, weight) == 0 &&
                nameOf.equals(equipment.nameOf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOf, cost, weight);
    }
}
