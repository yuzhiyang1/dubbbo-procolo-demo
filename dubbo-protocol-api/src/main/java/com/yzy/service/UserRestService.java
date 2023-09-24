package com.yzy.service;

import org.apache.dubbo.rpc.protocol.rest.support.ContentType;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("users") //这是一个JAX-RS注解，用于指定RESTful Web服务的URL路径。在这个例子中，它将匹配到"/users"这个路径。
@Consumes({MediaType.APPLICATION_JSON}) //这个注解表示这个方法接收和返回的数据类型是JSON。
//client给服务器端 发送的请求数据 json @RequestBody
@Produces({ContentType.APPLICATION_JSON_UTF_8})
public interface UserRestService {

    /**
     * 登录
     *
     * @param name     名称
     * @param password 密钥
     * @return {@code Boolean}
     */
    @GET
    // @GetMapping RequestMapping(method=get) //@GetMapping RequestMapping(method=get)：这两个注解都是用于映射HTTP GET请求的，其中@GetMapping是Spring框架提供的注解，而// @GetMapping是Javadoc注释，功能相同。
    @Path("{name}/{password}") //@PathVariable //@GetMapping RequestMapping(method=get)：这两个注解都是用于映射HTTP GET请求的，其中@GetMapping是Spring框架提供的注解，而// @GetMapping是Javadoc注释，功能相同。
    Boolean login(String name, String password);
}
