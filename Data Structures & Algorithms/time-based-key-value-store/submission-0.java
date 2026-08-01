class TimeMap {

    class Pair {
        String value;
        int timestamp;

        public Pair(String val, int time) {
            this.value = val;
            this.timestamp = time;
        }
    }

    HashMap<String, ArrayList<Pair>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) {
            return "";
        }

        ArrayList<Pair> list = map.get(key);
        int left = 0;
        int right = list.size()-1;
        String ans = "";

        while(left <= right) {
            int mid = (left + right)/2;
            if(list.get(mid).timestamp <= timestamp) {
                ans = list.get(mid).value;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
