package factoria5.javaamstrong;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class ArmstrongNumberCheckerTest {

    @Test
    public void testPositiveCase371() {
        ArmstrongNumberChecker checker = new ArmstrongNumberChecker();
        assertTrue(checker.isArmstrong(371));
    }

    @Test
    public void testPositiveCase1634() {
        ArmstrongNumberChecker checker = new ArmstrongNumberChecker();
        assertTrue(checker.isArmstrong(1634));
    }

    @Test
    public void testNegativeCase351() {
        ArmstrongNumberChecker checker = new ArmstrongNumberChecker();
        assertFalse(checker.isArmstrong(351));
    }

    @Test
    public void testNegativeCase2015() {
        ArmstrongNumberChecker checker = new ArmstrongNumberChecker();
        assertFalse(checker.isArmstrong(2015));
    }
}
