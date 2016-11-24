package com.cyberdak.fastjson;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.commons.collections4.ListUtils;
import org.apache.commons.collections4.MapUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
//    	Map<String,String> map = Maps.newHashMap();
//    	for(int i = 0 ; i< 11;i++){
//    		String temp = "a"+i;
//    		map.put(temp, temp);
//    	}
////    	map.put("aasdasd", "aasdasd");// will cause resize
//    	String text = JSON.toJSONString(map);
//    	JSONObject obj = JSONObject.parseObject(text);
//    	obj.put("xzcasd", "asdkjhkas");// will cause resize
//    	//add this method
//    	
//    	LocalDateTime datetime = LocalDateTime.now();
//    	String json = JSON.toJSONString(datetime);
//    	System.out.println(json);
//    	datetime = JSON.parseObject(json, LocalDateTime.class);
//    	System.out.println(datetime);
    	
    	Model model = new Model();
    	model.setLocalDateTime(LocalDateTime.now());
    	model.setStartDateTime(LocalDateTime.now());
    	model.setEndDateTime(LocalDateTime.now());
    	
    	String modelJson = JSON.toJSONString(model);
    	System.out.println(modelJson);
    	
    	model = JSON.parseObject(modelJson, Model.class);
    	System.out.println(model);
    	
    }
    
    private static class Model {
    	private String a;
    	private int b;
    	private LocalDateTime localDateTime;
    	private LocalDateTime startDateTime;
    	private LocalDateTime endDateTime;
    	
    	
    	public LocalDateTime getStartDateTime() {
    		return startDateTime;
    	}
    	public void setStartDateTime(LocalDateTime startDateTime) {
    		this.startDateTime = startDateTime;
    	}
    	public LocalDateTime getEndDateTime() {
    		return endDateTime;
    	}
    	public void setEndDateTime(LocalDateTime endDateTime) {
    		this.endDateTime = endDateTime;
    	}
    	public LocalDateTime getLocalDateTime() {
    		return localDateTime;
    	}
    	public void setLocalDateTime(LocalDateTime localDateTime) {
    		this.localDateTime = localDateTime;
    	}
    	public String getA() {
    		return a;
    	}
    	public void setA(String a) {
    		this.a = a;
    	}
    	public int getB() {
    		return b;
    	}
    	public void setB(int b) {
    		this.b = b;
    	}
    	
    	public Model() {
    		super();
    	}
    }
}
