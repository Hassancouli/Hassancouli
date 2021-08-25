/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Hassan Coulibaly Fougnigué Souleymane
 */
public class Consumer extends Thread {
    private Producer producer;
    
    public Consumer(Producer producer){
        this.producer = producer;
    }
    @Override
    public void run(){
        try{
            while(true){
                String data = producer.consume();
                System.out.println( Thread.currentThread().getName()+ " got the date which is: " + data);
                Thread.sleep(800);
            }
        }catch (Exception exp){
            
        }
        
    }
    
}
