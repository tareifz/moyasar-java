package com.moyasar.bean;

import com.google.gson.annotations.SerializedName;

public class Meta {
	
	@SerializedName("current_page")
	private int currentPage;
	
	@SerializedName("next_page")
	private int nextPage;
	
	@SerializedName("prev_page")
	private int prevPage;
	
	@SerializedName("total_pages")
	private int totalPages;
	
	@SerializedName("total_count")
	private int totalCount;

	public int getCurrentPage() {
		return currentPage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public int getPrevPage() {
		return prevPage;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public int getTotalCount() {
		return totalCount;
	}
	
	public String toString() {
		return "{\ncurrent_page = " + currentPage + ",\nnext_page = " + nextPage + ",\nprev_page = " + prevPage
				+ ",\ntotal_pages = " + totalPages + ",\ntotal_count = " + totalCount + "\n}";
	}
	
}
