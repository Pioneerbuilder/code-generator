/**
 * 
 */
package org.east.project.assist;

import org.east.project.assist.utils.HumpLineConverterUtils;

/**
 * @author tangxiaodong--2017年11月15日
 *
 */
public class TableColumnModel {

    private String className;
    private String tableName;
    private String fieldName;
    private String type;
    private String comment;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getAttrName() {
        return HumpLineConverterUtils.lineToHump(fieldName);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
