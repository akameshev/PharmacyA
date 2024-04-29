package pharmacy.PharmacyA;

import java.util.Objects;

public class Component implements Comparable<Component>{
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return getName() + " " + getWeight() + " "+getPower()+" ";
    }

    @Override
    public int compareTo(Component o) {
        return Integer.compare(this.power,o.power);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return power == component.power && Objects.equals(name, component.name) && Objects.equals(weight, component.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, power);
    }

}
