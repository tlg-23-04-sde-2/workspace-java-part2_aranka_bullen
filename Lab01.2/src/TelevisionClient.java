import com.entertainment.Television;
import com.entertainment.Tuner;

public class TelevisionClient {
    public static void main(String[] args) {

        Television tv =new Television();
        Television tv2 = new Television("RCA", 10);
        Television tv3 = new Television("RCA",10);
        tv2.changeChannel(9);

        System.out.println(tv);
        System.out.println();
        System.out.println("tv2==tv3");

    }
}
