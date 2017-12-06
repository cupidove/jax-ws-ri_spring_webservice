package main.java.com.mkyong.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import main.java.com.mkyong.bo.HelloWorldBo;

@WebService(serviceName = "hello")
public class HelloWorldWS {

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
