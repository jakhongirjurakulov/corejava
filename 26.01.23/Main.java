import executors.CompletableFuturesDemo;

public class Main {
    public static void main(String[] args){
        CompletableFuturesDemo.show();

//        output:
//        Getting a quote from site1
//        Getting a quote from site2
//        Getting a quote from site3
//        Quote{site='site2', price=100}
//        Quote{site='site3', price=109}
//        Quote{site='site1', price=109}
//        Retrieved all quotes in 2986msec.
    }
}
