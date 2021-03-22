package main;

public class BodyMassIndex {
    private double height;
    private double weight;
    private Gender gender;

    public BodyMassIndex(double height, double weight, Gender gender){
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public BodyMassIndex(){

    }

    public double calculate(){
        return this.weight / this.height * this.height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String condition(){

        double BMI = this.calculate();

        if(this.gender == Gender.FEMALE){                           //1
            if(BMI < 19.1){                                         //2
                return("underweight");                              //3
            }else if(BMI < 25.8){                                   //4
                return("normal");                                   //5
            }else if(BMI < 27.3){                                   //6
                return("slightly overweight");                      //7
            }else if(BMI < 32.3){                                   //8
                return("overweight");                               //9
            }else{
                return("obese");                                    //10
            }
        }else{
            if(BMI < 20.7){                                         //11
                return("underweight");                              //12
            }else if(BMI < 26.4){                                   //13
                return("normal");                                   //14
            }else if(BMI < 27.8){                                   //15
                return("slightly overweight");                      //16
            }else if(BMI < 31.1){                                   //17
                return("overweight");                               //18
            }else{
                return("obese");                                    //19
            }
        }                                                           //20
    }
}
