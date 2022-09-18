class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aa=day(arriveAlice);
        int la=day(leaveAlice);
        int ab=day(arriveBob);
        int lb=day(leaveBob);
        if(la<ab || lb<aa) return 0;
        return Math.abs(Math.max(aa,ab)-Math.min(la,lb))+1;
    }
    public int day(String s)
    {
        int mnt[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int m=Integer.parseInt(s.substring(0,2));
        int d=Integer.parseInt(s.substring(3,5));
        int sum=0;
        for(int i=0;i<m-1;i++) sum+=mnt[i];
        return sum+d;
    }
}