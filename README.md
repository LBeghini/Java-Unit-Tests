# :coffee: Java Unit Tests

## About
This application is a simple Java Console Application that aims to implement a base code that calculates BMI (Body Mass Index) to apply unit tests in JUnit.

### Body Mass Index
The body mass index is calculated using the following formula:

<img src="https://latex.codecogs.com/svg.latex?BMI&space;=&space;\frac{weigh}{height^{2}}" height='90px'/>

And the results are analised with the following conditions:


| Condition            | Body Mass Index in Women  | Body Mass Index in Men  | 
| :-----               |:---:                      | :---:                   |
| underweight          | bmi < 19.0                | bmi < 20.7              |
| normal               | 19.1 <= bmi < 25.8        | 20.7 <= bmi < 26.4      | 
| slightly overweight  | 25.8 <= bmi < 27.3        | 26.4 <= bmi < 27.8      | 
| overweight           | 27.3 <= bmi < 32.3        | 27.8 <= bmi < 31.1      | 
| obese                | bmi >= 32.3               | bmi >= 31.1             | 


## Technologies
- Java 15
- JUnit 4.12

## Defining the tests

### Enumerate conditions and command blocks
From the main function that calculates the BMI, each command block and condition was enumerated:

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

|             | Gender               | Weight   |  Height | BMI  | Result                      |Path                  |
|  :-------:  | :-----              | :-------:| :-----: |:---: | :-----                      | :-----               |
| **1**       | :female_sign: FEMALE | 19.0     | 1       | 19.0 | underweight                 | 1-2-3-20             |
| **2**       | :female_sign: FEMALE | 19.1     | 1       | 19.1 | normal                      | 1-2-4-5-20           |
| **3**       | :female_sign: FEMALE | 25.8     | 1       | 25.8 | slightly overweight         | 1-2-4-6-7-20         |
| **4**       | :female_sign: FEMALE | 27.3     | 1       | 27.3 | overweight                  | 1-2-4-6-8-9-20       |
| **5**       | :female_sign: FEMALE | 32.3     | 1       | 32.3 | obese                       | 1-2-4-6-8-10-20      |
| **6**       | :male_sign: MALE     | 20.6     | 1       | 20.6 | underweight                 | 1-11-12-20           |
| **7**       | :male_sign: MALE     | 20.7     | 1       | 20.7 | normal                      | 1-11-13-14-20        |
| **8**       | :male_sign: MALE     | 26.4     | 1       | 26.4 | slightly overweight         | 1-11-13-15-16-20     |
| **9**       | :male_sign: MALE     | 27.8     | 1       | 27.8 | overweight                  | 1-11-13-15-17-18-20  |
| **10**      | :male_sign: MALE     | 31.1     | 1       | 31.1 | obese                       | 1-11-13-15-17-19-20  |

## Requirements
To run and edit the project, be sure to have installed in your computer the following softwares:
- [Java Development Kit 15](https://www.oracle.com/br/java/technologies/javase-jdk15-downloads.html)
- [JUnit 4.12](https://mvnrepository.com/artifact/junit/junit/4.12)
- [Hamcrest Core 1.3](https://mvnrepository.com/artifact/org.hamcrest/hamcrest-core/1.3)
- A code editor

After that, you'll need to clone this repo:
```
git clone https://github.com/LBeghini/Java-Unit-Tests.git
```

## Project Structure
In order to run the exact commands to compile and run the project, be sure to have the exact following project structure:

```
Java-Unit-Tests
└── 🗀 lib
|   |   hamcrest-core-1.3.jar
|   |   junit-4.12.jar
│   🗀 out
│   🗀 resources
└───🗀 src
│   └───🗀 main
        |   BodyMassIndex
        |   Gender
        |   Main
│   └───🗀 test
        |   BodyMassIndexTest
```

## How to run

### Compile

Go to `Java-Unit-Tests/out`, and run
```
javac -d . ../src/main/*.java
```
to compile the main project, and
```
javac -d . -cp 'main/*;../lib/junit-4.12.jar;'  ../src/test/*.java
```
to compile the tests.

### Run application
```
java main.Main
```

### Run tests
```
java -cp '..\lib\junit-4.12.jar;..\lib\hamcrest-core-1.3.jar;.' org.junit.runner.JUnitCore test.BodyMassIndex
```

## :balance_scale: License
[MIT License](https://github.com/LBeghini/Java-Unit-Tests/blob/main/LICENSE)
