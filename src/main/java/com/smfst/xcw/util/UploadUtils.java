package com.smfst.xcw.util;

import java.io.File;

public class UploadUtils {
    //静态资源路径
    public final static String IMG_PATH_PREFIX = "/static/images";
    public final static String VIDEO_PATH_PREFIX = "/static/video";

    public static File getImgDirFile() {
        //dome是项目名
//        String fileDirPath = "src/main/resources" + IMG_PATH_PREFIX;
        String fileDirPath = "D:\\OTA\\images";
        File fileDir = new File(fileDirPath);
        if (!fileDir.exists()) {
            fileDir.mkdirs();
        }
        return fileDir;
    }

    public static File getVideoDirFile() {
        //dome是项目名
//        String fileDirPath = "src/main/resources" +  VIDEO_PATH_PREFIX;
        String fileDirPath = "D:\\OTA\\video";
        File fileDir = new File(fileDirPath);
        if (!fileDir.exists()) {
            fileDir.mkdirs();
        }
        return fileDir;
    }

}