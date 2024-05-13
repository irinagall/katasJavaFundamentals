package codingBat;

/*We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks

makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true */

public class MakeBricks {

    public boolean makeBricks(int small, int big, int goal) {
        //3         2         9 --false
        //(20, 0, 19) → true
        //makeBricks(20, 4, 39) → true	false	X
        int remainder = goal % 5;
        int bigBricksAvailable = big;

        if( goal % 5 == 0 && remainder <= small ){
            return true;
        }else if ( big >= 1 && (goal - 5) <= small ){
            return true;
        } else if( big >= 2 && goal - 10 <= small ){
            return true;
        }
        return false;
    }
}
