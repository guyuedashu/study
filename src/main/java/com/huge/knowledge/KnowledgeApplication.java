package com.huge.knowledge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KnowledgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(KnowledgeApplication.class, args);

        try {
            int bb = new KnowledgeApplication().bb();
        } catch (Exception e) {
            System.err.println(2222);

        }
    }

    public int bb() throws Exception {
        System.err.println(000000000000);
        aa();
        System.err.println(9999999);
        
        return 11;
    }

    public void aa() throws Exception {
        try{
        }catch (Exception e)
        {
            System.err.println(1111);
            throw new Exception();

        }finally {
            System.err.println(123123);
        }


    }

}
