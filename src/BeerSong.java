


/**
 *
 * William Ward
 * CIT 337
 * 9/30/2016
 */
public class BeerSong {


    public static void main(String[] args) {
        int beerNum = 99;                           //int to store Number of Bottle            
        String word = "bottles";                    //Create String of Bottles
        while(beerNum > 0){                         //While loop to count bottles
            if (beerNum == 1){                      //Increment loop by 1
                word = "bottle";                    //Word to use after number
            }
            //Print number of bottles of beer on the wall
            System.out.println(beerNum + " " + word + " of beer on the wall");
            //Print number of bottles of beer
            System.out.println(beerNum + " " + word + " of beer.");
            //Print take one down
            System.out.println("Take one down.");
            //Print pass it around
            System.out.println("Pass it around.");
            //print Number of bottles of beer on the wall incremented by -1
            beerNum = beerNum - 1;
            
            if (beerNum > 0) {                      //If there is more than 0 bottles
                //Print the number of bottles of beer on the wall
                System.out.println(beerNum + " " + word + " of beer on the wall");
               //If there are 0 bottles of beer left
            }else {
                //Print this
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }
}
