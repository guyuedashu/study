package Annotation;
/**
 * 注解的实现
 */

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


public class TestAnnotation {

    @MyAge(name = "我不知道",age = 1111111111)
    public void play(String name,int age) {
        System.err.println("name"+":="+name+"age"+":="+age);
    }


    public static void main(String[] args) {

        TestAnnotation testAnnotation = new TestAnnotation();

        Class clazz = TestAnnotation.class;
        try {
            Method play = clazz.getMethod("play",String.class,int.class);
//            boolean annotationPresent = play.isAnnotationPresent(MyAge.class);  //是否有指定注解
            play.isAnnotationPresent(MyAge.class);

            MyAge annotation = play.getAnnotation(MyAge.class);

            int age = annotation.age();
            String name = annotation.name();

            System.err.println(age);
            System.err.println(name);

            Object invoke = play.invoke(testAnnotation, name, age);


        } catch (Exception e) {
            e.printStackTrace();

        }
    }


}

