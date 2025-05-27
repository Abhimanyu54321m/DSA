package company.Java;
import java.util.*;
public class ActivitySelection_Greedy {
    public static void main(String[] args) {
        int start[] = {1,3,2,5};
        int end[] = {2,4,3,6};

        //sorting
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));


        int maxAct = 1;

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(activities[0][0]);
        int lastAct = activities[0][2];

        for(int i=1; i<end.length; i++){
            if(activities[i][1] >= lastAct){
                //Activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastAct = activities[i][2];
            }
        }
        System.out.println("Total activities is : " +maxAct);

        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i) +" ");
        }
        System.out.println();
    }
}
