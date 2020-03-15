package com.eugene;



import com.codeborne.selenide.Configuration;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.codeborne.selenide.Selenide.screenshot;

public class ScreenMaker {
    public static void makeScreenshot(String screenDirPath) {

        Date dateNow = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_DD_HH_mm");
        String screenName = (dateFormat.format(dateNow));

        File file = new File(screenDirPath);
        if(!file.exists()){
            file.mkdir();
        }

        Configuration.reportsFolder = screenDirPath;


        screenshot(screenName);

    }
}
