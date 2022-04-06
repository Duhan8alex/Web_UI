package org.example.home_work4;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




public class TriangleTest {
    @Test
    void successCalculationTest() throws Exception {
        Assertions.assertEquals(TriangleArea.calculateArea(1, 2, 2), 2);
    }


}