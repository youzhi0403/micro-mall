package com.youzhi;

import java.io.File;

/**
 * @author cwj
 * @date 2020/1/3 14:40
 * 删除指定文件夹下的文件
 */
public class Deletor {
    public static void main(String[] args) {
        File directory1 = new File("E:\\application\\idea_workspace\\micro-mall\\micro-mall-mbg\\src\\main\\java\\com\\youzhi\\model");
        File directory2 = new File("E:\\application\\idea_workspace\\micro-mall\\micro-mall-mbg\\src\\main\\java\\com\\youzhi\\mapper");
        File directory3 = new File("E:\\application\\idea_workspace\\micro-mall\\micro-mall-mbg\\src\\main\\resources\\com\\youzhi\\mapper");
        delete(directory1);
        delete(directory2);
        delete(directory3);
    }

    public static void delete(File directory){
        File[] files = directory.listFiles();
        //遍历文件和文件夹
        for(File file:files){
            if(file.isDirectory()){
                continue;
            }else if(file.isFile()){
                file.delete();
            }
        }
    }
}
