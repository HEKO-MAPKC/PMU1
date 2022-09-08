package com.example.pmulab1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        Mfunc mfunc = new Mfunc();

        int arr[] = new int[]{10, 11, 1};
        assertEquals(mfunc.getMin(arr),1);
        arr = new int[]{10, 11, 1,-1,-100};
        assertEquals(mfunc.getMin(arr),-100);
        arr = new int[]{10};
        assertEquals(mfunc.getMin(arr),10);
        arr = new int[]{10, 11, 112,123,10};
        assertEquals(mfunc.getMin(arr),10);

        arr = new int[]{10, 11, 1};
        assertEquals(mfunc.getMax(arr),11);
        arr = new int[]{10, 11, 1,-1,-100};
        assertEquals(mfunc.getMax(arr),11);
        arr = new int[]{10};
        assertEquals(mfunc.getMax(arr),10);
        arr = new int[]{10, 11, 112,123,10};
        assertEquals(mfunc.getMax(arr),123);
    }

}