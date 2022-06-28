import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class Level3CodingExam {

    /*
     * PART A
     * 
     * There are multiple candidates for "Person of the Year 2014".
     * Complete the appropriate method to return the winner based on who
     * received the greatest number of votes.
     * 
     * The votes are contained in an ArrayList.
     * Not every voter has capitalized the name of their choice in the same way.
     */
//    @Test
//    public void testWinner() {
//        ArrayList<String> votes = new ArrayList<String>();
//        votes.add("pope francis");
//        votes.add("Pope Francis");
//        votes.add("Kathryn Sullivan");
//        votes.add("edward Snowden");
//        votes.add("EDWARD SNOWDEN");
//        votes.add("Jeff Bezos");
//        votes.add("Edward snowden");
//        votes.add("Pope Francis");
//        votes.add("Edward Snowden");
//        votes.add("pope Francis");
//        votes.add("Kathryn Sullivan");
//        votes.add("kathryn sullivan");
//        votes.add("Pope francis");
//        votes.add("Pope Francis");
//        votes.add("Edward Snowden");
//        votes.add("jeff bezos");
//
//        assertEquals("pope francis", new VoteProcessor().calculateElectionWinner(votes));
//    }

    /*
     * If neither candidate has more votes than the other, report a tie by
     * returning the String "TIE".
     */
//    @Test
//    public void testATie() {
//        ArrayList<String> votes = new ArrayList<String>();
//        votes.add("pope francis");
//        votes.add("edward Snowden");
//
//        assertEquals("TIE", new VoteProcessor().calculateElectionWinner(votes));
//    }

    /*
     * PART B
     * 
     * Jane is studying the weather patterns in San Diego. She has temperature
     * data from the last few weeks in an array.
     * 1) Write the appropriate method to sort the temperatures from
     *    lowest to highest.
     * 2) Remove any duplicate temperature readings.
     * 
     * The temperature readings are in degrees Farenheit and stored as a Double.
     * The method shall return an array of the sorted temperature readings
     * with no duplicate temperature values. 
     */
    @Test
    public void testSorted() throws Exception {
        Double[] rawTemperaturesF = { 70.9, 71.2, 75.5, 73.9, 77.1, 78.7, 75.5, 80.0,
                                      79.8, 78.3, 74.0, 73.9, 72.1, 71.2, 72.9, 75.0,
                                      75.1, 75.1, 75.1, 75.1, 76.6, 81.8, 81.7, 81.5 };
        
        Double[] expectedTemperaturesF = { 70.9, 71.2, 72.1, 72.9, 73.9, 74.0, 75.0,
                                           75.1, 75.5, 76.6, 77.1, 78.3, 78.7, 79.8,
                                           80.0, 81.5, 81.7, 81.8 };
        
        assertTrue(Arrays.equals(expectedTemperaturesF, WeatherUtilities.sortTemperatures(rawTemperaturesF)));
    }
}
