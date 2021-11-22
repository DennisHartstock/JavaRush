package com.javarush.task.task28.task2810.model;

import com.javarush.task.task28.task2810.vo.Vacancy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HHStrategy implements Strategy {

    private static final String URL_FORMAT = "https://hh.ru/search/vacancy?text=java+%s&page=%d";

    @Override
    public List<Vacancy> getVacancies(String searchString) {
        try {
            Document document = Jsoup.connect(String.format(URL_FORMAT, "MyTown", 0))
                    .userAgent("Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:94.0) Gecko/20100101 Firefox/94.0")
                    .referrer("https://grc.ua/")
                    .get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
