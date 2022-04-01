package com.hartmanmark.charcount;

<<<<<<< HEAD
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class CacheTest {

    @Test
    void checkKey_shouldReturnTrue_whenCheckKeyContainsString() throws Exception {
        Cache cache = mock(Cache.class);
        CharCounterService charCounterService = new CharCounterService(cache);
        String text = "Hello World!";
        charCounterService.charCount(text);
        when(cache.checkKey(text)).thenReturn(true);
        boolean chackCache = cache.checkKey(text);
        assertEquals(true, chackCache);
    }
=======
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

class CacheTest {

    @Mock
    Cache cache = new Cache();



    @Test
    void test() {


    }

>>>>>>> c674568511c9822678a241db75bf647e5f2ac4a5
}
