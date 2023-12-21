package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));}

    @Test
    public void stringOutsideUnpairedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[][Code"));}

    @Test
    public void stringOutsideUnbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch][Code"));}

@Test
public void bracketsAroundString(){
    assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));}

    @Test
    public void bracketsAroundStringWhileStringOutside(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));}


    @Test
    public void bracketsAreNotSurroundingString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));}

    @Test
    public void emptyStringWithoutBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));}

    @Test
    public void stringWithMissingBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));}
    @Test
    public void stringWithMisalignedBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));}
    @Test
    public void emptyStringMissingBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));}
    @Test
    public void emptyStringWithMisalignedBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));}
}


