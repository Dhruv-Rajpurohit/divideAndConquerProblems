# Divide And Conquer Problems
Solved Divide and Conquer Problems using Binary Search

For PartA - Refer SolutionA, PartB - SolutionB.

<h3><b>PART-A</b></h3>
You are given an array of integers that represents the IDs of the users that have registered in “UpgradBook,” a private social network created for all the students who have graduated from Upgrads’ programs.

The array of integers has the following properties:

With a known length N

The array is sorted in an ascending order

The array holds distinct integers (i.e. there are no repeating numbers)

The array is 1-indexed, i.e. the first element is stored in A[1] (not A[0])

Find the first positive integer M (where 1 <= M <= N) such that when M is used as the array index, the result from the array is the the integer M itself. i.e. A[M] = M

In other words, find the first positive integer M where M is both a user’s ID and its index in the array of user ids.

Write a program to find M, if it exists, in O(log N) time. If M does not exist, please return NOT_FOUND

<h3><b>PART-B</b></h3>
You are given an array of integers that represents the IDs of the users that have registered in “UpgradBook.”

The array of integers have the following properties:

The array is sorted is an ascending order

The array holds distinct integers (i.e. there are no repeating numbers)

The array is 1-indexed, i.e. the first element is stored in A[1] (not A[0])

However the length of the array, N, is unknown (i.e. you don’t know how long the array is and arrayName.length is not available to you). In short, you can not use the length of the array to apply binary search

Since the length of the array is unknown, an error “ArrayIndexOutOfBoundsException” is returned if you try to index into the array with an integer greater than N.

Find a function to find positive integer M in the array A and write a program to find M (if M exists) in O(log N) time.
