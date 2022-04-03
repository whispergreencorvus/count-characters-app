package com.hartmanmark.charcount;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

class CharCounterTest {

    @Test
    void countNumbersOfCharInString_shouldCalledOnlyOneTime_whenInputDataContainsTheSameString() throws Exception {
        String firstInput = "hello world!";
        String secondInput = "hello world!";
        CharCounter charCounter = mock(CharCounter.class);
        CharCounterService charCounterService = new CharCounterService(charCounter);
        charCounterService.charCount(firstInput);
        charCounterService.charCount(secondInput);
        verify(charCounter, times(1)).countNumbersOfCharInString(secondInput);
    }
}
