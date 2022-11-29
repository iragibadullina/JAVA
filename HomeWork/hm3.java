// 1. Реализовать алгоритм сортировки слиянием

// package HomeWork;

// public class hm3 {
    
// }

// 2. Пусть дан произвольный список целых чисел, удалить из него четные числа

// package HomeWork;

// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;

// public class hm3 {

//     public static void main(String[] args) {
//         List<Integer> list= new ArrayList<Integer>();
//         list.add(32);
//         list.add(82);
//         list.add(7);
//         list.add(1);
//         list.add(51);
//         list.add(86);
//         Iterator<Integer> it = list.iterator();
//         while(it.hasNext()){
//             Integer number= it.next();
//             if(number % 2 ==0){
//                 it.remove();
//             }
//         }
//         System.out.println("ArryList Odd Number="+list);
//     }
// }
  
    
// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class hm3 {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        list.add(32);
        list.add(82);
        list.add(7);
        list.add(1);
        list.add(51);
        list.add(86);
        int min = list.get(0);
        int max = list.get(0);

        for (Integer i: list) {
            if(i < min) 
                min = i;
            if(i > max) 
                max = i;
        }

        int evg = 0;
        int amountList = 0;
        for (Integer i: list){
            evg += i;
            amountList++;
        }
        evg = evg/amountList;

System.out.println("минимальное число: " + min);
System.out.println("максимальное число: " + max);
System.out.println("среднее число: " + evg);
    }
}
