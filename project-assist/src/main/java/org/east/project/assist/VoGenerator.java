/**
 * 
 */
package org.east.project.assist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author tangxiaodong--2017年10月31日 自动生成数据库对象工具
 */
public class VoGenerator {


    private static final Logger logger = LoggerFactory.getLogger(VoGenerator.class);

    /**
     * 获取从数据库反射生成的java类
     * 
     * @param tableName
     * @return
     * @throws ClassNotFoundException
     */
    public static String getJavaClassStr(String schemaName, String tableName)
            throws ClassNotFoundException {

        // 驱动程序名
        String driver = "com.mysql.jdbc.Driver";

        // URL指向要访问的数据库名
        String url = "jdbc:mysql://stockwdb.uat.chunbo.com:3310/" + schemaName;

        // MySQL配置时的用户名
        String user = "stock";

        // MySQL配置时的密码
        String password = "HrPE@0az";


        Connection conn = null;
        PreparedStatement stat = null;
        ResultSet result = null;

        StringBuilder sqlBuilder = new StringBuilder(150)
                .append("SELECT COLUMN_NAME, DATA_TYPE, COLUMN_COMMENT FROM information_schema.`COLUMNS` ")
                .append("WHERE TABLE_NAME =").append("'").append(tableName).append("'")
                .append(" AND TABLE_SCHEMA = ").append("'").append(schemaName).append("'");

        // String sql = "SHOW FULL COLUMNS FROM " + tableName;
        String sql = sqlBuilder.toString();
        String className = FieldsConverter.getJavaClassName(tableName);
        StringBuilder builder = new StringBuilder("public class ");
        builder.append(className).append("{\n\n");

        try {
            // 加载驱动程序
            Class.forName(driver);

            // 连续数据库
            conn = DriverManager.getConnection(url, user, password);

            stat = conn.prepareStatement(sql);
            result = stat.executeQuery();
            while (result.next()) {
                // String fieldName = result.getString("Field");
                // String type = result.getString("Type");
                // String comment = result.getString("Comment");
                String fieldName = result.getString("COLUMN_NAME");
                String type = result.getString("DATA_TYPE");
                String comment = result.getString("COLUMN_COMMENT");
                /* 添加注释 */
                builder.append("\t/*").append(comment).append("*/\n");
                /* 插入属性 */
                builder.append("\t").append("private ")
                        .append(FieldsConverter.getJavaTypeFromSqlType(type)).append(" ")
                        .append(FieldsConverter.getJavaClassAttr(fieldName)).append(";\n\n");
            }
            builder.append("}");
        } catch (SQLException e) {
            logger.error("fail to generate java code!", e);
        } finally {
            close(result, stat, conn);
        }

        return builder.toString();
    }


    /**
     * 获取从数据库获取字段属性
     * 
     * @param tableName
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static List<TableColumnModel> getColumnList(String schemaName, String tableName)
            throws ClassNotFoundException, SQLException {

        // 驱动程序名
        String driver = "com.mysql.jdbc.Driver";

        // URL指向要访问的数据库名
        String url = "jdbc:mysql://wmswdb.uat.chunbo.com:3309/" + schemaName;

        // MySQL配置时的用户名
        String user = "wms";

        // MySQL配置时的密码
        String password = "Z@NRJOd7";


        Connection conn = null;
        PreparedStatement stat = null;
        ResultSet result = null;

        StringBuilder sqlBuilder = new StringBuilder(150)
                .append("SELECT TABLE_NAME,COLUMN_NAME, DATA_TYPE, COLUMN_COMMENT FROM information_schema.`COLUMNS` ")
                .append("WHERE TABLE_NAME =").append("'").append(tableName).append("'")
                .append(" AND TABLE_SCHEMA = ").append("'").append(schemaName).append("'");

        // String sql = "SHOW FULL COLUMNS FROM " + tableName;
        String sql = sqlBuilder.toString();
        String className = FieldsConverter.getJavaClassName(tableName);
        StringBuilder builder = new StringBuilder("public class ");
        builder.append(className).append("{\n\n");

        List<TableColumnModel> tcmList = new LinkedList<TableColumnModel>();

        try {
            // 加载驱动程序
            Class.forName(driver);

            // 连续数据库
            conn = DriverManager.getConnection(url, user, password);

            stat = conn.prepareStatement(sql);
            result = stat.executeQuery();
            while (result.next()) {
                TableColumnModel tcm = new TableColumnModel();
                tcm.setClassName(className);
                tcm.setTableName(tableName);
                tcm.setFieldName(result.getString("COLUMN_NAME"));
                tcm.setType(result.getString("DATA_TYPE"));
                tcm.setComment(result.getString("COLUMN_COMMENT"));
                tcmList.add(tcm);
            }
        } catch (SQLException e) {
            throw new SQLException(e);
        } finally {
            close(result, stat, conn);
        }

        return tcmList;
    }

    private static void close(ResultSet result, PreparedStatement stat, Connection conn) {

        try {
            if (result != null) {
                result.close();
                result = null;
            }

            if (stat != null) {
                stat.close();
                stat = null;
            }

        } catch (SQLException e) {
            logger.error("fail to release db conn!", e);
        }
    }

}
