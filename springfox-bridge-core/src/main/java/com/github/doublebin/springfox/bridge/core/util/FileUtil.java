package com.github.doublebin.springfox.bridge.core.util;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class FileUtil {
    private static String currentFilePath = "";

    public static String getCurrentFilePath() {
        if (StringUtil.isBlank(currentFilePath)) {
            File file = new File("");
            currentFilePath = file.getAbsolutePath();
        }
        return currentFilePath;
    }

}
