import java.util.List;

public class pfile {
    public static void printFile(List<toy> toyList){
        for (toy item: toyList) {
            System.out.print(String.format("%s, ", item.getId()));
            System.out.print(String.format("%s, ", item.getName()));
            System.out.print(String.format("%s, ", item.getQuantity()));
            System.out.println(String.format("%s ",item.getWt()));
        }
    }

    public static void printFile(toy toy){
            System.out.print(String.format("%s. ", toy.getId()));
            System.out.print(String.format("%s, ", toy.getName()));
            System.out.print(String.format("%s, ", toy.getQuantity()));
            System.out.println(String.format("%s ", toy.getWt()));
        }

}
