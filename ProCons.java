/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.*;
import java.util.*;
/**
 *
 * @author HP
 * 
 * 
 */

            // OPERATING SYSTEM PROJECT 
            // BOUNDED PRODUCER CONSUMER PROBLEM USING MONITOR
            // My producer/consumer problem intend the producer to produce date for the consumer who want it
public class ProCons {
    public static void main (String[] args){
        Producer producer = new Producer();
        producer.setName("Producer");
        producer.start();
        
        Consumer consumer = new Consumer(producer);
        consumer.setName("Consumer");
        consumer.start();
            
        
    }
}