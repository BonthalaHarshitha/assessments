package sample;
import java.util.*;
public class Solution {
    public static ArrayList<Associate> associatesForGivenTechnology(Associate[] associates, String searchTechnology)
    {
        ArrayList<Associate> result = new ArrayList<>();
    	for (Associate associate : associates) {
            if (associate.getTechnology().equalsIgnoreCase(searchTechnology) && associate.getExperienceInYears() % 5 == 0) {
                result.add(associate);
            }
        }
        return result;
      
    }
    public static void main(String args[]) {
    	
        Associate[] associates = new Associate[5];
        associates[0] = new Associate(101, "Alex", "Java", 15);
        associates[1] = new Associate(102, "Albert", "Unix", 20);
        associates[2] = new Associate(103, "Alferd", "Testing", 13);
        associates[3] = new Associate(104, "Alfa", "Java", 15);
        associates[4] = new Associate(105, "Almas", "Java", 29);

        String searchTechnology = "Java";
        List<Associate> filteredAssociates = Solution.associatesForGivenTechnology(associates, searchTechnology);
        for (Associate associate : filteredAssociates) {
                    System.out.println(associate.getId());
                }
            }
        


    		}

    


