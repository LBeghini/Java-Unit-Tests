package model;

public class IMC {
    private double height;
    private double weight;
    private Gender gender;

    public IMC(double height, double weigh, Gender gender){
        this.height = height;
        this.weight = weigh;
        this.gender = gender;
    }

    public double calculate(){
        return this.weight / this.height * this.height;
    }

    public String condition(){

        String result = null;
        double IMC = this.calculate();

        if(this.gender == Gender.FEMALE){
            if(IMC < 19.1){
                result = "abaixo do peso";
            }else if(IMC < 25.8){
                result = "no peso normal";
            }else if(IMC < 27.3){
                result = "marginalmente acima do peso";
            }else if(IMC < 32.3){
                result = "acima do peso ideal";
            }else if(IMC >= 32.3){
                result = "obeso";
            }
        }else{
            if(IMC < 20.7){
                result = "abaixo do peso";
            }else if(IMC < 26.4){
                result = "no peso normal";
            }else if(IMC < 27.8){
                result = "marginalmente acima do peso";
            }else if(IMC < 31.1){
                result = "acima do peso ideal";
            }else if(IMC >= 31.1){
                result = "obeso";
            }
        }

        return result;
    }
}
