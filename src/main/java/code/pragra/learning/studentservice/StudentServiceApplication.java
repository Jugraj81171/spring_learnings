package code.pragra.learning.studentservice;

import code.pragra.learning.studentservice.model.Item;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import code.pragra.learning.studentservice.repository.ItemDao;

import java.util.List;

@SpringBootApplication
public class StudentServiceApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StudentServiceApplication.class, args);
       /* Item item =new Item(5,2345,"Monitor","It is a monitor screen",200);*/
        ItemDao allItem = context.getBean(ItemDao.class);
        Item firstItemByBuilder = Item.builder().
                ITEM_ID(7).
                SKU_ID(2345).
                ITEM_NAME("Monitor").
                ITEM_DESC("It has a screen").
                ITEM_PRICE(200).
                build();
        allItem.addItem(firstItemByBuilder);
        Item secondItemByBuilder = Item.builder().
                ITEM_ID(8).
                SKU_ID(2345).
                ITEM_NAME("Laptop").
                ITEM_DESC("I have Nokia Laptop ").
                ITEM_PRICE(200).
                build();
        allItem.addItem(secondItemByBuilder);

        List<Item> allItems = allItem.getAllItems();
        allItems.forEach(System.out::println);
    }

}
