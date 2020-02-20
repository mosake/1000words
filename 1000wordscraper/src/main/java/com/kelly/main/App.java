package com.kelly.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.kelly.data.WebScraper;

/**
 * Simple web scraper for content on 1000mostcommonwords.com
 * @author kelly.mo
 *
 */
public class App 
{
	Languages language;
    public static void main( String[] args )
    {
    	WebScraper ws = new WebScraper();
    	ws.words(Languages.KOREAN).forEach((k, v) -> System.out.println(k + "\t" + v.get(0) + "\t" + v.get(1)));
    	System.out.println(ws.main(Languages.RUSSIAN).toString().replaceAll(",,", "\n").replaceAll(",", "\t"));
    }
    	
}
