package com.hartmanmark.charcount;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

class CharCounterTest {

    @ExtendWith(MockitoExtension.class)

    @Mock
    CharCounter charCounter;

    @Mock
    Cache cache;

    @InjectMocks
    CharCounterService charCounterService;

    @Test
    void countNumbersOfCharInString_shouldNotInvoke_whenTheCacheAlreadyHasACalculatedValue_Words() throws Exception {
        String input = "A book is a medium for recording information in the form of writing or images";
        when(cache.checkKey(input)).thenReturn(true);
        charCounterService.charCount(input);
        verify(charCounter, times(0)).countNumbersOfCharInString(input);
    }

    @Test
    void countNumbersOfCharInString_shouldInvoke_whenTheCacheDoesNotHaveACalculatedValueYet_Words() throws Exception {
        String input = "A book is a medium for recording information in the form of writing or images";
        when(cache.checkKey(input)).thenReturn(false);
        charCounterService.charCount(input);
        verify(charCounter, times(1)).countNumbersOfCharInString(input);
    }

    @Test
    void countNumbersOfCharInString_shouldNotInvoke_whenTheCacheAlreadyHasACalculatedValue_Numbers() throws Exception {
        String input = "1234567890";
        when(cache.checkKey(input)).thenReturn(true);
        charCounterService.charCount(input);
        verify(charCounter, times(0)).countNumbersOfCharInString(input);
    }

    @Test
    void countNumbersOfCharInString_shouldInvoke_whenTheCacheDoesNotHaveACalculatedValueYet_Numbers() throws Exception {
        String input = "1234567890";
        when(cache.checkKey(input)).thenReturn(false);
        charCounterService.charCount(input);
        verify(charCounter, times(1)).countNumbersOfCharInString(input);
    }

    @Test
    void countNumbersOfCharInString_shouldNotInvoke_whenTheCacheAlreadyHasACalculatedValue_Symbols() throws Exception {
        String input = "!@#$%^&*()";
        when(cache.checkKey(input)).thenReturn(true);
        charCounterService.charCount(input);
        verify(charCounter, times(0)).countNumbersOfCharInString(input);
    }

    @Test
    void countNumbersOfCharInString_shouldInvoke_whenTheCacheDoesNotHaveACalculatedValueYet_Symbols() throws Exception {
        String input = "!@#$%^&*()";
        when(cache.checkKey(input)).thenReturn(false);
        charCounterService.charCount(input);
        verify(charCounter, times(1)).countNumbersOfCharInString(input);
    }

    @Test
    void countNumbersOfCharInString_shouldNotInvoke_whenTheCacheAlreadyHasACalculatedValue_Spasec() throws Exception {
        String input = "            ";
        when(cache.checkKey(input)).thenReturn(true);
        charCounterService.charCount(input);
        verify(charCounter, times(0)).countNumbersOfCharInString(input);
    }

    @Test
    void countNumbersOfCharInString_shouldInvoke_whenTheCacheDoesNotHaveACalculatedValueYet_Spaces() throws Exception {
        String input = "            ";
        when(cache.checkKey(input)).thenReturn(false);
        charCounterService.charCount(input);
        verify(charCounter, times(1)).countNumbersOfCharInString(input);
    }
}
