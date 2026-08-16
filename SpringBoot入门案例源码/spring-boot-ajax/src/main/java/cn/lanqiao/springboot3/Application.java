package cn.lanqiao.springboot3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.out.println("启动 Spring Boot...");
        System.out.println("Spring Boot 项目实践之 Ajax 技术使用教程");
        System.out.println("http://127.0.0.1:8080/ajax-test.html");


        SpringApplication.run(Application.class, args);
    }
}