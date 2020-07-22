import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/**
 * Created by Enzo Cotter on 2020/6/2.
 */
public class test {
    public static void main(String[] args) {
       // System.out.println(args.length);
        String a ="en#%:12345678";
        a.contains("%");
       // System.out.println(a.split(":")[1].length());
      /*  for(int i = 0; i < args.length; i++){
            // 输出args数组的内容
            System.out.println(args[i]);
        }*/
        String b = "b";

        int e =1;
        int r = 2;
        int f ;

        HashSet set = new HashSet();
        set.add("1");
        set.add("2");
        set.add("3");
        String[] c1 =new String[set.size()];
        int w =1;
       // set.forEach(aqq1 -> c1[2] =aqq1 );
        //MathOperation g= (e, r) -> e + r;
       // GreetingService d = ("a") -> System.out.println("asd");
        String[] www ;
        String cc = "\"tags\": [\"pork knuckle\", \"beers\", \"fries\", \"nice food\", \"steak\", \"pax\", \"sentosa island\", \"sausage platter\", \"draft\", \"grand prix\", \"pretzels\", \"great beer\", \"german\", \"brotzeit\", \"asia\", \"bread\", \"branch\", \"gathering\", \"mash\", \"central european\", \"great german\", \"pizza\", \"potatoes\", \"weissbier\", \"german beer\", \"german food\", \"pretzel\"]\n";
        Pattern pattern = Pattern.compile("\"tags\":\\s*[\"(.*?)]\"");

        //String [] dd = cc.startsWith("\"");
        System.out.println(Arrays.toString(cc.toCharArray()));
    }

}

