package code.pragra.learning.studentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
@Builder
public class Item {
    private int ITEM_ID;
    private int SKU_ID;
    private String ITEM_NAME;
    private String ITEM_DESC;
    private int ITEM_PRICE;

}
