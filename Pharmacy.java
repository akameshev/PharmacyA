package pharmacy.PharmacyA;

import java.util.*;

public class Pharmacy implements Iterator<Component>,Comparable<Component>,Iterable<Component>{
    private int index;
    private List<Component> components;
    private String name;
    public Pharmacy(){
        this.index = 0;
        this.components = new ArrayList<>();
    }
    public Pharmacy(String name){
        this.index = 0;
        this.components = new ArrayList<>();
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public List<Component> getComponents() {
        return components;
    }

    public String getName() {
        return name;
    }
    public void addComponent(Component...components){
        if(components.length ==0) System.out.println("Ничего не добавлено в "+this.name);
        else Collections.addAll(this.components,components);
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }

    @Override
    public int compareTo(Component o) {
        return Integer.compare(o.hashCode(), this.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return Objects.equals(components, pharmacy.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components);
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

}
