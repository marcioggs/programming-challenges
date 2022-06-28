package com.marcioggs.neetcode150.interval.meetingrooms;

import java.util.List;

/** https://www.lintcode.com/problem/920/ */
public class Solution {

  /**
   * @param intervals: an array of meeting time intervals
   * @return: if a person could attend all meetings
   */
  public boolean canAttendMeetings(List<Interval> intervals) {

    boolean[] bookedSlots = new boolean[getMaxTime(intervals)];

    for (Interval interval : intervals) {
      for (int i = interval.start; i < interval.end; i++) {
        if (bookedSlots[i]) {
          return false;
        }
        bookedSlots[i] = true;
      }
    }
    return true;
  }

  private int getMaxTime(List<Interval> intervals) {
    int maxTime = 0;
    for (Interval interval : intervals) {
      maxTime = Math.max(maxTime, interval.end);
    }
    return maxTime;
  }
}
