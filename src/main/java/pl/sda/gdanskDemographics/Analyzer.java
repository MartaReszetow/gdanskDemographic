package pl.sda.gdanskDemographics;

public class Analyzer {

    private District[] allDistricts;

    public Analyzer(District[] allDistricts) {
        this.allDistricts = allDistricts;
    }

    // metodę przyjmującą jako argument nazwę dzielnicy i wyświetlającą dane dotyczące danej dzielnicy
    public void findByName(String districtName) {
        for (District singleDistrict : allDistricts) {
            if (singleDistrict.getDistrictName().equals(districtName)) {
                System.out.println(singleDistrict);
            }
        }
    }

// metodę przyjmującą jako argumenty płeć, wiek i zwracająca dzielnicę w której jest największa ilość spełniających kryteria mieszkańców

    public District findByDistrict(String gender, int age) {
        District max = null;
        for (District singleDistrict : getTablebyGender(gender)) {
            if (age > 0 && age < 18) {
                if (max == null) {
                    max = singleDistrict;
                }
                if (singleDistrict.getAgeUnderEighteen() > max.getAgeUnderEighteen()) {
                    max = singleDistrict;
                }
            } else if (age < 60) {
                if (max == null) {
                    max = singleDistrict;
                }
                if (singleDistrict.getAgeFromEighteenAndFiftyNine() > max.getAgeFromEighteenAndFiftyNine()) {
                    max = singleDistrict;

                }
            } else if (age < 64) {
                if (max == null) {
                    max = singleDistrict;
                }
                if (singleDistrict.getAgeFromSixtyAndSixtyFour() > max.getAgeFromSixtyAndSixtyFour()) {
                    max = singleDistrict;

                }
            } else {

                if (max == null) {
                    max = singleDistrict;
                }
                if (singleDistrict.getAgeFromSixtyAndSixtyFour() > max.getAgeFromSixtyAndSixtyFour()) {
                    max = singleDistrict;


                }

            }

        }
        return max;
    }


    private District[] getTablebyGender(String gender) {
        District[] genderTable = new District[allDistricts.length / 2]; // tworzę nową tabicę, która bedzie przechowywała dzielnice ze względu na płeć
        int i = 0;
        for (District singeDistrict : allDistricts) {

            if (singeDistrict.getGender().equals(gender)) {
                genderTable[i] = singeDistrict;
                i++;
            }
        }
        return genderTable;
    }
}






