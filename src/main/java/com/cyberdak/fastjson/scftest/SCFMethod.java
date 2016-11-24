package com.cyberdak.fastjson.scftest;
import java.util.LinkedList;
import java.util.List;
public class SCFMethod {
public String className;
public String url;
public String methodName;
public int parameterSize;
public List parameters = new LinkedList();
public Class returnType;	public String getUrl() { return url; } public void setUrl(String url) { this.url = url; } public String getClassName() { return className; } public void setClassName(String className) { this.className = className; } public Class getReturnType() {
return returnType;
}
public void setReturnType(Class returnType) { this.returnType = returnType; } public String getMethodName() { return methodName; } public void setMethodName(String methodName) { this.methodName = methodName; } public int getParameterSize() { return parameterSize; } public void setParameterSize(int parameterSize) { this.parameterSize = parameterSize; } public List getParameters() { return parameters; } public void setParameters(List parameters) { this.parameters = parameters; } }