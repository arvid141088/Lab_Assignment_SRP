package ie.gmit.open;
/**
 * Arvids Ceceruks
 * Group A
 * Open-Closed principle Lab-assignment
 * 23/03/2019
 * ****Phone Subscriber****
 */
import java.util.List;

public  class PhoneSubscriber extends Subscriber {

    public PhoneSubscriber(){
        super();
    }


    public double calculateBill() {

        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*baseRate/100;
    }


}