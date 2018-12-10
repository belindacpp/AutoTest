package com.cpp.httpclient;


import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;


//get请求
public class HttpClientPrac {
    public static String url = "http://www.baidu.com/";

    public void baidu_get() throws IOException {
        String result;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = httpclient.execute(httpGet);
//将返回结果进行字符串的转换
        result = EntityUtils.toString(response.getEntity());
        System.out.println(result);
        response.close();
    }
    public static void main(String[] args){
        HttpClientPrac p = new HttpClientPrac();
        try {
            p.baidu_get();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
