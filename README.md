#Task 5

Write an application char-counter that takes a string and returns the number of unique characters in the string.

It is expected that a string with the same character sequence may be passed several times to the method.

Since the counting operation can be time-consuming, the method should cache the results, so that when the method is given a string previously encountered, it will simply retrieve the stored result. Use collections and maps where appropriate.

Example of result:

```
A book is a medium for recording information in the form of writing or images
" " - 14
"A" - 1
"a" - 3
"b" - 1
"c" - 1
"d" - 2
"e" - 4
"f" - 4
"g" - 3
"h" - 1
"i" - 9
"k" - 1
"m" - 5
"n" - 5
"o" - 9
"r" - 7
"s" - 2
"t" - 3
"u" - 1
"w" - 1
