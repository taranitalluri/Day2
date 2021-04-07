package DAY2;

import java.util.Scanner;
public class Array {
	  int arr[] = new int[3000];
	  int index = 0;
	public static void main(String[] args) {
		Array obj = new Array();
		Scanner sc = new Scanner(System.in); // scanf() or cin>>
		while(true){
			System.out.println("\n\n");
			System.out.println("============== Array Operation MENU ===============");
			System.out.println("1. Insert Data");
			System.out.println("2. Search Data");
			System.out.println("3. Print All Information.");
			System.out.println("4. Get Data By Index.");  // task 3  - 1min
			System.out.println("5. Delete Data");   ///    task1
			System.out.println("6. Print All Even Data"); // task 2  - 5min
			System.out.println("0. EXIT. ");
			
			System.out.println(" Enter option :- ");
			int option = sc.nextInt();
			
			switch(option)
			{
			
			case 1: 
					System.out.println(" Enter the data to be inserted :- ");
					obj.insertData(sc.nextInt());
					break;
					
			case 2:
				System.out.println(" Enter the data to be Searched :- ");
				int searchData = sc.nextInt();
				int pos = obj.searchData(searchData);
				if(pos!=-1)
				{
					System.out.println(searchData+" is at position "+(pos+1));
				}
				else
				{
					System.out.println(searchData+" Not available in the list. ");
				}
				
				break;
				   
			case 3: 
				
				obj.doPrintArray(obj.arr);
				break;
			case 4:
				System.out.println("enter index to get data :- ");
				int n=sc.nextInt();
				int d=obj.getDataByIndex(n-1);
				if(d!=-1) {
					System.out.println("data at index "+n+" is "+d);
				}else {
					System.out.println(n+" is not available in list");
				}
				break;
				
			case 5:
				System.out.println("enter element to be deleted :- ");
				int data=sc.nextInt();
				boolean x=obj.delete(data);
				if(x) {
					System.out.println(data+" deleted successfully");
				}else {
					System.out.println(data+" not available in the list");
				}
				break;
			case 6 :
				int even[] = obj.getAllEvenNumbers();
				for(int i=0;i<even.length;i++) {
					System.out.print(even[i]+" ");
				}
				break;
				
			case 0: System.exit(0);
			
			}//end switch
			
			
		}//end while
		
	}//end of main
	
	//----- method for create---
	public   void insertData(int data)
	{
		arr[index++] = data;
	}
	
	
	// ----- method to view all data --
	
	public   void doPrintArray(int arr[])
	{
		System.out.println(" ---------- Array Information ---------");
		for(int i = 0;i<index;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
	
	
	// method for search the data and return index position---
	public   int searchData(int searchData)
	{
		for(int i = 0;i<index;i++)
		{
			// --- compare my searchData with data arr[index]
			if(arr[i] == searchData)
			{
				return i;
			}
		}
		// if we dont get data
		return -1;
	}
	
	
	// ---- method for get data from index and return data----
	public int getDataByIndex(int n)
	{
		int data = 0;
		for(int i=0;i<index;i++) {
			if(i==n) {
				data=arr[i];
				return data;
			}
		}
		return -1;
	}
	
	// --- method for update Data and return status as boolean ---
	public   boolean updateData(int newData,int index)
	{
		boolean isUpdated = false;
		
		arr[index] = newData;
		isUpdated = true;
		
		return isUpdated;
	}
	
	// ----- method to delete data from array and return status as boolean---
	
	public boolean delete(int data)
	{
		boolean isUpdated=false;
		int count=0;
		for(int i=0; i<index; i++)
	       {
	           if(arr[i] == data)
	           {
	               for(int j=i; j<(index-1); j++)
	               {
	                   arr[j] = arr[j+1];
	               }
	               count++;
	               break;
	           }
	       }
	       if(count==0)
	       {
	           isUpdated=false;
	       }
	       else
	       {
	    	   isUpdated = true;
	    	   index=index-1;
	       }
		// search the data 
		
		// get position of data 
		
		
		// remove data from that position 
		
		
		return isUpdated;
	}
	
	// method to find even numbers from arr and insert into temp arr and return temp array
	
	public int[] getAllEvenNumbers()
	{
		int evenSize = 0;
        for (int i = 0; i < index; i++) {
            if (arr[i] % 2 == 0)
                evenSize++;
        }
        // odd and even arrays with size
        int[] even = new int[evenSize];
        // odd and even array iterator
        int j = 0;
        for (int i = 0; i < index; i++) {
            if (arr[i] % 2 == 0)
                even[j++] = arr[i];
		// NOTE:- no print statement inside this block
		
	}
        return even;
	

}
}