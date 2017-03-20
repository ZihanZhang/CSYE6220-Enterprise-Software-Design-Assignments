package zihansearch;
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;  
import org.apache.http.HttpStatus;  
import org.apache.http.client.ClientProtocolException;  
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;  
import org.json.JSONArray;  
import org.json.JSONException;  
import org.json.JSONObject;  

public class zihanhttpclient {
	public static String[] web_url=new String[20];
	public static String[] headline=new String[20];
	public static int len;
	public static void run(String url) throws ClientProtocolException, IOException,JSONException{  
        CloseableHttpClient httpclient = HttpClients.createDefault();  
        HttpGet httpget = new HttpGet(url);  
        CloseableHttpResponse response = httpclient.execute(httpget);  
        try {  
            HttpEntity myEntity = response.getEntity();  
            String resString = EntityUtils.toString(myEntity);  
            JSONObject json = new JSONObject(resString); 
            JSONObject res_ponse=json.getJSONObject("response");
            JSONArray array = res_ponse.getJSONArray("docs");
            len=array.length();
            for(int i=0;i<array.length();i++){
            	JSONObject data = array.getJSONObject(i);
            	JSONObject mhl=data.getJSONObject("headline");
            	headline[i]=mhl.getString("main");
            	web_url[i]=data.getString("web_url");
            }
        } finally {  
            response.close();  
        }  
          
          
    }  
}
