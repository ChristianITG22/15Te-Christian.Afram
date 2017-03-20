
public class Main_BubbleSort {
	
	static int [] number = new int [1000];
	
	static void randomList() {
		
		for(int i=0 ; i<1000 ; i++)
			number[i] = (int)(Math.random()*1000);
		
	}
	
	public static void main (String[]args) {
		
		randomList();
		long startTime = System.currentTimeMillis();		
		bubbleSort();
		long finishTime = System.currentTimeMillis();
		System.out.println("Det tog " + (finishTime - startTime) + " ms att bubbelsortera!");
		
		randomList();
		startTime = System.currentTimeMillis();
		
		insertSort();
		finishTime = System.currentTimeMillis();
		System.out.println("Det tog " + (finishTime - startTime) + " ms att instickssortera");

	}

      static void insertSort() {
		
    	  try {
    		  Thread.sleep(1000);
    		  } catch (InterruptedException e) {
    		  e.printStackTrace();
    		  }
		
	}

	  static void bubbleSort() {
		
		  try {
			  Thread.sleep(1000);
			  } catch (InterruptedException e) {
			  e.printStackTrace();
			}
	  	}
	}
		

