import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    List<String> favs = new ArrayList<>();
        favs.add("pulp fiction");
        favs.add("hateful8");
        favs.add("real steal");
        favs.add("the room");
        favs.add("the french dispach");

        favs.remove(2);
        for (String movie: favs){
            System.out.println(movie);
        }
    }
}