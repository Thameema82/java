class hi extends thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hi");
			try{
				thread.Sleep(1000);
			}
			catch(Exception e){

			}
			}

		}
	}
	class hello extends thread
	{
		public void run()
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hello");
				try{
                     thread.Sleep(1000);
			}
			catch(Exception e){
				}
			}
		}
	}
	class thread{
		public static void main(String args[])
          {
          	hi ob1=new hi();
          	hello ob2=new hello();
          	ob1 . Start();
          	ob2 . Start();
          }
	}