package MyProxy;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.io.UnsupportedEncodingException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author huyunlong
 * @version 1.0.0
 * @history<br/> <p/>
 * @since 1.0.0
 */
public class AAA {

//    private final static LOGGER
    public int age ;

    private int a ;

    private Connection connection;

    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd*hh:mm:ss");

    public AAA() {

        try {

            Class.forName("com.mysql.jdbc.Driver");

             connection = (Connection) DriverManager.getConnection("jdbc:mysql://10.8.7.194:3306/tcsl_zw?useUnicode=true&characterEncoding=utf-8", "root", "root");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.err.println("init");

    }

    private void excute()
    {
        try {

            String sql = "select * from ATT_WIUN_BASE";
            Statement statement = (Statement)connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next())
            {

                System.err.println( resultSet.getString("WIUN_NAME"));

            }

            System.out.println( format.format(System.currentTimeMillis()));

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage()+"******************"+e.getSQLState()+"_____________"+e.getErrorCode());
        }
    }

    public void shcduleTimeTask()
    {
        Timer time = new Timer();
        time.schedule(new TimerTask() {
            @Override
            public void run() {
                excute();
            }
        },1000,1000*60*5);//3分钟执行

    }

    public static void main (String[] args)
    {
//        new AAA().shcduleTimeTask();

        try {
            String s = new String("??".getBytes("ISO-8859-1"),"UTF-8");

            AAA aaa = new AAA();
            aaa.age = 1;


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    @Override
    public String toString() {
        return "AAA{" +
                "age=" + age +
                ", a=" + a +
                ", connection=" + connection +
                ", format=" + format +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

}
