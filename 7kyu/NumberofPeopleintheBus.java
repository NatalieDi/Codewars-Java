/*https://www.codewars.com/kata/5648b12ce68d9daa6b000099/java
DESCRIPTION:
There is a bus moving in the city which takes and drops some people at each bus stop.
You are provided with a list (or array) of integer pairs. Elements of each pair represent the number of people that get on the bus (the first item) and the number of people that get off the bus (the second item) at a bus stop.
Your task is to return the number of people who are still on the bus after the last bus stop (after the last array). Even though it is the last bus stop, the bus might not be empty and some people might still be inside the bus, they are probably sleeping there :D
Take a look on the test cases.
Please keep in mind that the test cases ensure that the number of people in the bus is always >= 0. So the returned integer can't be negative.
The second value in the first pair in the array is 0, since the bus is empty in the first bus stop.
 */
import java.util.ArrayList;
public class NumberofPeopleintheBus {
    public static void main(String[] args) {

            //    test cases
//     ArrayList<int[]> Stops = new ArrayList<int[]>();
//        Stops.add(new int[]{5,0} );
//        Stops.add(new int[]{5,3} );
//        Stops.add(new int[]{6,2} );

 ArrayList<int[]> Stops = new ArrayList<int[]>();
        Stops.add(new int[]{5,0} );
        Stops.add(new int[]{7,4} );
        Stops.add(new int[]{6,5} );
        Stops.add(new int[]{6,3} );

//            ArrayList<int[]> Stops = new ArrayList<int[]>();
//            Stops.add(new int[]{4,0} );
//            Stops.add(new int[]{7,3} );
//            Stops.add(new int[]{5,3} );
//            Stops.add(new int[]{4,2} );


            //method call
            System.out.println(countPassengers(Stops));

        }

        public static int countPassengers(ArrayList<int[]> stops) {
            int sum = 0;
            for (int[] x : stops) {
                sum += x[0] - x[1];
            }
            return sum;

        }
    }

