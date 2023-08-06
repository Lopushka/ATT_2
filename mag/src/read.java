import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class read {
    public List<toy> readFile() throws IOException {
        BufferedReader rd = new BufferedReader(new FileReader("Toys.csv"));
        String line = null;
        Scanner scan = null;
        int index = 0;
        List<toy> toyList = new ArrayList<>();
        toy toy;
        String [] data = new String[4];

        while ((line = rd.readLine()) != null) {
            scan = new Scanner(line);
            scan.useDelimiter(";");
            while (scan.hasNext()) {
                String dat = scan.next();
                data[index] = dat;
                index++;
            }
            index = 0;
            toy = new toy(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3]));
            toyList.add(toy);
        }
        rd.close();
        return toyList;
    }
}
