package com.cyberdak.fastjson.scftest;
import java.util.List;
public class JsonBean {
	private List<SCFMethod> mList;
	public List<SCFMethod> getmList() {
		return mList;
	}
	public void setmList(List<SCFMethod> mList) {
		this.mList = mList;
	}
	@Override
	public String toString() {
		return "JsonBean [mList=" + mList + "]";
	}
	
	
}
