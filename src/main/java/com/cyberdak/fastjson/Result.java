package com.cyberdak.fastjson;
public class Result<T> {//假设泛型类型为TYPE, github页面样式错误，不能显示出
	private T data;

	public Result(){}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}