package prm;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutur {

	public static void saveEmoloyee(Student stu) throws InterruptedException, ExecutionException {
          ExecutorService executor = Executors.newCachedThreadPool();
      
  		
          
          CompletableFuture<Void> runAsyncro=CompletableFuture.runAsync(
        ()-> {
	
	    try {
		Thread.sleep(1000);
	//	int e = 10/0;
		System.out.print(stu);
		System.out.println("inside method ");
		System.out.println("Thread inside:" +Thread.currentThread().getName());
		
	    } catch (Exception e) {
		System.out.print("Error");
		e.printStackTrace();
	    }
		
	
       },executor);
       //   runAsyncro.toCompletableFuture();
        //  runAsyncro.get();
	    }
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
	System.out.println("Mthod Start its exceution");
	
	CompletableFutur s = new CompletableFutur();
	Student ss= s.getStudent();
	ss.setName("AAA");
	saveEmoloyee(ss);
	 System.out.println("Mthod end its exceution");
	 System.out.println("Thread out side:" +Thread.currentThread().getName());
	}
   
	public Student getStudent() {
		Student stu=new Student("Pranav", "maths",34.0);
		return stu;
	}
}
