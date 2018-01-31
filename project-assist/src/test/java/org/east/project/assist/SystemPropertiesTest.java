/**
 * 
 */
package org.east.project.assist;

import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author tangxiaodong--2017年11月27日
 *
 */
public class SystemPropertiesTest {

    private static void printSystemProperty() {
        Properties property = System.getProperties();
        Set<String> names = property.stringPropertyNames();
        Set<String> sort = new TreeSet<String>();// 排下序
        for (String name : names) {
            sort.add(name);
        }
        for (String name : sort) {
            System.out.println(name + "=" + property.getProperty(name));
        }
    }

    public static void main(String[] args) {
        SystemPropertiesTest.printSystemProperty();
    }
}
