class UndergroundSystem {
    
    Map<String,StationStat> stations;
    Map<Integer,Customer> customers;

    public UndergroundSystem() {
        this.stations = new HashMap<>();
        this.customers = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        customers.put(id,new Customer(stationName,t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Customer c = customers.get(id);
        StationStat s = stations.getOrDefault(c.lastCheckin + "-"+ stationName, new StationStat());
        s.count++;
        s.sum += (t-c.time);
        s.avg = s.sum/s.count;
        stations.put(c.lastCheckin + "-"+ stationName, s);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        return (double) stations.get(startStation + "-" +endStation).avg;
    }
    class StationStat{
        Double avg = 0.0;
        Double sum = 0.0;
        int count = 0;
        public StationStat(){
            
        }
    }
    class Customer{
        String lastCheckin;
        int time;
        public Customer(String l, int t){
            this.lastCheckin = l;
            this.time= t;
        }
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
//https://leetcode.com/problems/design-underground-system/
