package main;

public enum Gender {
    FEMALE,
    MALE;

    public static Gender evaluate(String value){
        if(value.equalsIgnoreCase("f")){
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