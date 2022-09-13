import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        Map<String ,String> m = Map.of("1","1","2","0","3","0");
        System.out.println(m.get(1)+":"+m.get("1"));
        for (Map.Entry<String ,String> map:
        m.entrySet()){
            System.out.println(map.getKey()+":"+map.getValue());
        }
        try {
            System.out.println("try");
        } catch (Exception e){
            System.out.println("catch");
        }
        int i = 10;
        switch (i){
            case 1:
                System.out.println("case");
            default:
                System.out.println("default");
        }
    }
}
