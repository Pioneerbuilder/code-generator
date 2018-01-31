/**
 * 
 */
package org.east.project.assist.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.east.project.assist.framework.Annotation;
import org.east.project.assist.framework.Bean;
import org.east.project.assist.framework.FrameType;
import org.east.project.assist.model.TargetDir;
import org.east.project.assist.utils.HumpLineConverterUtils;

/**
 * @author tangxiaodong--2017年11月26日
 *
 */
public class Controller {

    private static TargetDir targetDir = new TargetDir();
    private static Bean bean = new Bean();
    private static Annotation annotation = new Annotation();

    public static <T> void run(Class<T> c, FrameType ft, String fileType)
            throws IOException, Exception {
        Controller.init(c);
        Controller.generate(c, ft, fileType);
    }

    /**
     * 初始化bean和注解
     * 
     * @param c
     */
    public static <T> void init(Class<T> c) {
        if (c != null) {
            bean.setName(c.getSimpleName());
            bean.setTableName(HumpLineConverterUtils.humpToLine(c.getSimpleName()).substring(1));
            bean.setBeanUrl(c.getName());
            bean.setLowerName(HumpLineConverterUtils.getLowercaseChar(c.getSimpleName()));

            annotation.setAuthorName(System.getProperty("user.name"));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            annotation.setDate(simpleDateFormat.format(new Date()));
            annotation.setVersion("1.0");
        }
    }

    public static <T> void generate(Class<T> c, FrameType ft, String fileType)
            throws IOException, Exception {
        String path = System.getProperty("user.dir") + ft.getFilePath() + "\\";
        File filePath = new File(path);
        createFilePath(filePath);

        String fileName = path + c.getSimpleName() + ft.getTypeName() + "." + fileType;
        File file = new File(fileName);
        FileWriter fw = new FileWriter(file);

        bean.setBeanTypeUrl(ft.getPackageUrl());
        bean.setTypeName(ft.getTypeName());

        String docStr = createCode(ft.getTemplateVmPath(), bean, annotation);

        fw.write(docStr);
        fw.flush();
        fw.close();
        showInfo(fileName);
    }

    /**
     * 根据模板生成代码
     * 
     * @param fileVMPath 模板路径
     * @param bean 目标bean
     * @param annotation 注释
     * @return
     * @throws Exception
     */
    private static String createCode(String fileVMPath, Bean bean, Annotation annotation)
            throws Exception {
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.setProperty("input.encoding", "UTF-8");
        velocityEngine.setProperty("output.encoding", "UTF-8");
        velocityEngine.init();
        Template template = velocityEngine.getTemplate(fileVMPath);
        VelocityContext velocityContext = new VelocityContext();
        velocityContext.put("bean", bean);
        velocityContext.put("annotation", annotation);
        StringWriter stringWriter = new StringWriter();
        template.merge(velocityContext, stringWriter);
        return stringWriter.toString();
    }

    /**
     * 创建文件
     * 
     * @param file
     */
    private static void createFilePath(File file) {
        if (!file.exists()) {
            System.out.println("创建[" + file.getAbsolutePath() + "]情况：" + file.mkdirs());
        } else {
            System.out.println("存在目录：" + file.getAbsolutePath());
        }
    }

    /**
     * 显示信息
     * 
     * @param info
     */
    private static void showInfo(String info) {
        System.out.println("创建文件：" + info + "成功！");
    }

    public static TargetDir getTargetDir() {
        return targetDir;
    }

    public static void setTargetDir(TargetDir targetDir) {
        Controller.targetDir = targetDir;
    }

}
