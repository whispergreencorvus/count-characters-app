package com.hartmanmark.charcount;

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
}
