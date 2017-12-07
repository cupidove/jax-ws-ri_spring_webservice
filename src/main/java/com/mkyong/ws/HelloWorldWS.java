package com.mkyong.ws;

import com.mkyong.bo.HelloWorldBo;
import com.mkyong.bo.ItemA;
import com.mkyong.bo.impl.HelloWorldBoImpl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService(serviceName = "hello")
public class HelloWorldWS {

    //DI via Spring
    HelloWorldBo helloWorldBo;

    @WebMethod(exclude=true)
    public void setHelloWorldBo( HelloWorldBo helloWorldBo) {
        this.helloWorldBo = helloWorldBo;
    }

    @WebMethod(operationName="getHelloWorld")
    public String getHelloWorld() {

        return helloWorldBo.getHelloWorld();

    }

    @WebMethod(operationName = "printItems")
    public String printItems(@WebParam(name="items") List<ItemA> hl){
        return "sccess";
    }
}
