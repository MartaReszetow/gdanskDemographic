package pl.sda.gdanskDemographics;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        String loadedData = FileLoaderUtil.readFileAsSingleStringByFilesReadString("data.csv");
        System.out.println(loadedData);
    }
}
