/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class Producer extends Thread {
    private static final int MAX_SIZE = 5;
    private final List<String> messages = new ArrayList<>();
    
    @Override
    public void run(){
        try {
            while (true){
                produce();
            }
        } catch (Exception exp){
            
        }
    }
    
    private synchronized void produce() throws Exception{
 while (messages.size() == MAX_SIZE){
     System.out.println("The queue of date produced is full");
     wait();
}
 String data = LocalDateTime.now().toString();
 messages.add(data);
 System.out.println("producer finish to produce date for the consumer ");
 notify();
}
    public synchronized String consume() throws Exception{
        notify();
        while (messages.isEmpty()){
            wait();
        }
        String data = messages.get(0);
        messages.remove(data);
        return data;
    }
}
 
