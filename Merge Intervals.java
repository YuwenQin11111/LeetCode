public class Solution {
	public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		ArrayList<Interval> result =new ArrayList<Interval>();
		if (intervals.size() ==0)
			return result;
		
		Interval[] interv =new Interval[intervals.size()];
		for (int i=0;i<intervals.size();i++)
		{
			interv[i] =intervals.get(i);
			
		}
		quicksort(interv,0,intervals.size()-1);
		Interval a =new Interval(interv[0].start,interv[0].end);
		int i=1;
		while (i<intervals.size())
		{
			if (interv[i].start >a.end)
			{
				result.add(a);
				a =new Interval(interv[i].start,interv[i].end);
			}
			else
			{
				a.end =interv[i].end;
			}
			i++;
			
		}
		
		result.add(a);
		return result;
    }
	
	public void quicksort(Interval[] intervals, int start, int end)
	{
		if (start >=end)
			return;
		
		int val =intervals[end].start;
		int i=start;
		int j=start;
		while (i<=end)
		{
			if (intervals[i].start <val)
			{
				Interval tmp =intervals[i];
				intervals[i] =intervals[j];
				intervals[j] =tmp;
				j++;
			}
			i++;
			
		}
		Interval tmp =intervals[j];
		intervals[j] =intervals[end];
		intervals[end] =tmp;
		quicksort(intervals,start,j-1);
		quicksort(intervals,j+1,end);
	}

}
