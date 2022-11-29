class RandomizedSet {
    static int[] arr;
    int top=-1;
    HashMap<Integer,Integer> map = new HashMap<>();
    public RandomizedSet() {
        if(arr==null) arr = new int[200001];
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val)){
            top++;
            arr[top]=val;
            map.put(val,top);
            return true;
        }else return false;
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)){
            int pos = map.get(val);
            map.put(arr[top],pos);
            arr[pos] = arr[pos] + arr[top] - (arr[top] = arr[pos]); // swapping
            top--;
            map.remove(val);
            return true;
        }else return false;
    }
    
    public int getRandom() {
        return arr[(int)(Math.random()*(top+1))];
    }
}