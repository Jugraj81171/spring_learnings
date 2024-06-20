package code.pragra.learning.studentservice;

import code.pragra.learning.studentservice.dto.EmployeeDto;
import code.pragra.learning.studentservice.dto.Item;
import code.pragra.learning.studentservice.repository.EmployeeDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import code.pragra.learning.studentservice.repository.ItemDao;

import java.util.List;

@SpringBootApplication 
public class StudentServiceApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StudentServiceApplication.class, args);
        EmployeeDao employeeDao = context.getBean(EmployeeDao.class);
        ItemDao allItem = context.getBean(ItemDao.class);
        EmployeeDto employeeDto = EmployeeDto.builder().employeeId(3).
                employeeName("Sukhpreet").
                employeeAddress("15 Haviland Circle").
                employeeEmail("jugrajkaur970@gmail.com").
                employeePhoneNo("9057812057").
                build();
        employeeDao.save(employeeDto);


        // Item item =new Item(5,2345,"Monitor","It is a monitor screen",200);*//*

       /* Item firstItemByBuilder = Item.builder().
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
*/
        List<Item> allItems = allItem.getAllItems();
        allItems.forEach(System.out::println);
    }

}
