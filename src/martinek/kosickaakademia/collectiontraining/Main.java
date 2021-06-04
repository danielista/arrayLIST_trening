package martinek.kosickaakademia.collectiontraining;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main implements Comparator<Person> {
    public static void main(String[] args) {
        List<Person> listOfPersons = new ArrayList<>();
        listOfPersons.add(new Person("Daniel","Martinek",'m',7));
        listOfPersons.add(new Person("František","Martinek",'m',28));
        listOfPersons.add(new Person("Dominika","Erdelyova",'f',26));
        listOfPersons.add(new Person("Peter","Nagy",'m',19));
        listOfPersons.add(new Person("Kristián","Smolko",'m',21));
        listOfPersons.add(new Person("Darinka","Kolesárová",'f',33));
        listOfPersons.add(new Person("Andrea","Kolesárová",'f',3));
        listOfPersons.add(new Person("Janka","Kolesárová",'f',73));
        listOfPersons.add(new Person("Alenka","Kolesárová",'f',-3));
        listOfPersons.add(new Person("Žofka","Kolesárová",'f',13));

        // age sorting
        System.out.println();
        System.out.println("SORTING PODLA VEKU ;)");
        listOfPersons.sort(Comparator.comparingInt(Person::getAge));
        //listOfPersons.sort((o1, o2) -> o1.getAge()-o2.getAge());
        printList(listOfPersons);

        // last name sorting and first name as well
        System.out.println();
        System.out.println("podla mena");
        Collections.sort(listOfPersons,new NameComparator());
        printList(listOfPersons);


        // nový list len pre ženy :D
        List<Person> listFemale;
        listFemale = listOfPersons.stream().filter(obj-> obj.getGender() == 'f').collect(Collectors.toList());
        System.out.println(        );
        System.out.println(  "IBA žeeeny: ;)"  );
        printList(listFemale);


        //hasmap
        System.out.println();
        System.out.println("HASHCODE");
        Person la = new Person("Žofaaaaaaka","Martinekovová",'f',23);
        System.out.println(la.hashCode("Žofaaaaaaka","Martinekovová"));


        // randomne rozhádzať poradie ORDER RANDOMIZE "SHUFFLE"
        System.out.println();
        System.out.println("RANDOMNE PORADIE MIEN ;) :D");
        Collections.shuffle(listOfPersons);
        printList(listOfPersons);


        // nový list len pre osoby mladšie ako 10 rokov
        List<Person> youngPeople;
        youngPeople = listOfPersons.stream().filter(obj-> obj.getAge() < 10).collect(Collectors.toList());
        System.out.println(        );
        System.out.println(  "IBA mladší ako 10 rokov: ;)"  );
        printList(youngPeople);

        byte b1 = (byte) (127 + 21);
        System.out.println(b1);


    }

    private static void printList(List<Person> list){
        list.forEach((obj)->{
            System.out.println(obj.getFname() +" "+ obj.getLname()+" "+obj.getAge());
        });
    }

    @Override
    public int compare(Person o1, Person o2) {
        return o2.getFname().compareToIgnoreCase(o1.getFname());
    }

    public static int komparink(Person o1, Person o2) {
        return o2.getFname().compareToIgnoreCase(o1.getFname());
    }

}
