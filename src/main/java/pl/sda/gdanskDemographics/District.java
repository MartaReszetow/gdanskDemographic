package pl.sda.gdanskDemographics;

public class District {

    private String districtName;
    private String gender;
    private Integer ageUnderEighteen;
    private Integer ageFromEighteenAndFiftyNine;
    private Integer ageFromSixtyAndSixtyFour;
    private Integer ageAboveSixtyFour;

    public District(String districtName,
                    String gender,
                    Integer ageUnderEighteen,
                    Integer ageFromEighteenAndFiftyNine,
                    Integer ageFromSixtyAndSixtyFour,
                    Integer ageAboveSixtyFour) {
        this.districtName = districtName;
        this.gender = gender;
        this.ageUnderEighteen = ageUnderEighteen;
        this.ageFromEighteenAndFiftyNine = ageFromEighteenAndFiftyNine;
        this.ageFromSixtyAndSixtyFour = ageFromSixtyAndSixtyFour;
        this.ageAboveSixtyFour = ageAboveSixtyFour;
    }



}
