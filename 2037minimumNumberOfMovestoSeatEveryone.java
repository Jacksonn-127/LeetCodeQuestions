class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int returnVal = 0;
        for(int i = 0; i < students.length;i++){
            returnVal += Math.abs(seats[i] - students[i]);
        }
        return returnVal;
    }
}
