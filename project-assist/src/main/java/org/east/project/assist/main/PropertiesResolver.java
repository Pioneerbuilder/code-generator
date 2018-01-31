/**
 * 
 */
package org.east.project.assist.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

/**
 * @author tangxiaodong--2018年1月31日
 *
 */
public class PropertiesResolver {

    public static String MAIN_HEAD;
    // private static final String TEST_HEAD = "\\src\\test\\java\\";
    public static String PROJECT_HEAD;

    public static void getProperties() {
        ClasspathResourceLoader loader = new ClasspathResourceLoader();
        InputStream is = loader.getResourceStream("assist-conf.properties");
        Properties props = new Properties();
        try {
            props.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // String baseDir = props.getProperty("base.dir");
        // if (props.getProperty("base.dir") == null) {
        // throw new RuntimeException("请配置base.dir");
        // }

        String mainHead = props.getProperty("main.head");
        if (props.getProperty("main.head") == null) {
            throw new RuntimeException("请配置main.head");
        }
        MAIN_HEAD = mainHead;

        String projectHead = props.getProperty("project.head");
        if (props.getProperty("project.head") == null) {
            throw new RuntimeException("请配置project.head");
        }
        PROJECT_HEAD = projectHead;

        // TargetDir targetDir = Controller.getTargetDir();
        // targetDir.setBaseDir(baseDir);
        // targetDir.setDaoDir(baseDir + "dao");
        // targetDir.setMapperDir(baseDir + "dao" + "mapper");
        // targetDir.setServiceDir(baseDir + "service");
        // targetDir.setServiceImplDir(baseDir + "service" + "impl");
        //
        // if (props.getProperty("dao.dir") != null) {
        // targetDir.setDaoDir(props.getProperty("dao.dir"));
        // }
        // if (props.getProperty("service.dir") != null) {
        // targetDir.setServiceDir(props.getProperty("service.dir"));
        // }
        // if (props.getProperty("service.impl.dir") != null) {
        // targetDir.setServiceImplDir(props.getProperty("service.impl.dir"));
        // }
        // if (props.getProperty("mapper.dir") != null) {
        // targetDir.setMapperDir(props.getProperty("mapper.dir"));
        // }
    }
}
