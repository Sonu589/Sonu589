package com.mmt.android;

import org.testng.annotations.Test;
import org.testng.Assert;

/**
 * This file contains intentional errors to test GitHub Actions PR validation workflow.
 * DELETE THIS FILE after testing!
 */
public class TestBrokenCode {

    // ERROR 1: Missing semicolon
    private String testVariable = "hello"

    // ERROR 2: Undefined variable usage
    @Test
    public void testUndefinedVariable() {
        System.out.println(undefinedVar);
    }

    // ERROR 3: Wrong method signature - missing return type
    @Test
    public testMissingReturnType() {
        Assert.assertTrue(true);
    }

    // ERROR 4: Unclosed bracket
    @Test
    public void testUnclosedBracket() {
        if (true) {
            System.out.println("test");
        // Missing closing brace here
    }

    // ERROR 5: Type mismatch
    @Test
    public void testTypeMismatch() {
        int number = "this is a string";
        Assert.assertEquals(number, 10);
    }

    // ERROR 6: Missing import - using non-imported class
    @Test
    public void testMissingImport() {
        WebDriver driver = new ChromeDriver();
    }

    // ERROR 7: Duplicate method name
    @Test
    public void testDuplicate() {
        System.out.println("first");
    }

    @Test
    public void testDuplicate() {
        System.out.println("second");
    }

    // ERROR 8: Invalid syntax in annotation
    @Test(priority = "not a number")
    public void testInvalidAnnotation() {
        Assert.assertTrue(true);
    }

    // ERROR 9: Unreachable code
    @Test
    public void testUnreachableCode() {
        return;
        System.out.println("This will never execute");
    }
}
