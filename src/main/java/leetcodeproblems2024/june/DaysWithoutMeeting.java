package leetcodeproblems2024.june;

import java.util.Arrays;

public class DaysWithoutMeeting {
    /*public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(o1, o2) -> o1[0]-o2[0]);
        int totalMeetingDays = 0;
        for(int i=1; i< meetings.length; i++) {
            if (meetings[i][0] < days) {
                int j = i - 1;
                if (meetings[i][0] == meetings[j][0]) {
                    totalMeetingDays += (meetings[i][1] >= meetings[j][1] ? meetings[i][1] - meetings[i][0] : meetings[j][1] - meetings[j][0]) + 1;
                } else if (meetings[i][0] < meetings[j][1]) {
                    totalMeetingDays += (meetings[i][1] >= meetings[j][1] ? meetings[i][1] - meetings[j][0] : meetings[j][1] - meetings[j][0]) + 1;
                } else if (meetings[i][0] >= meetings[j][1]) {
                    if (totalMeetingDays == 0) {
                        totalMeetingDays += (meetings[j][1] - meetings[j][0]) + 1;
                    }
                    totalMeetingDays += (meetings[i][1] - meetings[i][0]) + 1;
                }
            }
        }
        System.out.println(totalMeetingDays);
        return 0;
    }*/

    public int countDays(int days, int[][] meetings){
        Arrays.sort(meetings,(a,b) -> a[0]-b[0]);
        int count=0;
        count = Math.abs(meetings[0][0]-1);
        int n = meetings.length;
        for(int i=1;i<n;i++){
            if(meetings[i][0] <= meetings[i-1][1]){
                meetings[i][1] = meetings[i-1][1];
            }
            else {
                int dy = meetings[i][0]- meetings[i-1][1];
                count += dy -1;
            }
        }
        count+= Math.abs(meetings[n-1][1] - days);
        return count;
    }

    public static void main(String[] args){
        DaysWithoutMeeting daysWithoutMeeting = new DaysWithoutMeeting();
        int[][] meetings= {{1,5},{2,7},{8,10}};
        System.out.println(daysWithoutMeeting.countDays(10,meetings));
    }
}
