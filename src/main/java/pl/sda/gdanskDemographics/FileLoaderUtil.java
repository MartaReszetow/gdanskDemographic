package pl.sda.gdanskDemographics;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileLoaderUtil {

    public static String readFileAsSingleStringByScanner(String fileName) {
        InputStream resourceAsStream = FileLoaderUtil.class.getClassLoader().getResourceAsStream(fileName);
        Scanner scanner = new Scanner(resourceAsStream);
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine());
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String readFileAsSingleStringByFilesReadString(String fileName) throws IOException {
        String path = App.class.getClassLoader().getResource(fileName).getPath();
        if (System.getProperty("os.name").toLowerCase().contains("win") && path.startsWith("/")) {
            path = path.replaceFirst("/", "");
        }
        return Files.readString(Paths.get(path));

    }

    public static String[] readFileAsLines(String fileName) throws IOException {
        String path = App.class.getClassLoader().getResource(fileName).getPath().replaceFirst("/", "");
        return Files.readAllLines(Path.of(path), Charset.defaultCharset()).toArray(new String[0]);
    }
}
