package cn.qianxiaoxiao.dubbo.hello.provider;

import cn.qianxiaoxiao.dubbo.hello.api.HelloService;

public class HelloServiceImpl implements HelloService {

    public String hello(String name) {
        return "hello " + name;
    }
}
