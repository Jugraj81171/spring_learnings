package code.pragra.learning.studentservice.common;

    public interface SqlQueries {

        String itemQuery = "select * from ITEM";
        String insertQuery = "Insert into ITEM values(?,?,?,?,?)";
        String itemNameClause = "select * from ITEM where item_name = ?";
    }
