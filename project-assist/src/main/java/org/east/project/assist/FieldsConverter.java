package org.east.project.assist;

import org.apache.commons.lang3.StringUtils;

/**
 * 数据库中字段和实体类字段之间的转换类
 * 
 * 数据库中的字段通过下划线进行分割，java类中字段通过大小写分割
 * 
 * @author tangxiaodong
 *
 */
public class FieldsConverter {
   
   /**
    * 将数据库的属性转换成java类的属性，第一个属性段开头小写
    * @author tangxiaodong
    * @param dbField
    * @return 如果dbField不存在或者为空，则返回null
    */
   public static String getJavaClassAttr(String dbField) {

      if (StringUtils.isBlank(dbField)) {
         return null;
      }

      String[] fields = dbField.split("_");

      StringBuilder builder = new StringBuilder();
      int index = 0;

      for (String field : fields) {
         if ("".equals(field.trim())) {
            continue;
         }
         if (index == 0) {
            builder.append(field);
         } else {
            /* 将第一个字母转换成大写 */
            char firstChar = field.charAt(0);
            String firstString = ("" + firstChar).toUpperCase();
            /* 重新拼接 */
            String subStr = field.substring(1);
            builder.append(firstString).append(subStr);
         }

         index++;
      }

      return builder.toString();
   }

   /**
    * 首字母大写
    * @author tangxiaodong
    * @param dbField
    * @return
    */
   public static String getJavaClassName(String dbField) {

      if (StringUtils.isBlank(dbField)) {
         return null;
      }

      String[] fields = dbField.split("_");

      StringBuilder builder = new StringBuilder();

      for (String field : fields) {
         if (StringUtils.isBlank(field)) {
            continue;
         }
         /* 将第一个字母转换成大写 */
         char firstChar = field.charAt(0);
         String firstString = ("" + firstChar).toUpperCase();
         /* 重新拼接 */
         String subStr = field.substring(1);
         builder.append(firstString).append(subStr);

      }
      return builder.toString();
   }

   public static String getJavaTypeFromSqlType(String sqlType) {
      return SqlTypeMap.getJavaType(sqlType);
   }
   
}
