package com.cyberdak.fastjson.scftest;
import java.util.List;
public class JsonBean {
	private List mList;
	public List getmList() {
		return mList;
	}
	public void setmList(List mList) {
		this.mList = mList;
	}
	@Override
	public String toString() {
		return "JsonBean [mList=" + mList + "]";
	}
	
	
}