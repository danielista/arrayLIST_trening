package martinek.kosickaakademia;

import java.util.*;

public class MainArraylist {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(5);
        list.add(44);
        list.add(77);
        list.add(111);

        //1.sposob for loop
        System.out.println("1. sposob Using For Loop ");
        for (int i = 0; i < list.size();i++)
        {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        System.out.println("2. spôsob obyčajne ako referencia objektu :D");
        System.out.println(list);


        System.out.println("3. spôsob");
        //3: FOR EACH LOOP
        for (int temp:list){
            System.out.print(temp + " ");
        }

        System.out.println();
        System.out.println("4. spôsob");
        //4 ITERATOR
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }

        //5. sposob LAMBDA
        System.out.println();
        System.out.println("5. sposob LAMBDA výrazz");
        list.forEach((temp) -> System.out.print(temp + " "));

        //6. sposob ...
        System.out.println();
        System.out.println("6. sposobek");
        list.forEach(MainArraylist::write);

        //6.5 sposob
        System.out.println();
        System.out.println("6.5 = výpis druhých mocnín pomocou :::::");
        list.forEach(MainArraylist::power2);

        // výpis poľa a zároveň zmazanie všetkých nepárnych čísel
        //for(int temp:list){
        //    System.out.println(temp+" ");
        //    if((temp & 1) == 1)  // if(temp%2 == 1)
        //        list.remove(temp);
        //}

        //sorting arraylistu :D
        System.out.println();
        System.out.println("1. sposob USPORIADANIE POLA");
        Collections.sort(list);//ak chceš opačne pridaj ako 2. param toto: Collections.reverseOrder()
        System.out.println(list);

       /* // sorting podľa súčtu cifier :D
        System.out.println();
        System.out.println("sort podľa súčtu cifier prvkov");
        Collections.sort(list,((o1, o2) -> {
            int cs1 = digitSum(o1);
            int cs2 = digitSum(o2);
            if(cs1==cs2)return 0;
            else if (cs1 > cs2) return 1;
            else return -1;
        }));
        System.out.println(list);
*/
        // Ďalší spôsob :D
        System.out.println();
        System.out.println("Ďalší spôsob :D cez integer.triedu ..jakubov");
        Collections.sort(list,((o1, o2) -> {
            int cs1 = digitSum(o1);
            int cs2 = digitSum(o2);
            return Integer.compare(cs2,cs1);
        }));
        System.out.println(list);


        //
        System.out.println();
        System.out.println("kikov ultra riadok :::::::::");
        Collections.sort(list, Comparator.comparingInt(MainArraylist::digitSum));
        System.out.println(list);
    }

    public static void write(int m){
        System.out.print(m + " ");
    }

    public static int digitSum(int value){
        int sum = 0;
        int cifra ;
        //System.out.println("original value:" + value);

        while(value > 0)
        {
            cifra = value % 10;
            //System.out.println("po deleni: " +value);
            sum = sum + cifra;
            //System.out.println("SUM: " +sum);
            value = value / 10;
            //System.out.println("po odobratí poslednej cifry :D: " +value);
        }

        return sum;
    }

    public static void power2(int m){
        System.out.print(m*m + " ");
    }


}
