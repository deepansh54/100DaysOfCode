class Solution {
    public int getNumberOfBacklogOrders(int[][] orders) {
        PriorityQueue<Order> sell = new PriorityQueue<Order>((p,q) -> p.price.compareTo(q.price));
        PriorityQueue<Order> buy = new PriorityQueue<Order>((p,q) -> q.price.compareTo(p.price));

        for(int[] order : orders){
            if(order[2] == 0){
                //buy
                Order smallestSell = sell.peek();
                while(smallestSell != null && smallestSell.price <= order[0] && order[1]>0){
                    if(smallestSell.amount > order[1]){
                        smallestSell.amount-=order[1];
                        order[1] = 0;
                        break;
                    }
                    else if(smallestSell.amount == order[1]){
                        sell.poll();
                        order[1] = 0;
                        break;
                    }
                    else{
                        order[1]-=smallestSell.amount;
                        sell.poll();
                        smallestSell = sell.peek();
                    }
                }
                if(order[1] > 0){
                    buy.add(new Order(order[0], order[1]));
                }
            }
            else{
                //sell
                Order largestBuy = buy.peek();
                while(largestBuy != null && largestBuy.price >= order[0] && order[1]>0){
                    if(largestBuy.amount > order[1]){
                        largestBuy.amount-=order[1];
                        order[1] = 0;
                        break;
                    }
                    else if(largestBuy.amount == order[1]){
                        buy.poll();
                        order[1] = 0;
                        break;
                    }
                    else{
                        order[1]-=largestBuy.amount;
                        buy.poll();
                        largestBuy = buy.peek();
                    }
                }
                if(order[1] > 0){
                    sell.add(new Order(order[0], order[1]));
                }
            }
        }
        
        int totalOrderAmount = 0;
        
        while(!buy.isEmpty()){
            totalOrderAmount = (totalOrderAmount + buy.poll().amount) % 1000000007;
        }
        while(!sell.isEmpty()){
            totalOrderAmount = (totalOrderAmount + sell.poll().amount) % 1000000007;
        }
        
        return totalOrderAmount;
    }
    public class Order{
        public Integer price;
        public Integer amount;
        
        public Order (int p, int a){
            this.price = p;
            this.amount = a;
        }
    }
}
//https://leetcode.com/problems/number-of-orders-in-the-backlog/
