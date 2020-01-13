package pl.sda.gdanskDemographics;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        District[] districts = loadDistricts();
        Analyzer analyzer = new Analyzer(districts);

        // zad 7.1
        analyzer.findByName("WRZESZCZ GÓRNY");

        // zad7.2
        System.out.println(analyzer.findByDistrict("kobiety", 13));
    }


    private static District[] loadDistricts() throws IOException {
        String loadedData = FileLoaderUtil.readFileAsSingleStringByFilesReadString("data.csv"); // zladowanie danych
        String[] rows = loadedData.split("\r\n");                                                   // podzielenie tablicy po enterach

        District[] districts = new District[rows.length - 1]; // tworzę tablice district

        for (int i = 1; i < rows.length; i++) {
            String[] splitRow = rows[i].split(";");

            District singleDistrict = new District(
                    splitRow[0],
                    splitRow[1],
                    Integer.valueOf(splitRow[2].replaceAll(" ", "")),  // usuwamy spacje z numerów
                    Integer.valueOf(splitRow[3].replaceAll(" ", "")),
                    Integer.valueOf(splitRow[4].replaceAll(" ", "")),
                    Integer.valueOf(splitRow[5].replaceAll(" ", "")));

            districts[i - 1] = singleDistrict;
        }
        return districts;
    }


}
