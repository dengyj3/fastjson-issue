package com.cyberdak.fastjson.scftest;
import java.util.List; 
public class SCFMethodParameter implements Cloneable{ 
	public Class<?> clazz;
	public Object value;
	public boolean isGenericity = false;
	public List<Class<?>> clsList; 
	public boolean getIsGenericity() { return isGenericity; } 
	public void setIsGenericity(boolean isGenericity) {
		this.isGenericity = isGenericity; } 
	public Object getValue() { return value; } 
	public void setValue(Object value) { this.value = value; }
	public Class getClazz() {
		return clazz;
	}
	public void setClazz(Class<?> clazz) { this.clazz = clazz; }
	public List<Class<?>> getClsList() {
		return clsList;
	}
	public void setClsList(List<Class<?>> clsList) {
		this.clsList = clsList;
	}
}
