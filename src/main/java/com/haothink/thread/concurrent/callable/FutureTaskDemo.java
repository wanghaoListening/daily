package com.haothink.thread.concurrent.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;


public class FutureTaskDemo {
	 public static void main(String[] args) {

	        ExecutorService executor = Executors.newCachedThreadPool();
	        Task task = new Task();
	        FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
	        executor.submit(futureTask);
	        executor.shutdown();

	        /*Task task = new Task();
	        FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
	        Thread thread = new Thread(futureTask);
	        thread.start();*/
	         
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e1) {
	            e1.printStackTrace();
	        }
	         
	        System.out.println("");
	         
	        try {
	            System.out.println("task"+futureTask.get());
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } catch (ExecutionException e) {
	            e.printStackTrace();
	        }
	         
	        System.out.println("");
	    }
	}
	class Task implements Callable<Integer>{
	    @Override
	    public Integer call() throws Exception {
	        System.out.println("");
	        Thread.sleep(3000);
	        int sum = 0;
	        for(int i=0;i<100;i++)
	            sum += i;
	        return sum;
	    }
	}