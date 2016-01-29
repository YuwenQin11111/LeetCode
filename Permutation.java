public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
    if(num == null) return null;
    Integer[] n = new Integer[num.length];
    for(int i = 0; i < num.length; i++) n[i] = num[i];
    return perm(n, 0, num.length - 1);
}
public ArrayList<ArrayList<Integer>> perm(Integer[] num, int start, int end){
    ArrayList<ArrayList<Integer>> rl = new ArrayList<ArrayList<Integer>>();
    if(start > end) rl.add(new ArrayList<Integer>(Arrays.asList(num)));
    else for(int i = start; i <= end; i++){
        swap(num, start, i);
        rl.addAll(perm(num, start + 1, end));
        swap(num, start, i);
    }
    return rl;
}
public void swap(Integer[] num, int i, int j){
    int tmp = num[i];
    num[i] = num[j];
    num[j] = tmp;
}
}
