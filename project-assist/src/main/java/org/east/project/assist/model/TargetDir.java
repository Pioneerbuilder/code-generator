/**
 * 
 */
package org.east.project.assist.model;

/**
 * @author tangxiaodong--2018年1月30日
 *
 */
public class TargetDir {

    private String baseDir;
    private String daoDir;
    private String mapperDir;
    private String serviceDir;
    private String serviceImplDir;

    public String getBaseDir() {
        return baseDir;
    }

    public void setBaseDir(String baseDir) {
        this.baseDir = baseDir;
    }

    public String getDaoDir() {
        return daoDir;
    }

    public void setDaoDir(String daoDir) {
        this.daoDir = daoDir;
    }

    public String getMapperDir() {
        return mapperDir;
    }

    public void setMapperDir(String mapperDir) {
        this.mapperDir = mapperDir;
    }

    public String getServiceDir() {
        return serviceDir;
    }

    public void setServiceDir(String serviceDir) {
        this.serviceDir = serviceDir;
    }

    public String getServiceImplDir() {
        return serviceImplDir;
    }

    public void setServiceImplDir(String serviceImplDir) {
        this.serviceImplDir = serviceImplDir;
    }

}
