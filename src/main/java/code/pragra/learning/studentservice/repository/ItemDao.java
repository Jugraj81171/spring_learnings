package code.pragra.learning.studentservice.repository;

import code.pragra.learning.studentservice.common.SqlQueries;
import code.pragra.learning.studentservice.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ItemDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Item> getAllItems() {


       /* StringBuilder builder = new StringBuilder(SqlQueries.itemQuery);
        builder.append(SqlQueries.itemQuery);*/

        String my_sql = "select * from ITEM";

       /* RowMapper<Item> rowMapper = new RowMapper<Item>() {

            @Override
            public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
                Item item = new Item();
                item.setITEM_ID(rs.getInt("ITEM_ID"));
                item.setSKU_ID(rs.getInt("SKU_ID"));
                item.setITEM_NAME(rs.getString("ITEM_NAME"));
                item.setITEM_DESC(rs.getString("ITEM_DESC"));
                item.setITEM_PRICE(rs.getInt("ITEM_PRICE"));
                return item;
            }
        };
        return jdbcTemplate.query(my_sql,rowMapper);
*/
      return  jdbcTemplate.query(my_sql, new BeanPropertyRowMapper<Item>(Item.class));


    }
    public void addItem(Item item){

        int rowsAffected = jdbcTemplate.update(SqlQueries.insertQuery,
                item.getITEM_ID(),
                item.getSKU_ID(),
                item.getITEM_NAME(),
                item.getITEM_DESC(),
                item.getITEM_PRICE());

        System.out.println("Number of Rows Effected " +rowsAffected);
    }
}