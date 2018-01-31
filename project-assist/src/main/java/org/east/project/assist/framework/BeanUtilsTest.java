/**
 * 
 */
package org.east.project.assist.framework;

import org.east.project.assist.model.Admin;
import org.east.project.assist.model.People;
import org.east.project.assist.model.User;


/**
 * @author hongten<br>
 * @date 2013-3-10
 */
public class BeanUtilsTest {
    public static void main(String[] args) throws Exception {
        BeanUtilsTest beanUtilTest = new BeanUtilsTest();
        BeanUtils beanUtils = new BeanUtils();
        beanUtilTest.beanTool(beanUtils, User.class);
        beanUtilTest.beanTool(beanUtils, People.class);
        beanUtilTest.beanTool(beanUtils, Admin.class);
    }

    /**
     * 根据bean生成相应的文件
     * 
     * @param beanUtils
     * @param c
     * @throws Exception
     */
    public <T> void beanTool(BeanUtils beanUtils, Class<T> c) throws Exception {
        beanUtils.init(c);
        beanUtils.createBeanDao(c);
        beanUtils.createBeanDaoImpl(c);
        beanUtils.createBeanService(c);
        beanUtils.createBeanServiceImpl(c);
    }
}
