package martinek.kosickaakademia.collectiontraining;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getLname() == o2.getLname()){
            return o1.getFname().compareToIgnoreCase(o2.getFname());
        }
        return o1.getLname().compareToIgnoreCase(o2.getLname());
    }
}
