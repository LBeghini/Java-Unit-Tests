# :coffee: Java Unit Tests

## About
This application is a simple Java Console Application that aims to implement a base code that calculates IMC: Índice de Massa Corporal (body mass index) to apply unit tests in JUnit.

## Technologies
- Java
- JUnit

## The problem

### Test Cases
From the analysis of the Ciclomatic Complexity, the test cases are determined:

|             | Gender  | Weight   |  Height | IMC  | Result                      |Path |
|  :-------:  | :-----: | :-------:| :-----: |:---: | :-----                      | -   |
| **1**       | FEMALE  | 19.1     | 1       | 19.0 | abaixo do peso              | -   |
| **1**       | FEMALE  | 19.1     | 1       | 19.1 | no peso normal              | -   |
| **2**       | FEMALE  | 25.8     | 1       | 25.8 | marginalmente acima do peso | -   |
| **3**       | FEMALE  | 27.3     | 1       | 27.3 | acima do peso ideal         | -   |
| **4**       | FEMALE  | 32.3     | 1       | 32.3 | obeso                       | -   |
| **6**       | MALE    | 20.6     | 1       | 20.6 | abaixo do peso              | -   |
| **7**       | MALE    | 20.7     | 1       | 20.7 | no peso normal              | -   |
| **8**       | MALE    | 26.4     | 1       | 26.4 | marginalmente acima do peso | -   |
| **9**       | MALE    | 27.8     | 1       | 27.8 | acima do peso ideal         | -   |
| **10**      | MALE    | 31.1     | 1       | 31.1 | obeso                       | -   |

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
