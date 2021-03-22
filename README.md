# :coffee: Java Unit Tests

## About
This application is a simple Java Console Application that aims to implement a base code that calculates BMI: Body Mass Index to apply unit tests in JUnit.

## Technologies
- Java 15
- JUnit 5.4.2

## Defining the tests

### Enumerate conditions and command blocks
From the main function that calculates the IMC, each command block and condition was enumerated:

```java
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
```
### Ciclomatic Complexity Graph
From the enumerations, the ciclomatic complexity graph follows:

<img src="https://github.com/LBeghini/Java-Unit-Tests/blob/main/resources/IMC_Complexity.png" width='900px'>

To determine the number of test cases, it's needed to count the areas of the graph, including the outside area.

### Determine Test Cases
From the analysis of the Ciclomatic Complexity, the test cases are determined:

|             | Gender  | Weight   |  Height | BMI  | Result                      |Path                  |
|  :-------:  | :-----: | :-------:| :-----: |:---: | :-----                      | :-----               |
| **1**       | FEMALE  | 19.0     | 1       | 19.0 | underweight                 | 1-2-3-20             |
| **2**       | FEMALE  | 19.1     | 1       | 19.1 | normal                      | 1-2-4-5-20           |
| **3**       | FEMALE  | 25.8     | 1       | 25.8 | slightly overweight         | 1-2-4-6-7-20         |
| **4**       | FEMALE  | 27.3     | 1       | 27.3 | overweight                  | 1-2-4-6-8-9-20       |
| **5**       | FEMALE  | 32.3     | 1       | 32.3 | obese                       | 1-2-4-6-8-10-20      |
| **6**       | MALE    | 20.6     | 1       | 20.6 | underweight                 | 1-11-12-20           |
| **7**       | MALE    | 20.7     | 1       | 20.7 | normal                      | 1-11-13-14-20        |
| **8**       | MALE    | 26.4     | 1       | 26.4 | slightly overweight         | 1-11-13-15-16-20     |
| **9**       | MALE    | 27.8     | 1       | 27.8 | overweight                  | 1-11-13-15-17-18-20  |
| **10**      | MALE    | 31.1     | 1       | 31.1 | obese                       | 1-11-13-15-17-19-20  |

## Requirements
To run and edit the project, be sure to have installed in your computer the following softwares:
- Java
- A code editor

After that, you'll need to clone this repo:
```
git clone https://github.com/LBeghini/Java-Unit-Tests.git
```
## :balance_scale: License
[MIT License](https://github.com/LBeghini/Java-Unit-Tests/blob/main/LICENSE)
