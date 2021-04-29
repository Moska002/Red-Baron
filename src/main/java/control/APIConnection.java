package control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class APIConnection {

	public static String getLyric(String author, String song) throws IOException {
		String str = "http://api.chartlyrics.com/apiv1.asmx/SearchLyricDirect?artist=" + URLEncoder.encode(author, "UTF-8") + "&song=" + URLEncoder.encode(song, "UTF-8");
		str = str.replace("+", "%20");
		
		System.out.println(str);
		URL url = new URL(str);
		HttpURLConnection conn = (HttpURLConnection) (url).openConnection();
		conn.connect();
		
		StringBuilder sb = new StringBuilder("");
		String line;
		if(conn.getResponseCode() == 200) {
			
		}
		
		BufferedReader input = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
		
		while((line = input.readLine()) != null) {
			sb.append(line);
		}	
		
		return sb.toString();
	}
}
