package com.neuedu.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class ImgUtil {
    public static String insertPath(MultipartFile file,String path) {
        String oldfile = file.getOriginalFilename();
//        System.out.println(oldfile);
        String newfile = String.valueOf(System.currentTimeMillis()) +
                oldfile.substring(oldfile.lastIndexOf("."));
//        System.out.println(newfile);
        File pathfile = new File(path);
        if (!pathfile.exists()) {
            pathfile.mkdir();
        }
        File pathfilename = new File(path, newfile);
//        System.out.println("1");
        if (!pathfilename.exists()) {
            try {
                pathfilename.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        System.out.println("2");
        try {
            file.transferTo(pathfilename);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println("3");
//        try {
////            System.out.println(file);
//            file.transferTo(pathfile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println("4");
        return newfile;
    }
}
