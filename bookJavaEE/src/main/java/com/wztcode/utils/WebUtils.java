package com.wztcode.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.util.Map;

public class WebUtils {

    /**
     * 把 Map 中的值注入到对应的 JavaBean 属性中
     *
     * @param map
     * @param bean
     * @param <T>
     * @return
     */
    public static <T> T copyParamToBean(Map map, T bean) {
        try {
            System.out.println("注入之前：" + bean);
            /**
             * 把所有请求的参数都注入到 User 对象中
             */
            BeanUtils.populate(bean, map);
            System.out.println("注入之后：" + bean);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }

    /**
     * 将字符串转换为数字
     * @param str
     * @param defaultValue
     * @return
     */
    public static int parseInt(String str, int defaultValue) {
        try {
            int pageNo = Integer.parseInt(str);
            return pageNo;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return defaultValue;
    }
}
