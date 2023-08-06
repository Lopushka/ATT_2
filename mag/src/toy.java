import java.util.Scanner;

public class toy {

    private int id;
    private String name;
    private int quantity;
    private Double wt;
     Scanner iScanner = new Scanner(System.in);

    /**
     * @param id       id игрушки
     * @param name     название игрушки
     * @param quantity количество
     * @param wt       частота выпадения игрушки (вес в % от 100)
     */
    public toy(int id, String name, int quantity, Double wt) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.wt = wt;
    }

    /**
     * @return id игрушки
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getWt() {
        return wt;
    }

    public void setWt(Double wt) {
        this.wt = wt;
    }

    

}