package test;

import main.BodyMassIndex;
import main.Gender;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BodyMassIndexTest {    BodyMassIndex bmi;

    @Before
    public void setUp() throws Exception {
        bmi = new BodyMassIndex();
    }

    @Test
    public void testCalculate() {
        bmi.setHeight(1);
        bmi.setWeight(20);
        bmi.setGender(Gender.FEMALE);
        assertEquals(20, bmi.calculate(), 1);
    }

    @Test
    public void testConditionFemaleUnderweight() {
        bmi.setHeight(1);
        bmi.setWeight(19.0);
        bmi.setGender(Gender.FEMALE);
        assertEquals("underweight", bmi.condition());
    }

    @Test
    public void testConditionFemaleNormal() {
        bmi.setHeight(1);
        bmi.setWeight(19.1);
        bmi.setGender(Gender.FEMALE);
        assertEquals("normal", bmi.condition());
    }

    @Test
    public void testConditionFemaleSlightlyOverweight() {
        bmi.setHeight(1);
        bmi.setWeight(25.8);
        bmi.setGender(Gender.FEMALE);
        assertEquals("slightly overweight", bmi.condition());
    }

    @Test
    public void testConditionFemaleOverweight() {
        bmi.setHeight(1);
        bmi.setWeight(27.3);
        bmi.setGender(Gender.FEMALE);
        assertEquals("overweight", bmi.condition());
    }

    @Test
    public void testConditionFemaleObese() {
        bmi.setHeight(1);
        bmi.setWeight(32.3);
        bmi.setGender(Gender.FEMALE);
        assertEquals("obese", bmi.condition());
    }

    @Test
    public void testConditionMaleUnderweight() {
        bmi.setHeight(1);
        bmi.setWeight(20.6);
        bmi.setGender(Gender.MALE);
        assertEquals("underweight", bmi.condition());
    }

    @Test
    public void testConditionMaleNormal() {
        bmi.setHeight(1);
        bmi.setWeight(20.7);
        bmi.setGender(Gender.MALE);
        assertEquals("normal", bmi.condition());
    }

    @Test
    public void testConditionMaleSlightlyOverweight() {
        bmi.setHeight(1);
        bmi.setWeight(26.4);
        bmi.setGender(Gender.MALE);
        assertEquals("slightly overweight", bmi.condition());
    }

    @Test
    public void testConditionMaleOverweight() {
        bmi.setHeight(1);
        bmi.setWeight(27.8);
        bmi.setGender(Gender.MALE);
        assertEquals("overweight", bmi.condition());
    }

    @Test
    public void testConditionMaleObese() {
        bmi.setHeight(1);
        bmi.setWeight(31.1);
        bmi.setGender(Gender.MALE);
        assertEquals("obese", bmi.condition());
    }


}