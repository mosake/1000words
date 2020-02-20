package com.kelly.main;


public enum Languages {
	KOREAN ("https://1000mostcommonwords.com/1000-most-common-korean-words/"),
	RUSSIAN ("https://1000mostcommonwords.com/1000-most-common-russian-words/");
	
	private String url;

	private Languages(String url) {
		this.url = url;
	}
	
	public String url() {return url;}
}
