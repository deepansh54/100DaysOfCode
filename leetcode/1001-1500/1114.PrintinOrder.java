class Foo {
    
    private final CountDownLatch countDownLatch = new CountDownLatch(1);
    private final CountDownLatch countDownLatch2 = new CountDownLatch(1);


    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        countDownLatch.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        countDownLatch.await();
        printSecond.run();
        countDownLatch2.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
        countDownLatch2.await();
        printThird.run();
    }
}
//https://leetcode.com/problems/print-in-order/