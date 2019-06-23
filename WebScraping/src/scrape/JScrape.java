package scrape;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JScrape {
	
	public static void main(String[] args) {

		final String url="https://www.imdb.com/list/ls055386972/";
		
		try {
			int i=0;
			Document document = Jsoup.connect(url).userAgent("chrome").get();
			Elements temp=document.select("div.lister-item-content");
			
			
			
			for(Element movieList:temp) 
			{
				i++;
				System.out.println(i+" "+movieList.getElementsByTag("a").first().text() );
			}
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
