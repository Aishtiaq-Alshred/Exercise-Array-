import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

//        //sol-1
      int[] array = {50, -20, 0, 30, 40, 60, 10};
        System.out.println("array ="+ Arrays.toString(array));
        if (array.length >= 2) {
            boolean isSame = array[0] == array[array.length - 1];
            System.out.println("First and last elements are the same: " + isSame);
        }


        //sol-2
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(4);
        numbers.add(17);
        numbers.add(7);
        numbers.add(25);
        numbers.add(3);
        numbers.add(100);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.size();

        System.out.println("The average of the said array is: " + average);

        System.out.println("The numbers in the said array that are greater than the average are: ");
        for (int number : numbers) {
            if (number > average) {
                System.out.println(number + " ");
            }
        }

    //sol-3
       int[] a={20,30,40};
        System.out.println("Larger value between first and last element:"+Arrays.stream(a).max());

        //sol-4
        ArrayList<Integer> original =new  ArrayList();
        original.add(20);
        original.add(30);
        original.add(40);
        System.out.println("Original Array: "+original);
        original.set(0,40);
        original.set(1,30);
        original.set(2,20);
        System.out.println("New array after swapping the first and last elements: "+original);

        //sol-5
        ArrayList<Integer> original2 =new  ArrayList();
        original2.add(2);
        original2.add(3);
        original2.add(40);
        original2.add(1);
        original2.add(5);
        original2.add(9);
        original2.add(4);
        original2.add(10);
        original2.add(7);
        System.out.println("Original Array: "+original2);
        int i = 0, j = original2.size() - 1;
        for (int k = 0; k < original2.size(); k++) {
            if (original2.get(k) % 2 == 1) {
                original2.add(i, original2.remove(k));
                i++;
            } else {
                j--;
            }
        }

        System.out.println("Modified Array: " + original2);

        //sol-6
        ArrayList< Integer > one = new ArrayList();
        one.add(2);
        one.add(3);
        one.add(6);
        one.add(6);
        one.add(4);
        System.out.print(one);
        ArrayList< Integer > two = new ArrayList();
        two.add(2);
        two.add(3);
        two.add(6);
        two.add(6);
        two.add(4);
        System.out.println(two);
        if (one.equals(two)){
        System.out.println("Sample Output: true");}
        else  System.out.println("Sample Output: false");









        }

    }
