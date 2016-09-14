package cn.qianxiaoxiao.dubbo.hello.provider;

import cn.qianxiaoxiao.dubbo.hello.api.HelloService;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.ext.*;

@Path("hello")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class HelloServiceImpl implements HelloService {
	
	@GET
	@Path("/say/{name}")
	@Produces({MediaType.APPLICATION_JSON})
    public String hello(@PathParam("name") String name) {
		System.out.println(name);
        return "hello " + name;
    }
}
