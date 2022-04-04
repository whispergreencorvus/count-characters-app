package com.hartmanmark.charcount;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.MockitoJUnitRunner;

@ExtendWith(MockitoException.class)

class CharCounterTest {
    
    @Mock CharCounter charCounter;
    
    @InjectMocks
    CharCounterService charCounterService;
        
    @Test
    void countNumbersOfCharInString_shouldCalledOnlyOneTime_whenInputDataContainsTheSameString() throws Exception {
        String firstInput = "hello world!";
        String secondInput = "hello world!";
//        CharCounter charCounter = mock(CharCounter.class);
//        CharCounterService charCounterService = new CharCounterService(charCounter);
        charCounterService.charCount(firstInput);
        charCounterService.charCount(secondInput);
        verify(charCounter, times(1)).countNumbersOfCharInString(secondInput);
    }
}
