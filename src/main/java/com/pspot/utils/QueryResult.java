package com.pspot.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页返回结果集
 * @author ZHP
 * 2015-8-7
 */
public class QueryResult {
	
	private List rows = new ArrayList(); //封装页面显示的数据
	private int currentPage;
	private int totalPage;
	private int totalSize; //封装符合条件的总的记录数
	private String queryCondition; //查询条件
	
	
	public QueryResult(){
	}
	
	/**
	 * @param rows
	 * @param currentPage
	 * @param totalPage
	 * @param totalSize
	 */
	public QueryResult(List rows,int currentPage, int totalPage, int totalSize){
		this.rows = rows;
		this.setCurrentPage(currentPage);
		this.totalPage = totalPage;
		this.totalSize = totalSize;
	}

	//setter and getter
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	public int getTotal() {
		return totalSize;
	}
	public void setTotal(int totalSize) {
		this.totalSize = totalSize;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalPage() {
		return totalPage;
	}

	public void setQueryCondition(String queryCondition) {
		this.queryCondition = queryCondition;
	}

	public String getQueryCondition() {
		return queryCondition;
	}
	
}
