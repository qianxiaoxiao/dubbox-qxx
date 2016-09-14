package cn.qianxiaoxiao.dubbo.hello.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.qianxiaoxiao.dubbo.hello.api.HelloService;

public class HelloConsumer {
	public static void main(String[] args) { 
        //测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/*.xml");
        context.start();
        HelloService helloService = context.getBean(HelloService.class);
        System.out.println(helloService.hello("qianxiaoxiao"));
    }
 
 
    
}
