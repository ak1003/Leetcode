class MeetingRoom {
    public int minMeetingRooms(int[][] intervals) {
          if(intervals.length==0)
              return 0;
          int len=intervals.length;
          int[] start= new int[len];
          int[] finish= new int[len];
          // System.out.println(len);
          // Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
          for(int i=0;i<len;i++){
              start[i]=intervals[i][0];
              finish[i]=intervals[i][1];
              // System.out.println("start"+start[i]);
              // System.out.println("finish"+finish[i]);
          }
        Arrays.sort(start);
        Arrays.sort(finish);
          int count=0;
          int index = 0;
          for (int i = 0; i < len; i++) {
            count++;
            if (start[i] >= finish[index]) {
                count--;
                index++;
            }
        }
        return count;
    }

}
