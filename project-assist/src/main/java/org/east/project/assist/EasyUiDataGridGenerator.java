/**
 * 
 */
package org.east.project.assist;

import java.sql.SQLException;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author tangxiaodong--2017年11月15日
 *
 */
public class EasyUiDataGridGenerator {

    public static JSONArray getDataGridColumns(String schemaName, String tableName)
            throws ClassNotFoundException, SQLException {
        List<TableColumnModel> tclList = VoGenerator.getColumnList(schemaName, tableName);
        JSONArray jsonArray = new JSONArray();
        for (TableColumnModel model : tclList) {
            JSONObject column = new JSONObject();
            column.put("align", "center");
            column.put("field", model.getAttrName());
            column.put("title", model.getComment());
            column.put("width", 80);
            jsonArray.add(column);
        }
        return jsonArray;
    }
}
