public class Solution {
	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		ArrayList<Interval> result =new ArrayList<Interval>();
		if (intervals.size() ==0)
		{
			result.add(newInterval);
			return result;
		}
		
		int i=0;
		while (i<intervals.size())
		{
			if (intervals.get(i).end <newInterval.start)
				result.add(intervals.get(i));
			else
				break;
			
			i++;
		}
		
		if (i ==intervals.size())
		{
			result.add(newInterval);
			return result;
		}
		
		Interval interv =new Interval(intervals.get(i).start,newInterval.end);
		while (i<intervals.size())
		{
			if (intervals.get(i).start >newInterval.end)
				break;
			
			interv.end =intervals.get(i).end;
			i++;
		}
		
		result.add(interv);
		while (i<intervals.size())
		{
			result.add(intervals.get(i));
			i++;
		}
		
		return result;
    }

}
