package com.cmy.java8;

import javax.lang.model.element.TypeElement;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by cmy on 2017/9/19
 */
public class Test2 {

    public static void main(String[] args) throws Exception {


        Class<?> cls = Test3.class;

        Method method = cls.getMethod("test");

        for (Annotation annotation : method.getDeclaredAnnotations()) {
            System.out.print(annotation.annotationType());
            if (annotation instanceof TypeElement) {
                System.out.print("yes");
            }
        }


    }

}
