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
    void testConditionFemaleUnderweight() {
        bmi.setHeight(1);
        bmi.setWeight(19.0);
        bmi.setGender(Gender.FEMALE);
        assertEquals("underweight", bmi.condition());
    }

    @Test
    void testConditionFemaleNormal() {
        bmi.setHeight(1);
        bmi.setWeight(19.1);
        bmi.setGender(Gender.FEMALE);
        assertEquals("normal", bmi.condition());
    }

    @Test
    void testConditionFemaleSlightlyOverweight() {
        bmi.setHeight(1);
        bmi.setWeight(25.8);
        bmi.setGender(Gender.FEMALE);
        assertEquals("slightly overweight", bmi.condition());
    }

    @Test
    void testConditionFemaleOverweight() {
        bmi.setHeight(1);
        bmi.setWeight(27.3);
        bmi.setGender(Gender.FEMALE);
        assertEquals("overweight", bmi.condition());
    }

    @Test
    void testConditionFemaleObese() {
        bmi.setHeight(1);
        bmi.setWeight(32.3);
        bmi.setGender(Gender.FEMALE);
        assertEquals("obese", bmi.condition());
    }

    @Test
    void testConditionMaleUnderweight() {
        bmi.setHeight(1);
        bmi.setWeight(20.6);
        bmi.setGender(Gender.MALE);
        assertEquals("underweight", bmi.condition());
    }

    @Test
    void testConditionMaleNormal() {
        bmi.setHeight(1);
        bmi.setWeight(20.7);
        bmi.setGender(Gender.MALE);
        assertEquals("normal", bmi.condition());
    }

    @Test
    void testConditionMaleSlightlyOverweight() {
        bmi.setHeight(1);
        bmi.setWeight(26.4);
        bmi.setGender(Gender.MALE);
        assertEquals("slightly overweight", bmi.condition());
    }

    @Test
    void testConditionMaleOverweight() {
        bmi.setHeight(1);
        bmi.setWeight(27.8);
        bmi.setGender(Gender.MALE);
        assertEquals("overweight", bmi.condition());
    }

    @Test
    void testConditionMaleObese() {
        bmi.setHeight(1);
        bmi.setWeight(31.1);
        bmi.setGender(Gender.MALE);
        assertEquals("obese", bmi.condition());
    }
}