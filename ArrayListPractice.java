import java.util.*;
public class ArrayListPractice{
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> list1 = new ArrayList<>();

    for(int i = 0; i < 10; i++)
      list.add((int)(Math.random()*10)+1);

    System.out.println("First List: "+ list);

    for(int i = 0; i< 10; i++)
      list1.add((int)(Math.random()*10)+1);

    System.out.println("Second List: "+ list1);

    for (int i = 0; i < list1.size(); i++){
      list.add(list1.get(i));
    }
    System.out.println("Together: "+list);

  }
}