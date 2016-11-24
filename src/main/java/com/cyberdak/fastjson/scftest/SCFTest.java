package com.cyberdak.fastjson.scftest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;

import sun.applet.Main;

public class SCFTest {
	public static void main(String[] args) {
		String str = "{\"mList\":[{\"className\":\"com.bj58.qa.scftemplate.contract.ISCFServiceForDyjAction\",\"methodName\":\"getArrayInt\",\"parameterSize\":1,\"parameters\":[{\"clazz\":\"[I\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"}],\"returnType\":\"[I\",\"url\":\"tcp://SCFServiceForDyj/SCFServiceForDyjActionService\"},{\"className\":\"com.bj58.qa.scftemplate.contract.ISCFServiceForDyjAction\",\"methodName\":\"getArrayPrimative\",\"parameterSize\":7,\"parameters\":[{\"clazz\":\"[I\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"},{\"clazz\":\"[F\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"},{\"clazz\":\"[S\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"},{\"clazz\":\"[D\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"},{\"clazz\":\"[J\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"},{\"clazz\":\"[B\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"},{\"clazz\":\"[C\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"}],\"returnType\":\"[Ljava.lang.String;\",\"url\":\"tcp://SCFServiceForDyj/SCFServiceForDyjActionService\"}]}";
		JsonBean jsonBean = getJsonData(str, JsonBean.class);
		System.out.println(jsonBean);
	}

	public static <T> T getJsonData(String json, Class clazz){
		T jd=(T)JSON.parseObject(json, clazz,
				Feature.IgnoreNotMatch,
				Feature.AutoCloseSource
				);
		return jd;
	}
}
