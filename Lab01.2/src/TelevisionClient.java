import com.entertainment.Television;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TelevisionClient {
    public static void main(String[] args) {

       // eaxime behavior of  == and equals()
        Television tvA = new Television("Sony", 50);
        Television tvB = new Television("Sony",50);
        Television tvC = new Television("Samsung",47);
        Television tvD = new Television("LG", 52);

        System.out.println("tvA==tv3" + (tvA == tvB));         // refer to same object?
        System.out.println(" tvA equals (tv3)" + tvA.equals(tvB));      //exhibit "equality"?
        System.out.println();

// TreeSet example
        Set<Television> tvs = new HashSet<>();
        tvs.add(tvA);
        tvs.add(tvB);
        tvs.add(tvC);
        tvs.add(tvD);

        //HashSet Example
//        Set<Television> tvs = new HashSet<>();
//        tvs.add(tvA);
//        tvs.add(tvB);       //Should be rejected as a duplicate, and size is still 1.


        System.out.println("The size of the Set is: " + tvs.size());
      for (Television tv: tvs) {
          System.out.println(tv);
      }
    }
}
