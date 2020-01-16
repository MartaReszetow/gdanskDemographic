package pl.sda.gdanskDemographics;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        District[] districts = loadDistricts();
        Analyzer analyzer = new Analyzer(districts);

        // zad 7.1
        System.out.println("WYPISANIE DANYCH O DZIELLNICY");
        analyzer.findByName("WRZESZCZ GÓRNY");

        // zad7.2
        System.out.println("NAJWIĘCEJ MIESZKANCOW DANEJ PLCI W DANYM ZAKRESIE WIEKOWYM JEST W DZIELNICY:");
        System.out.println(analyzer.findByDistrict("kobiety", 13));

        // zad 7.3

        System.out.println("DZIELNICE Z NAJWIĘKSZĄ ILOSCIĄ MIESZKANCOW DANEJ PLCI:");
        District maxWoman = analyzer.maxNumberOfInhabitants("kobiety");
        System.out.println("Dzielnica z największą ilością kobiet to:" + maxWoman.getDistrictName() + "z łączną ilością mieszkąńców: " + analyzer.sumOfDistrictPopulation(maxWoman));
        District maxMan = analyzer.maxNumberOfInhabitants("mężczyźni");
        System.out.println("Dzielnica z największą ilością mężczyzn to:" + maxMan.getDistrictName() + "z łączną ilością mieszkąńców: " + analyzer.sumOfDistrictPopulation(maxMan));
    }


    private static District[] loadDistricts() throws IOException {
        String loadedData = FileLoaderUtil.readFileAsSingleStringByFilesReadString("data.csv"); // zladowanie danych
        String[] rows = loadedData.split("\r\n");                                                   // podzielenie tablicy po enterach

        District[] districts = new District[rows.length - 3]; // tworzę tablice district

        for (int i = 1; i < rows.length; i++) {
            String[] splitRow = rows[i].split(";");

            if (splitRow[0].equals("GDAŃSK")) {
                break;
            }

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
