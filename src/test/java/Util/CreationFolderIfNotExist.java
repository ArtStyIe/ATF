package Util;

import java.io.File;

public class CreationFolderIfNotExist {
    public static void createDirectoryIfNotExists(String filePath) {
        File f = new File(filePath);
        f.mkdir();
    }
}
