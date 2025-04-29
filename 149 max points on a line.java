class Solution {
    public int maxPoints(int[][] points) {
        // set to 0 
        int max=0;
        // loop through each point 
        for(int i=0; i<points.length; i++)
        {
            // hash map to store slope of each point 
            HashMap<Double, Integer> map= new HashMap<>();
            for(int j=0; j<points.length; j++)
            {
                // set slope to 0 
                double slope=0;
                if(points[i][0]==points[j][0] && points[i][1]==points[j][1])
                {
                    continue;
                }

                // if p1 and p2 are the same set slope to infinity 
                if(points[i][0]==points[j][0])
                {
                    slope=Double.POSITIVE_INFINITY;
                }
                // else two different points calculate the slope 
                else
                {
                    slope= (double)(points[j][1]-points[i][1])/(points[j][0]-points[i][0]);
                }
                map.put(slope,map.getOrDefault(slope,0)+1);
                // find the hash value with the largest value
                max=Math.max(max,map.get(slope));
            }
        }
        // return the max hash value + 1 
        return max+1;
    }
}
