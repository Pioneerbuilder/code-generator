/**
 * 
 */
package org.east.project.assist;

import java.sql.SQLException;

import com.alibaba.fastjson.JSONArray;

/**
 * @author tangxiaodong--2017年11月15日
 *
 */
public class EasyUIDataGridTest {

    private static String schemaName = "wmsinvdb";
    private static String tableName = "purchase_recv_detail";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        JSONArray jsonArray = EasyUiDataGridGenerator.getDataGridColumns(schemaName, tableName);
        System.out.println(jsonArray);
    }
}
