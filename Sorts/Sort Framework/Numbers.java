public class Numbers{
	
		private int[] list;
		
		public Numbers(int[] n)
        {	
			list = n;
		}
		public void print()
		{
			for(int x:list)
				System.out.print(x+" ");
			System.out.println();
		}
		public void sort()
		{
			bubble();
		}
		private void bubble()
		{
		  
		  for (int outer=0;outer<list.length-1;outer++)
		  {
			  for (int inner=0;inner<list.length-outer-1;inner++)
			  {
				  if (list[inner] > list[inner+1])
				  {
					  int temp = list[inner];
					  list[inner]=list[inner+1];
					  list[inner+1]=temp;
				  }
			  }
		  }
		}
		private void insertion()
		{
			// code for insertion sort	
		}
		private void selection()
		{
			// code for selection sort
		}
		private void nonRecurMerge()
		{
			// code for nonRecurMerge
		}
		
}