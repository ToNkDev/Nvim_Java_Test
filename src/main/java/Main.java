//TEST

                                                      //We import the java utils library to use many tools like ArrayLists and Randoms
import java.util.*;

                                                      //Main Class, which runs when running the program
public class Main {
                                                      //Our main ArrayList of the int type. Empty.
  public static ArrayList<Integer> main_arr = new ArrayList<>();
  public static Random rand = new Random();

                                                      //Custom print function for comfort
  public static void print(String msg){
    System.out.println(msg);
  }

                                                      //Swapping function of the void type (Doesnt have to return anything), takes a List and an index as parameters
  public static void sort_swap(ArrayList<Integer> container, int index){
                                                      //We swap the value undedr index with the value before the index (indedx-1)
    int temp = container.get(index);
    container.set(index,container.get(index-1));
    container.set(index-1,temp);
  }

                                                      //Bubble sorting function that returns the array once sorted
  public static ArrayList<Integer> sort(ArrayList<Integer> to_sort){
                                                      //We create 2 Boolean (true or false) variables, for controlling our sort
    Boolean sorted = false;                           //Controls the main loop
    Boolean didChange = false;                        //Is supposed to check (per iteration) if the array is sorted
    while(!sorted){                                   //Main loop, will keep going until array is confirmed to be sorted
      didChange = false;                              //We reset the didChange variable to false on every main loop iteration
      for(int i = 1;i<to_sort.size();i++){            //Internal loop, iterating over every element in the array
        if(to_sort.get(i) < to_sort.get(i-1)){        //We check if the previous element is bigger than the current one
          sort_swap(to_sort,i);                       //If it is, we call the swap function to swap the elements, so smaller ones go to the left
          didChange = true;                           //We mark that a swap happened.
        }
      }
                                                      //If no change was marked, that means the array is sorted, and we can break the loop and return the sorted array
      if(!didChange){ sorted=true; break; }
    }
    return to_sort;
  }
                                                      //Main function, it runs when the Main class is executed
  public static void main(String[] args){
                                                      //We fill the array with a 100 random numbers with a boundary of (1-100)
    for(int i=0 ; i<100;i++){
      int num = rand.nextInt(100)+1;
      main_arr.add(num);
    }
                                                      //We sort the array
    ArrayList<Integer> sorted = sort(main_arr);
    for(int i=0;i<sorted.size();i++){
                                                      //We display the sorted array
      print(Integer.toString(sorted.get(i)));
    }
  }
}
