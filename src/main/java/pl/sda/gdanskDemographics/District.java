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

    public String getDistrictName() {
        return districtName;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAgeUnderEighteen() {
        return ageUnderEighteen;
    }

    public Integer getAgeFromEighteenAndFiftyNine() {
        return ageFromEighteenAndFiftyNine;
    }

    public Integer getAgeFromSixtyAndSixtyFour() {
        return ageFromSixtyAndSixtyFour;
    }

    public Integer getAgeAboveSixtyFour() {
        return ageAboveSixtyFour;
    }

    @Override
    public String toString() {
        return "District{" +
                "districtName=" + districtName + '\'' +
                ", gender=" + gender + '\'' +
                ", ageUnderEighteen=" + ageUnderEighteen +
                ", ageFromEighteenAndFiftyNine=" + ageFromEighteenAndFiftyNine +
                ", ageFromSixtyAndSixtyFour=" + ageFromSixtyAndSixtyFour +
                ", ageAboveSixtyFour=" + ageAboveSixtyFour +
                '}';
    }
}
