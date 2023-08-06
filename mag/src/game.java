import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class game {
    public List<toy> elementWeight(List<toy> toyList) {
        pfile pf = new pfile();
        if (toyList.size() > 0) {
            ArrayList<Double> weights = new ArrayList<>();
            double sum = 1.0;
            double cnt = 0;
            for (toy item : toyList) {
                weights.add(item.getWt());
                sum += item.getWt();
            }
            Random rnd = new Random();
            int rndNumber = rnd.nextInt((int)sum);

            for (toy item : toyList) {
                cnt += item.getWt();
                if (cnt >= rndNumber) {
                    if (item.getQuantity() > 0) {
                        System.out.printf("Игрушка: %s, %d\n", item.getName(), item.getQuantity());
                        item.setQuantity(item.getQuantity() - 1);
                        break;
                    } else {
                        System.out.printf("Игрушка: %s, %d\n", item.getName(), item.getQuantity());
                        toyList.remove(item);
                        break;
                    }
                }
            }
        } else {
            System.out.println("Пусто");
        }

        return toyList;
    }

    public List<toy> addToy(List<toy> toys, toy toy) {
        for (toy item : toys) {
            if (item.getName().equals(toy.getName())) {
                item.setQuantity(item.getQuantity() + toy.getQuantity());
                System.out.println("Уже есть");
                return toys;
            }
        }
        toys.add(toy);

        return toys;
    }

    public List<toy> creat() {
        toy toy1 = new toy(1, "Cat", 10, 12.2);
        toy toy2 = new toy(2, "Dog", 10, 12.2);
        toy toy3 = new toy(3, "Fox", 10, 40.0);
        toy toy4 = new toy(4,"dog",10, 20.0);
        List<toy> toys = new ArrayList<>();
        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);
        toys.add(toy4);
       
        return toys;
    }
}
