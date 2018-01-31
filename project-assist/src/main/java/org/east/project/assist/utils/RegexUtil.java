/**
 * 
 */
package org.east.project.assist.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * @author tangxiaodong--2017年6月5日
 * @description 字符串匹配
 */
public class RegexUtil {

    private static final String positiveInt = "^[1-9]\\d*$";
    private static final String email = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
    private static final String tel = "\\d{4}-\\d{8}|\\d{4}-\\d{7}|\\d(3)-\\d(8)";
    private static final String mobile = "^[1][3,5]+\\d{9}";
    private static final String chineseName = "^[\u4e00-\u9fa5]+$";
    private static final String orderId = "^[1-9]\\d{7}|[1-9]\\d{8}$";

    public static boolean checkPositiveInt(String value) {
        return value.matches(positiveInt);
    }

    public static boolean checkEmail(String value, int length) {
        return value.matches(email) && value.length() <= length;
    }

    public static boolean checkTel(String value) {
        return value.matches(tel);
    }

    public static boolean checkMobile(String value) {
        return value.matches(mobile);
    }

    public static boolean checkChineseName(String value, int length) {
        return value.matches(chineseName) && value.length() <= length;
    }

    /**
     * 
     * @author tangxiaodong--2017年6月5日
     * @description 单个订单号校验，多个订单号使用json
     * @methodName checkOrderId
     * @param orderId
     * 
     */
    public static boolean checkOrderId(String value) {
        if (StringUtils.isBlank(value)) {
            return false;
        }
        return value.matches(orderId);
    }
}
