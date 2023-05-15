import com.entertainment.Television;


import java.util.HashSet;
import java.util.Set;

public class TelevisionClient {
    public static void main(String[] args) {

       // eaxime behavior of  == and equals()
        Television tv2 = new Television("Sony", 10);
        Television tv3 = new Television("Sony",10);
        tv2.changeChannel(9);


        System.out.println(tv);
        System.out.println();
        System.out.println("tv2==tv3" + (tv2 == tv3));         // refer to same object?
        System.out.println(" tv2 equals (tv3)" + tv2.equals(tv3));      //exhibit "equality"?

        System.out.println(tv2.hashCode());
        System.out.println(tv3.hashCode());

        Set<Television> tvs = new HashSet<>();
        tvs.add(tv2);
        tvs.add(tv3);       //Should be rejected as a duplicate, and size is still 1.
        System.out.println("The size of the Set is: ", tvs,size());


    }
}
