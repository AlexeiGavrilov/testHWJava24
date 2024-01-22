package seminar2.task;

import java.io.File;

public class Task6 {
    public static void getFileExtension(String path) {
        File dir = new File(path);
        File [] listOfFile = dir.listFiles();

        for (int i = 0; i < listOfFile.length; i++) {
            if (listOfFile[i].isDirectory()) {
                System.out.printf("Папка : %s \n ",listOfFile[i].getName());
                getFileExtension(listOfFile[i].getPath());
            }
            if (listOfFile[i].isFile()) {
                String result = listOfFile[i].getName().toLowerCase();
                String[] r = result.split("\\.");
                System.out.printf("Имя файла : %s  Расширение файла : %s\n", listOfFile[i].getName(), r[r.length - 1]);
            }

        }

    }
//    private static String getFileExtension(File file1) {
//        String fileName = file1.getName();
//        // если в имени файла есть точка и она не является первым символом в названии файла
//        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
//            // то вырезаем все знаки после последней точки в названии файла, то есть ХХХХХ.txt -> txt
//            return fileName.substring(fileName.lastIndexOf(".")+1);
//            // в противном случае возвращаем заглушку, то есть расширение не найдено
//        else return "";
//    }
}
