package com.example.jsoupdemo1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class Jsoupdemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Jsoupdemo1Application.class, args);

            String html = "https://www.visual-paradigm.com/guide/data-flow-diagram/what-is-data-flow-diagram/";

            try {
                Document doc = Jsoup.connect(html).get();
                String title = doc.title();
                System.out.println(title);
            }catch (IOException e){
                System.out.println(e);
            }
        }

}
