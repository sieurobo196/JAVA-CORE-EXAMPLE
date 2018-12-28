/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewr.java_coban;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author NXCOMM
 */
public class App {

    public static void main(String[] args) {
        //get content html from web
        String url = "https://www.tutorialspoint.com/log4j/log4j_logging_methods.htm";
        String eleTitle = ".col-md-7.middle-col>h1";
        String eleContent = ".content";
        HashMap<String, String> hashMap = getContentHtmlfromWeb(url, eleTitle, eleContent);
        insertDatabase(hashMap);
        //insert database with jdbc
    }

    public static void readPageHtml() {
        try {
            URL google = new URL("http://www.google.com/");
            BufferedReader in = new BufferedReader(new InputStreamReader(google.openStream()));
            String inputLine = "";

            while ((inputLine = in.readLine()) != null) {
//                inputLine+=in.readLine();
                // Process each line.
                System.out.println(inputLine);
            }
            in.close();

        } catch (MalformedURLException me) {
            System.out.println(me);

        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    public static void getHtmlByJsoup() {

        String html = "<p>An <a href='http://example.com/'><b>example</b></a> link.</p>";
        Document doc = (Document) Jsoup.parse(html);
        Element link = doc.select("a").first();

        String text = doc.body().text(); // "An example link"
        String linkHref = link.attr("href"); // "http://example.com/"
        String linkText = link.text(); // "example""

        String linkOuterH = link.outerHtml();
        // "<a href="http://example.com"><b>example</b></a>"
        String linkInnerH = link.html(); // "<b>example</b>"
        System.out.println(text);
        System.out.println(linkHref);
        System.out.println(linkText);
        System.out.println(linkOuterH);
        System.out.println(linkInnerH);
    }

    public static HashMap<String, String> getContentHtmlfromWeb(String url, String eleTitle, String eleContent) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            Document doc = Jsoup.connect(url).get();

            Element title = doc.select(eleTitle).first();
            String titleStr = title.text();
            System.out.println(titleStr);
            hashMap.put("title", titleStr);
            String map_url = titleStr.toLowerCase().replace(" ", "-");
            System.out.println(map_url);
            Element link = doc.select(eleContent).first();
            String content = link.html();
            System.out.println(content);
            hashMap.put("content", content);
            hashMap.put("map_url", map_url);

        } catch (IOException ex) {
            return null;
        }
        return hashMap;
    }

    public static void insertDatabase(HashMap<String, String> hashMap) {
        String DB_URL = "jdbc:mysql://localhost:3306/codsewr";
        String USER = "root";
        String PASS = "";
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");
            stmt = conn.createStatement();
            Integer id = null;
            String title = "PHP là cutx gì 1?";
            String map_url = "php-la-gi-cutx";
            String meta_des = title;
            String meta_keys = title;
            String des_article = "";
            String image = null;
            String content = "<p>cutx kaka</p>";
            Date createdDate = new Date();
            Date updatedDate = null;
            int isDeleted = 0;
            int lang = 0;
            int view = 0;
            int isSubmit = 0;
            String type = "";

            String sql = "INSERT INTO `articles` VALUES (null, '"
                    + title
                    + "', '"
                    + map_url
                    + "', '"
                    + meta_des
                    + "', '"
                    + meta_keys
                    + "','"
                    + des_article
                    + "', '', null, '<p>cutx kaka</p>' ,'2017-10-30 03:49:12', '2018-05-04 04:31:10', '0', 'PHP-basic', '0', '18', '0')";
            stmt.executeUpdate(sql);
            String sql1 = "INSERT INTO `articles` VALUES (null, 'PHP là gì1?', 'php-la-gi', 'Định nghĩa PHP là gì ?', 'PHP là gì ,"
                    + " php la gi', '', null, '<p>cutx kaka</p>' ,'2017-10-30 03:49:12', '2018-05-04 04:31:10', '0', 'PHP-basic', '0', '18', '0')";
            stmt.executeUpdate(sql1);
            System.out.println("Inserted records into the table...");

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Goodbye!");
    }
}
