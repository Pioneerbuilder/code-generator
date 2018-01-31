/**
 * 
 */
package org.east.project.assist;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

/**
 * @author tangxiaodong--2017年11月16日
 *
 */
public class MapperGenerator {

    /**
     * 拼接mapper的if test标签内容
     * 
     * @author tangxiaodong--2017年11月16日
     * @param attr
     * @param field
     * @param sb
     * @return
     */
    public static StringBuilder element(String attr, String field, StringBuilder sb) {
        return sb.append("<if test=\"").append(attr).append(" != null and ").append(attr)
                .append(" != ''\">").append("\n\t\t").append("and ").append(field).append(" = #{")
                .append(attr).append("}").append("\n\t").append("</if>");
    }

    /**
     * where 语句的生成
     * 
     * @author tangxiaodong--2017年11月16日
     * @param tclList
     * @param sb
     * @return
     */
    public static StringBuilder mapperWhere(List<TableColumnModel> tclList) {
        StringBuilder sb = new StringBuilder(1000);
        sb.append("<sql id=\"Base_Where_List\">\n\t");
        Iterator<TableColumnModel> it = tclList.iterator();
        do {
            TableColumnModel item = it.next();
            sb = MapperGenerator.element(item.getAttrName(), item.getFieldName(), sb);
            sb.append("\n");
            if (it.hasNext()) {
                sb.append("\t");
            }
        } while (it.hasNext());
        sb.append("</sql>");
        return sb;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String schemaName = "wmsinvdb";
        String tableName = "sku_main";
        List<TableColumnModel> tclList = VoGenerator.getColumnList(schemaName, tableName);
        StringBuilder sb = MapperGenerator.mapperWhere(tclList);
        System.out.println(sb);
    }

}
