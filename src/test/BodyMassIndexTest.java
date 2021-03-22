package test;

import main.Gender;
import main.BodyMassIndex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassIndexTest {

    BodyMassIndex bmi = new BodyMassIndex();

    @Test
    void testCalculate() {
        bmi.setHeight(1);
        bmi.setWeight(20);
        bmi.setGender(Gender.FEMALE);
        assertEquals(20, bmi.calculate());
    }

    @Test
    void testConditionFemaleAbaixoDoPeso() {
        bmi.setHeight(1);
        bmi.setWeight(19.0);
        bmi.setGender(Gender.FEMALE);
        assertEquals("abaixo do peso", bmi.condition());
    }

    @Test
    void testConditionFemalePesoNormal() {
        bmi.setHeight(1);
        bmi.setWeight(19.1);
        bmi.setGender(Gender.FEMALE);
        assertEquals("no peso normal", bmi.condition());
    }

    @Test
    void testConditionFemaleMarginalmenteAcima() {
        bmi.setHeight(1);
        bmi.setWeight(25.8);
        bmi.setGender(Gender.FEMALE);
        assertEquals("marginalmente acima do peso", bmi.condition());
    }

    @Test
    void testConditionFemaleAcima() {
        bmi.setHeight(1);
        bmi.setWeight(27.3);
        bmi.setGender(Gender.FEMALE);
        assertEquals("acima do peso ideal", bmi.condition());
    }

    @Test
    void testConditionFemaleObeso() {
        bmi.setHeight(1);
        bmi.setWeight(32.3);
        bmi.setGender(Gender.FEMALE);
        assertEquals("obeso", bmi.condition());
    }

    @Test
    void testConditionMaleAbaixoDoPeso() {
        bmi.setHeight(1);
        bmi.setWeight(20.6);
        bmi.setGender(Gender.MALE);
        assertEquals("abaixo do peso", bmi.condition());
    }

    @Test
    void testConditionMalePesoNormal() {
        bmi.setHeight(1);
        bmi.setWeight(20.7);
        bmi.setGender(Gender.MALE);
        assertEquals("no peso normal", bmi.condition());
    }

    @Test
    void testConditionMaleMarginalmenteAcima() {
        bmi.setHeight(1);
        bmi.setWeight(26.4);
        bmi.setGender(Gender.MALE);
        assertEquals("marginalmente acima do peso", bmi.condition());
    }

    @Test
    void testConditionMaleAcima() {
        bmi.setHeight(1);
        bmi.setWeight(27.8);
        bmi.setGender(Gender.MALE);
        assertEquals("acima do peso ideal", bmi.condition());
    }

    @Test
    void testConditionMaleObeso() {
        bmi.setHeight(1);
        bmi.setWeight(31.1);
        bmi.setGender(Gender.MALE);
        assertEquals("obeso", bmi.condition());
    }
}