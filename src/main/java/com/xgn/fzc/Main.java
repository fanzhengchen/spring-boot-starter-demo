package com.xgn.fzc;



import com.fzc.starter.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-06-19
 * Time: 4:30 PM
 *
 * @author: MarkFan
 * @since v1.0.0
 */

@SpringBootApplication
public class Main implements CommandLineRunner {


    @Resource
    HelloService helloService;


    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        helloService.hello();
        System.out.println(helloService.message());
    }


}
