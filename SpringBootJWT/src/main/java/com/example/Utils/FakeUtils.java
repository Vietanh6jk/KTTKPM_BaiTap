package com.example.Utils;

import com.example.models.news;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nhs3108 on 4/2/17.
 */
public class FakeUtils {
    public static List<news> getAllNews() {
        List<news> newsList = new ArrayList<news>();
        newsList.add(new news("Title 1", "Framgia - From asian to the world", "Hong Son"));
        newsList.add(new news("Title 2", "Framgia - We make it awesome", "Son Nguyen"));
        newsList.add(new news("Title 3", "Framgia - 2012 to 2017", "Mr Son"));
        return newsList;
    }
}
