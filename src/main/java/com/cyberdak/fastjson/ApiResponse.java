package com.cyberdak.fastjson;
public class ApiResponse<T> {//假设泛型类型为TYPE, github页面样式错误，不能显示出
	private Result<T> result; //假设泛型类型为TYPE, github页面样式错误，不能显示出

	public ApiResponse(){}

	public Result<T> getResult() {
		return result;
	}

	public void setResult(Result<T> result) {
		this.result = result;
	}
}