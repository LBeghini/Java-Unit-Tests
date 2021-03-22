package test;

import main.Gender;
import main.IMC;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IMCTest {

    IMC imc = new IMC();

    @Test
    void testCalculate() {
        imc.setHeight(1);
        imc.setWeight(20);
        imc.setGender(Gender.FEMALE);
        assertEquals(20, imc.calculate());
    }

    @Test
    void testConditionFemaleAbaixoDoPeso() {
        imc.setHeight(1);
        imc.setWeight(19.0);
        imc.setGender(Gender.FEMALE);
        assertEquals("abaixo do peso", imc.condition());
    }

    @Test
    void testConditionFemalePesoNormal() {
        imc.setHeight(1);
        imc.setWeight(19.1);
        imc.setGender(Gender.FEMALE);
        assertEquals("no peso normal", imc.condition());
    }

    @Test
    void testConditionFemaleMarginalmenteAcima() {
        imc.setHeight(1);
        imc.setWeight(25.8);
        imc.setGender(Gender.FEMALE);
        assertEquals("marginalmente acima do peso", imc.condition());
    }

    @Test
    void testConditionFemaleAcima() {
        imc.setHeight(1);
        imc.setWeight(27.3);
        imc.setGender(Gender.FEMALE);
        assertEquals("acima do peso ideal", imc.condition());
    }

    @Test
    void testConditionFemaleObeso() {
        imc.setHeight(1);
        imc.setWeight(32.3);
        imc.setGender(Gender.FEMALE);
        assertEquals("obeso", imc.condition());
    }

    @Test
    void testConditionMaleAbaixoDoPeso() {
        imc.setHeight(1);
        imc.setWeight(20.6);
        imc.setGender(Gender.MALE);
        assertEquals("abaixo do peso", imc.condition());
    }

    @Test
    void testConditionMalePesoNormal() {
        imc.setHeight(1);
        imc.setWeight(20.7);
        imc.setGender(Gender.MALE);
        assertEquals("no peso normal", imc.condition());
    }

    @Test
    void testConditionMaleMarginalmenteAcima() {
        imc.setHeight(1);
        imc.setWeight(26.4);
        imc.setGender(Gender.MALE);
        assertEquals("marginalmente acima do peso", imc.condition());
    }

    @Test
    void testConditionMaleAcima() {
        imc.setHeight(1);
        imc.setWeight(27.8);
        imc.setGender(Gender.MALE);
        assertEquals("acima do peso ideal", imc.condition());
    }

    @Test
    void testConditionMaleObeso() {
        imc.setHeight(1);
        imc.setWeight(31.1);
        imc.setGender(Gender.MALE);
        assertEquals("obeso", imc.condition());
    }
}