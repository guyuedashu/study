package zMyTest;

import example.InnerAndOuterClass.Outer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

/**
 * @author huyunlong
 * @version 1.0.0
 * @history<br/> <p/>
 * @since 1.0.0
 */
public class DemoTest2 {

    public void inner(DemoTest emoTest)
    {
    }



    public static void main(String args[])
    {

        new DemoTest2().inner(new DemoTest(){

        });
//        new Outer().new Inner().a();

        System.err.println(new DemoTest2().aa());


    }

    private int aa()
    {
        Calendar calendar = Calendar.getInstance();
//        calendar.clear();
//        calendar.setTime(new Date());

        calendar.set(2019,8,9,0,0,0);
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeInMillis());

        calendar.add(Calendar.DATE,6);

        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeInMillis());




        System.out.println("年:"+calendar.get(Calendar.YEAR));
        System.out.println("月:"+calendar.get(Calendar.MONTH));//第一月为0
        System.out.println("日:"+calendar.get(Calendar.DATE));

        System.out.println("一个月的某天:"+calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("一个星期的某天:"+calendar.get(Calendar.DAY_OF_WEEK));//Sunday 0  Monday 1
        System.out.println("一个月第几周:"+calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //获得为 已周日开始算的
        System.out.println("一个月第几周:"+calendar.get(Calendar.WEEK_OF_MONTH));







        return 1;
    }
}
