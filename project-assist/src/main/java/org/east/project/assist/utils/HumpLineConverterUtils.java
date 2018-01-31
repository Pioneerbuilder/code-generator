/**
 * 
 */
package org.east.project.assist.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author tangxiaodong--下午3:57:05
 * @description
 *
 */
public class HumpLineConverterUtils {

    /**
     * 此处使用"_([a-z])"匹配亦可，当"_"后为数字，lineToHump()起到删除"_"作用，数字字符.toUpperCase(),toLowerCase()不抛出异常
     */
    private static final Pattern linePattern = Pattern.compile("_(\\w)");

    private static final Pattern humpPattern = Pattern.compile("[A-Z]");

    /**
     * 
     * @author tangxiaodong--2017年6月20日
     * @description 下划线转驼峰
     * @param str
     * @return
     */
    public static String lineToHump(String str) {
        str = str.toLowerCase();
        Matcher matcher = linePattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    /**
     * 
     * @author tangxiaodong--2017年6月20日
     * @description 驼峰转下划线,效率高(首字母大写的话会以"_"开头)
     * @param str
     * @return
     */
    public static String humpToLine(String str) {
        Matcher matcher = humpPattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, "_" + matcher.group(0).toLowerCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    /**
     * 
     * @author tangxiaodong--2017年6月20日
     * @description 驼峰转下划线(简单写法，效率低于{@link #humpToLine(String)})
     * @param str
     * @return
     */
    public static String humpToLine2(String str) {
        return str.replaceAll("[A-Z]", "_$0").toLowerCase();
    }

    public static String getLowercaseChar(String str) {
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }


}
