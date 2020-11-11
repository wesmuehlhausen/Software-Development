
import java.util.*;
public class arrayListTest {
    private ArrayList<Integer> tester = new ArrayList<Integer>();

    public void tstLst(){
        System.out.println("Size: " + this.tester.size());
        tester.add(69420);
        tester.add(113);
        System.out.println("Size: " + this.tester.size());
        System.out.println("ArrayList: " + tester);
        tester.remove(1);
        System.out.println("ArrayList: " + tester);
    }
}