import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;


public class Files {

        public static void main(String[] args) {

            File currentDir = new File("d:/tmp");
            displayAllFilesDirectories(currentDir);

        }

    // Отображение все файлов и папок основной дирректории
        public static void displayAllFilesDirectories(File dir) {
            try {
                File[] files = dir.listFiles();
                for (File file : files) {
                    if (file.isDirectory()) {
                        System.out.println("directory: " + file.getCanonicalPath());
    // Вывести файлы подкаталогов, если нужно: displayAllFilesDirectories(file);
            } else {


            long lastModified = file.lastModified();
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

            System.out.println("     file: " + file.getCanonicalPath() + ", размер файла: "
                    + file.length() + " byte, дата изменения: " + sdf.format(new Date(lastModified)));

                            }
                        }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }