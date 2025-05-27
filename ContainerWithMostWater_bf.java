package company.Java;
import java.util.*;
public class ContainerWithMostWater_bf {
    public static int Container(ArrayList<Integer> height){
        int max = 0;
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
               int Height = Math.min(height.get(i),height.get(j));
               int width = j-i;
               int ContainWater = Height*width;
               max = Math.max(max,ContainWater);
            }
        }
        return max;
    }

    public static int ContainerWater(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;
        while(lp < rp){
            int Height = Math.min(height.get(lp),height.get(rp));
            int width = rp-lp;
            int currentWater = Height*width;
            maxWater = Math.max(maxWater,currentWater);
            if(lp < rp){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        //System.out.println(Container(height));
        System.out.println(ContainerWater(height));
    }
}
