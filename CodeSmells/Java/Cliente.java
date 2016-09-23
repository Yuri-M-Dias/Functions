package BadPracticesExample;

import java.util.List;

/**
 * Created by dyegospeciais on 22/09/2016.
 */
public class Client {
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        List<String> items = inventory.getStock();
        System.out.println(items.size());
    }
}
