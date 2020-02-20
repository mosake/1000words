package com.kelly.data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.kelly.main.Languages;

public class WebScraper {
	
	public Map<String, List<String>> words(Languages language){
		Map<String, List<String>> words = new HashMap();
		
		try {
	    	  Document doc = Jsoup.connect(language.url()).get();
	    	// Get the list of repositories
	          Elements table = doc.getElementsByTag("tbody");
	    	  /**
	           * For each word, extract the following information:
	           * 1. Index in top 1000
	           * 2. English word
	           * 3. Foreign language word
	           * 4. Language
	           */
	          
	          for (Element item : table.select("tr")) {
	        	  List<String> translation = new ArrayList();
	        	  translation.add(item.select("td").get(2).text());
	        	  translation.add(item.select("td").get(1).text());
	        	  words.put(item.select("td").get(0).text(), translation);
	        	}
	    	} catch (IOException e) {
	    	  e.printStackTrace();
	    	}
		return words;
		
	}
    public StringBuffer main(Languages lang) {
    	StringBuffer output = new StringBuffer();
    		output.append("===========================================================,,");
    		output.append(lang.name());
    		output.append(",,===========================================================,,");
    		try {
    	    	  Document doc = Jsoup.connect(lang.url()).get();
    	    	// Get the list of repositories
    	          Elements table = doc.getElementsByTag("tbody");
    	          
    	    	  /**
    	           * For each word, extract the following information:
    	           * 1. Index in top 1000
    	           * 2. English word
    	           * 3. Foreign language word
    	           * 4. Language
    	           */
    	          
    	          for (Element item : table.select("tr")) {
    	            // Extract the word
    	        	for (Element word : item.select("td")) {
    	        		output.append(word.text() + ",");
    	        	}
    	        	output.append(",,");
    	          }
    	    	} catch (IOException e) {
    	    	  e.printStackTrace();
    	    	}
		return output;
		}
}
