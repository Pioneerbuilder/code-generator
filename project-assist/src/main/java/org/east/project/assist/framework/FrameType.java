/**
 * 
 */
package org.east.project.assist.framework;

import org.east.project.assist.FieldsConverter;
import org.east.project.assist.main.PropertiesResolver;

/**
 * @author tangxiaodong--2017年11月26日
 *
 */
public class FrameType {

    private String typeName;
    private String templateVmPath;
    private String filePath;
    private String packageUrl;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTemplateVmPath() {
        return templateVmPath;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getPackageUrl() {
        return packageUrl;
    }

    public FrameType(String typeName) {
        this.typeName = FieldsConverter.getJavaClassName(typeName);
        this.templateVmPath = PropertiesResolver.MAIN_HEAD + "vms\\bean" + this.typeName + ".vm";
        this.filePath = PropertiesResolver.MAIN_HEAD + PropertiesResolver.PROJECT_HEAD
                + typeName.replace("_", "\\");
        this.packageUrl =
                (PropertiesResolver.PROJECT_HEAD + typeName.replace("_", "\\")).replace("\\", ".");
    }
}
