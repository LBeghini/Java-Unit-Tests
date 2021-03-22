# :coffee: Java Unit Tests

## About
This application is a simple Java Console Application that aims to implement a base code that calculates IMC: Índice de Massa Corporal (body mass index) to apply unit tests in JUnit.

## Technologies
- Java
- JUnit

## Defining the tests

### Enumerate conditions and command blocks
From the main function that calculates the IMC, each command block and condition was enumerated:

```java
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
    }else{                                                  
        return("obeso");                                    //19
    }
}                                                           //20
```
### Ciclomatic Complexity Graph
From the enumerations, the ciclomatic complexity graph follows:

<img src="https://github.com/LBeghini/Java-Unit-Tests/blob/main/resources/IMC_Complexity.png" width='900px'>

To determine the number of test cases, it's needed to count the areas of the graph, including the outside area.

### Determine Test Cases
From the analysis of the Ciclomatic Complexity, the test cases are determined:

|             | Gender  | Weight   |  Height | IMC  | Result                      |Path                  |
|  :-------:  | :-----: | :-------:| :-----: |:---: | :-----                      | :-----               |
| **1**       | FEMALE  | 19.0     | 1       | 19.0 | abaixo do peso              | 1-2-3-20             |
| **2**       | FEMALE  | 19.1     | 1       | 19.1 | no peso normal              | 1-2-4-5-20           |
| **3**       | FEMALE  | 25.8     | 1       | 25.8 | marginalmente acima do peso | 1-2-4-6-7-20         |
| **4**       | FEMALE  | 27.3     | 1       | 27.3 | acima do peso ideal         | 1-2-4-6-8-9-20       |
| **5**       | FEMALE  | 32.3     | 1       | 32.3 | obeso                       | 1-2-4-6-8-10-20      |
| **6**       | MALE    | 20.6     | 1       | 20.6 | abaixo do peso              | 1-11-12-20           |
| **7**       | MALE    | 20.7     | 1       | 20.7 | no peso normal              | 1-11-13-14-20        |
| **8**       | MALE    | 26.4     | 1       | 26.4 | marginalmente acima do peso | 1-11-13-15-16-20     |
| **9**       | MALE    | 27.8     | 1       | 27.8 | acima do peso ideal         | 1-11-13-15-17-18-20  |
| **10**      | MALE    | 31.1     | 1       | 31.1 | obeso                       | 1-11-13-15-17-19-20  |

## Requirements
To run and edit the project, be sure to have installed in your computer the following softwares:
- Java
- A code editor

After that, you'll need to clone this repo:
```
git clone https://github.com/LBeghini/Java-Unit-Tests.git
```
## Running
To see the project running, follow the steps:

First you need to compile. Go to `src` folder and run:
```
javac Main.java
```
Then, run:
```
java Main
```
