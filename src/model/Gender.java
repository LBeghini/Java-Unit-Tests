package model;

public enum Gender {
    FEMALE("f", "F"),
    MALE("m", "M");

    private String lower;
    private String upper;

    Gender(String lower, String upper) {
        this.lower = lower;
        this.upper = upper;
    }

    public static Gender evaluate(String value){
        if(value.equals("F") || value.equals("f")){
            return Gender.FEMALE;
        }else if(value.equals("M") || value.equals("m")){
            return Gender.MALE;
        }

        throw new Error("Invalid gender");
    }

    public boolean isFemale(Gender value){
        return value == Gender.FEMALE;
    }

    public boolean isMale(Gender value){
        return value == Gender.MALE;
    }
}