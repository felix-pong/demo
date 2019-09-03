package com.huawei.springdemo.utils;

/**
 * @author Happyness
 */
public abstract class ClassUtils {

  public static ClassLoader getDefaultClassLoader() {
    ClassLoader cl = null;
    try {
      cl = Thread.currentThread().getContextClassLoader();
    } catch (Throwable ex) {
      //
    }
    if (cl == null) {
      cl = ClassUtils.class.getClassLoader();
      if (cl == null) {
        try {
          cl = ClassLoader.getSystemClassLoader();
        } catch (Throwable ex) {
          //
        }
      }
    }
    return cl;
  }
}
