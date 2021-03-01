package com.tdd.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RestUtil {

    public String load(String url,String query) throws Exception
    {
        URL restURL = new URL(url);
        /*
         * 此处的urlConnection对象实际上是根据URL的请求协议(此处是http)生成的URLConnection类 的子类HttpURLConnection
         */
        HttpURLConnection conn = (HttpURLConnection) restURL.openConnection();
        //请求方式
        conn.setRequestMethod("GET");
        //设置是否从httpUrlConnection读入，默认情况下是true; httpUrlConnection.setDoInput(true);
        conn.setDoOutput(true);
        //allowUserInteraction 如果为 true，则在允许用户交互（例如弹出一个验证对话框）的上下文中对此 URL 进行检查。
        conn.setAllowUserInteraction(false);
        // PrintStream ps = new PrintStream(conn.getOutputStream());
        // ps.print(query);

        // ps.close();

        BufferedReader bReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        String line,resultStr="";

        while(null != (line=bReader.readLine()))
        {
            resultStr +=line;
        }
        System.out.println("3412412---"+resultStr);
        bReader.close();

        return resultStr;

    }

    public static void main(String []args) {
        try {

            RestUtil restUtil = new RestUtil();

            //
            String resultString = restUtil.load(
                    "https://api.weixin.qq.com/sns/jscode2session?appid=wx0b297b9e59b7a475&secret=37d95faa9f9ae0131c09de7637e3d052&js_code=041oIK000w7seL1bNF100ND19P0oIK0g&grant_type=authorization_code",
                    "appid=wx0b297b9e59b7a475&secret=37d95faa9f9ae0131c09de7637e3d052&js_code=061fu1100IXIeL1s8p200wMQLI1fu11X&grant_type=authorization_code");

            System.out.println(resultString);
        } catch (Exception e) {

            // TODO: handle exception

            System.out.print(e.getMessage());

        }
    }

}
