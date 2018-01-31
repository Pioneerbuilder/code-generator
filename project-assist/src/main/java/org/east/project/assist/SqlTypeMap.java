/**
 * 
 */
package org.east.project.assist;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tangxiaodong--2017年10月31日
 *
 */
public class SqlTypeMap {

   private static final String CHAR = "char";
   private static final String VARCHAR = "varchar";
   private static final String BOOLEAN = "boolean";
   private static final String INT = "int";
   private static final String BIGINT = "bigint";
   private static final String SMALLINT = "smallint";
   private static final String TINYINT = "tinyint";
   private static final String DECIMAL = "decimal";
   private static final String DATE = "date";
   private static final String DATETIME = "datetime";
   private static final String TIMESTAMP = "timestamp";
   
   private static final String STRING = "String";
   private static final String JBOOLEAN = "Boolean";
   private static final String INTEGER = "Integer";
   private static final String LONG = "Long";
   private static final String SHORT = "Short";
   private static final String BYTE = "Byte";
   private static final String BIGDECIMAL = "BigDecimal";
   private static final String JDATE = "Date";
   
   private static final Map<String, String> TYPEMAP = new HashMap<String, String>();
   
   private static void init() {
      TYPEMAP.put(CHAR, STRING);
      TYPEMAP.put(VARCHAR, STRING);
      TYPEMAP.put(BOOLEAN, JBOOLEAN);
      TYPEMAP.put(INT, INTEGER);
      TYPEMAP.put(BIGINT, LONG);
      TYPEMAP.put(SMALLINT, SHORT);
      TYPEMAP.put(TINYINT, BYTE);
      TYPEMAP.put(DECIMAL, BIGDECIMAL);
      TYPEMAP.put(DATE, JDATE);
      TYPEMAP.put(DATETIME, JDATE);
      TYPEMAP.put(TIMESTAMP, JDATE);
   }
   
   /**
    * 提供数据库类型的转换
    * @author tangxiaodong--2017年10月31日
    * @param sqlType
    * @return
    */
   public static String getJavaType(String sqlType) {
      init();
      return TYPEMAP.get(sqlType);
   }
}
