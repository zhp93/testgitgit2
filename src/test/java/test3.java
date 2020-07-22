import java.util.Arrays;
import java.util.List;

/**
 * Created by Enzo Cotter on 2020/6/16.
 */
public class test3 {
    public static void main(String[] args) {
        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        // 获取空字符串的数量
        long filterCount = strings.stream().filter(string -> string.isEmpty()).count();
        long mapCount = strings.stream().map(string -> string.isEmpty()).count();
        System.out.println(filterCount);
        System.out.println(mapCount);
    }

}
