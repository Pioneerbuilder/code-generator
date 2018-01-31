/**
 * 
 */
package org.east.project.assist.main;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.east.project.assist.framework.FrameType;
import org.east.project.assist.model.Admin;

/**
 * @author tangxiaodong--2017年11月26日
 *
 */
public class Run {

    public static void main(String[] args) throws IOException, Exception {


        PropertiesResolver.getProperties();

        List<FrameType> ftList = new LinkedList<>();

        // ftList.add(new FrameType("dao_impl"));
        ftList.add(new FrameType("dao"));
        ftList.add(new FrameType("service"));
        ftList.add(new FrameType("service_impl"));
        // ftList.add(new FrameType("mapper"));

        List<Class<?>> clazzList = new LinkedList<>();
        clazzList.add(Admin.class);

        for (Class<?> c : clazzList) {
            for (FrameType ft : ftList) {
                Controller.run(c, ft, "java");
            }
        }
    }
}
