package com.rslakra.codestyles.utils;

/**
 * Simple ToString utility class.
 * 
 * @author Rohtash Lakra
 */
public class ToString {
    private StringBuilder sb;
    private Class<?> clazz;

    private ToString(Class<?> clazz) {
        this.clazz = clazz;
        this.sb = new StringBuilder();
    }

    public static ToString of(Class<?> clazz) {
        ToString toString = new ToString(clazz);
        toString.sb.append(clazz.getSimpleName()).append("{");
        return toString;
    }

    public static ToString of() {
        ToString toString = new ToString(null);
        toString.sb.append("{");
        return toString;
    }

    public ToString add(String name, Object value) {
        if (sb.length() > 1 && !sb.toString().endsWith("{")) {
            sb.append(", ");
        }
        sb.append(name).append("=").append(value);
        return this;
    }

    @Override
    public String toString() {
        return sb.append("}").toString();
    }
}
