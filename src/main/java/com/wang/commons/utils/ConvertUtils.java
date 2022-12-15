package com.wang.commons.utils;

/**
 * @author 王念
 * @create 2022-12-15 15:57
 */
public class ConvertUtils {
    private ConvertUtils() {
    }

    public static String stringIdRepresentation(Object idValue) {
        if (idValue == null)
            return null;

        if (idValue instanceof Number) {
            return String.valueOf(idValue);
        }

        if (idValue instanceof String) {
            return (String) idValue;
        }

        return idValue.toString();
    }

}
