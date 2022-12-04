//  1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
// 

// package HomeWork;
// import java.util.LinkedList;
// public class hm4 {
//    public static void main(String[] args) {
//       LinkedList<Integer> list = new LinkedList<Integer>();
//         list.add(1);
//         list.add(4);
//         list.add(9);
//         list.add(6);
//         list.add(2);

//         System.out.print("список до реверсии: " + list);
//         list = reverseLinkedList(list);
//         System.out.print("\nElements after reversing: " + list);
//     }
 //    private static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> listrev) {
//       LinkedList<Integer> revLinkedList = new LinkedList<Integer>();
//       for (int i = listrev.size() - 1; i >= 0; i--) {
//             revLinkedList.add(listrev.get(i));
//         }
//         return revLinkedList;
//    }
//    return null;
// }




// 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
//  first() - возвращает первый элемент из очереди, не удаляя.
// * В калькулятор добавьте возможность отменить последнюю операцию.

import java.util.LinkedList;
import java.util.Queue;

public class hm4 {
    public static void main(String[] args) {
        Queue myQueue = new Queue();
        myQueue.enQueue(3);
        myQueue.enQueue(2);
        myQueue.enQueue(1);
        
        myQueue.deQueue();
       
    }
    
    class Queue {
      int queueLength = 3;
      int items[] = new int[queueLength];
      int front = -1;
      int back = -1;
      boolean isFull(){
          if(back == queueLength - 1){
              return true;
          } else {
              return false;
          }
      }
      boolean isEmpty(){
          if(front == -1 && back == -1){
              return true;
          } else {
              return false;
          }
      }
       void enQueue(int itemValue) {
          if(isFull()){
              System.out.println("Queue is full");
          } else if(front == -1 && back == -1){
              front = back = 0;
              items[back] = itemValue;
          } else{
              back++;
              items[back] = itemValue;
          }
      }
       void deQueue(){
          if(isEmpty()){
              System.out.println("Queue is empty. Nothing to dequeue");
          } else if (front == back){
              front = back = -1;
          } else {
              front++;
          }
      }
      
    }
}

