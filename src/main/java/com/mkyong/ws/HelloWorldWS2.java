package com.mkyong.ws;

import com.mkyong.bo.HelloWorldBo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "hello9999")
public class HelloWorldWS2 {

    //DI via Spring
    HelloWorldBo helloWorldBo;

    @WebMethod(exclude=true)
    public void setHelloWorldBo(HelloWorldBo helloWorldBo) {
        this.helloWorldBo = helloWorldBo;
    }

    @WebMethod(operationName="getHelloWorld")
    public String getHelloWorld() {

        return helloWorldBo.getHelloWorld();

    }
}
