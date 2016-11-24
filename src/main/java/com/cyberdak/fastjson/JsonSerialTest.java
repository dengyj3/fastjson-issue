package com.cyberdak.fastjson;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class JsonSerialTest {

public static void main(String[] args) {
    try{
        Person person = new Person("test1", 10);
        serialTest(person);

        ApiResponse<Object> apiResponse = new ApiResponse<Object>();
        Result<Object> result = new Result<Object>();
        result.setData(new Object());
        apiResponse.setResult(result);

        serialTest(apiResponse);

    }catch (Throwable e){
        e.printStackTrace();
    }
}

private static void serialTest(Object object){
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    try{
        JsonSerializer.serialize(object, bos);

        Object desRes = JsonSerializer.deserialize(bos.toByteArray());
        System.out.println("反序列化的结果为:" + desRes);
    }finally {
        try{
            bos.close();
        }catch (IOException e){
        }
    }
}
}