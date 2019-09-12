package example.InnerAndOuterClass;

/**
 * @author huyunlong
 * @version 1.0.0
 * @history<br/> <p/>
 * @since 1.0.0
 */
/*
 *  有静态方法的内部类一定是静态内部类
 *
 * 非静态内部类必须由外部类实例化之后才能实例化
 *       new Outer().new Inner(); 不可访问外部的非静态资源
 *
 * 静态内部类 可直接调用
 *       new Outer.Inner();实例化
 *
 *  外部类.this.成员方法 　　而且无论外部类的成员变量或成员方法的访问权限是什么，内部类统统都可以访问

 * */
public class Outer {

    private static int age = 0 ;

    public void a()
    {

        System.err.println("我是外部类");
    }

    public class Inner{

        private int age = 0 ;
        public void a()
        {
            Outer.this.age = 2;/*********内部类访问外部变量*****/
            Outer.this.a();/*********内部类访问外部方法*****/

            System.err.println("我是非静态内部类"+age);
        }
    }

    static class InnerStatic
    {

        public static void a()
        {

            System.err.println("我是静态内部类");
        }
    }

    public int getAge() {

        char a = 'a';
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


