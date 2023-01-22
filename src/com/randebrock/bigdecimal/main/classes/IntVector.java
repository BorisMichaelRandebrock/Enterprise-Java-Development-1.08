package com.randebrock.bigdecimal.main.classes;

public class IntVector implements IntList{
    public void add(int value) {

    }

    public int getElementById(int id) {
        return 0;
    }
}
/*
The first implementation is IntArrayList.
IntArrayList should store numbers in an array with a length of 10 by default.
When the add method is called, you must first determine if the array is full.
If it is, create a new array that is 50% larger, move all elements over to the new array and add the new element.
(for example, an array of length 10 would be increased to 15)
The second implementation is IntVector. IntVector should store numbers in an array with a length of 20 by default.
When the add method is called, you must first determine if the array is full. If it is, create a new array that is
double the size of the current array, move all elements over to the new array and add the new element.
(for example, an array of length 10 would be increased to 20)
In your README.md include an example of when IntArrayList would be more efficient and when
IntVector would be more efficient.




An IntList is simply a way to store an ordered list of integers.

All IntLists should have an add method by which a user can a new number to the list.
All IntLists should have a get method by which users can retrieve an element by id.
You will need two implementations of IntList.
 */