package edu.desu.partB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemsTest {
    @Test
    public void diff100Test01(){
        //Given
        Problems exam01 = new Problems();
        Integer input = 50;

        //When
        Boolean expected = false;
        Boolean actual = exam01.diff100(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void diff100Test02(){
        //Given
        Problems exam01 = new Problems();
        Integer input = 90;

        //When
        Boolean expected = true;
        Boolean actual = exam01.diff100(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void diff100Test03(){
        //Given
        Problems exam01 = new Problems();
        Integer input = 105;

        //When
        Boolean expected = true;
        Boolean actual = exam01.diff100(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void diff100Test04(){
        //Given
        Problems exam01 = new Problems();
        Integer input = 89;

        //When
        Boolean expected = false;
        Boolean actual = exam01.diff100(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void diff100Test05(){
        //Given
        Problems exam01 = new Problems();
        Integer input = 111;

        //When
        Boolean expected = false;
        Boolean actual = exam01.diff100(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void threeOr5Or3and5_01(){
        //Given
        Problems exam01 = new Problems();
        Integer input = 3;

        //When
        String expected = "three";
        String actual = exam01.threeOr5or3and5(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void threeOr5Or3and5_02(){
        //Given
        Problems exam01 = new Problems();
        Integer input = 20;

        //When
        String expected = "five";
        String actual = exam01.threeOr5or3and5(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void threeOr5Or3and5_03(){
        //Given
        Problems exam01 = new Problems();
        Integer input = 30;

        //When
        String expected = "both";
        String actual = exam01.threeOr5or3and5(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void threeOr5Or3and5_04(){
        //Given
        Problems exam01 = new Problems();
        Integer input = 8;

        //When
        String expected = "neither";
        String actual = exam01.threeOr5or3and5(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void threeOr5Or3and5_05(){
        //Given
        Problems exam01 = new Problems();
        Integer input = 11;

        //When
        String expected = "neither";
        String actual = exam01.threeOr5or3and5(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }



    @Test
    public void makes10or20Test01(){
        //Given
        Problems exam01 = new Problems();

        //When
        Boolean expected = true;
        Boolean actual = exam01.makes10or20(9,10);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void makes10or20Test02(){
        //Given
        Problems exam01 = new Problems();

        //When
        Boolean expected = false;
        Boolean actual = exam01.makes10or20(17,2);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void makes10or20Test03(){
        //Given
        Problems exam01 = new Problems();

        //When
        Boolean expected = true;
        Boolean actual = exam01.makes10or20(1,19);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void makes10or20Test04(){
        //Given
        Problems exam01 = new Problems();

        //When
        Boolean expected = true;
        Boolean actual = exam01.makes10or20(20,1);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void makes10or20Test05(){
        //Given
        Problems exam01 = new Problems();

        //When
        Boolean expected = true;
        Boolean actual = exam01.makes10or20(10,20);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void posNegTest01(){
        //Given
        Problems exam01 = new Problems();

        //When
        Boolean expected = true;
        Boolean actual = exam01.posNeg(1,-1,false);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void posNegTest02(){
        //Given
        Problems exam01 = new Problems();

        //When
        Boolean expected = true;
        Boolean actual = exam01.posNeg(-1,1,false);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void posNegTest03(){
        //Given
        Problems exam01 = new Problems();

        //When
        Boolean expected = true;
        Boolean actual = exam01.posNeg(-4,-5,true);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void posNegTest04(){
        //Given
        Problems exam01 = new Problems();

        //When
        Boolean expected = false;
        Boolean actual = exam01.posNeg(-4,-5,false);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void posNegTest05(){
        //Given
        Problems exam01 = new Problems();

        //When
        Boolean expected = true;
        Boolean actual = exam01.posNeg(-4,5,false);

        //Then
        Assertions.assertEquals(expected,actual);
    }
}
