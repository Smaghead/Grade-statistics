Part 1: Point averages
Write a program that reads integers representing course point totals from the user. Numbers between [0-100] are acceptable and the number -1 ends the reading of input. Other numbers are erroneous input, which should be ignored. When the user enters the number -1, the program should print the average of the point totals that were input.

Part 2: Point average for points giving a passing grade
Extend the program, such that it in addition to giving the point average of all totals also provides the point average for points giving a passing grade.

A passing grade is achieved by getting a minimum of 50 course points. You may assume that the user always provides at least one integer between [0-100]. If there are no numbers giving a passing grade, the program should print a line "-" where the average would be.

Part 3: Pass percentage
Extend the program from the previous part, such that it also print the pass percentage. The pass percentage is calculated using the formula 100 * passing / participants.

Part 4: Grade distribution
Extend the program, such that it also prints the grade distribution. The grade distribution is as follows:

points	  grade
< 50	    failed, i.e. 0
< 60	    1
< 70	    2
< 80	    3
< 90	    4
>= 90	    5
Each point total is converted to a grade based on the above table. If a point total isn't within [0-100], it should be ignored.

The grade distribution is printed out as stars. E.g. if there is one point total giving the grade 5, then it should print the row 5: *. If there are no point totals giving a particular grade, then no stars should be printed for it. In the sample below this is true for e.g. the grade 4.

#Sample output:

Enter point totals, -1 stops:
102
-2
1
33
77
99
-1
Point average (all): 52.5
Point average (passing): 88.0
Pass percentage: 50.0
Grade distribution:
5: *
4:
3: *
2:
1:
0: **
