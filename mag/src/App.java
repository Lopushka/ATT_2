import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        game game = new game();
        save csv = new save();
        List<toy> toys = game.creat();
        csv.writeResult(toys.get(0), false);
        toys.remove(0);
        for (toy item : toys) {
            csv.writeResult(item, true);
        }
        iuser us = new iuser();
        us.menu();
    }
}
