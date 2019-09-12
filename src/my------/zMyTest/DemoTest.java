package zMyTest;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author huyunlong
 * @version 1.0.0
 * @history<br/> <p/>
 * @since 1.0.0
 */
public class DemoTest {


    private int age = 10;

    public int sex = 1;

    public List<Integer> integers ;

    public static void main(String args[])
    {
        DemoTest demoTest = new DemoTest();
        demoTest.test();
        System.err.println(demoTest.integers);

    }

    public void test()
    {
//        JsonObject jsonObject = new JsonObject();
        integers = new LinkedList<>();
        integers.add(1);

    }


    static class Utils{
        /*转换int和byte*/
        public byte[] getIntToByte(int stauts)
        {

            byte[] bytes = new byte[4];

            bytes[0] = (byte)(stauts >> 0 & 0xFF);  //0-7
            bytes[1] = (byte)(stauts >> 8 & 0xFF);  //8-15
            bytes[2] = (byte)(stauts >> 16 & 0xFF);  //16-23
            bytes[3] = (byte)(stauts >> 24 & 0xFF);  //24-31

            return bytes;
        }

        public int getByteToInt(byte[] bytes)
        {
            final int a ;
            a = 1;

            int stauts = 0;

            for(int i = 3;i >= 0; i--)
            {
                stauts  <<= 8 ;
                stauts = stauts ^(bytes[i] & 0xFF) ;

            }
            return  stauts;
        }

        /**
         * 计算签名
         */
        public static String getSinature(String apiKey, String timestamp, String nonce)
        {

            String[] dataStrings = new String[]{apiKey,timestamp,nonce};
            Arrays.sort(dataStrings);
            String data = dataStrings[0] + dataStrings[1] + dataStrings[2];
            String newData = DigestUtils.shaHex(data);

            System.err.println(timestamp);
            System.err.println(nonce);

            System.err.println(newData);
            return data;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
