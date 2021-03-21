package model;

public class IMC {
    private final double height;
    private final double weight;
    private final Gender gender;

    public IMC(double height, double weight, Gender gender){
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public double calculate(){
        return this.weight / this.height * this.height;
    }

    public String condition(){

        double IMC = this.calculate();

        if(this.gender == Gender.FEMALE){                           //1
            if(IMC < 19.1){                                         //2
                return("abaixo do peso");                           //3
            }else if(IMC < 25.8){                                   //4
                return("no peso normal");                           //5
            }else if(IMC < 27.3){                                   //6
                return("marginalmente acima do peso");              //7
            }else if(IMC < 32.3){                                   //8
                return("acima do peso ideal");                      //9
            }else{
                return("obeso");                                    //10
            }
        }else{
            if(IMC < 20.7){                                         //11
                return("abaixo do peso");                           //12
            }else if(IMC < 26.4){                                   //13
                return("no peso normal");                           //14
            }else if(IMC < 27.8){                                   //15
                return("marginalmente acima do peso");              //16
            }else if(IMC < 31.1){                                   //17
                return("acima do peso ideal");                      //18
            }else{                                                  //10
                return("obeso");                                    //19
            }
        }                                                           //20
    }
}
