package com.InnerOuterClasses;
class ParentClass
{
	static class SonProperty
	{
		protected void money()
		{
			System.out.println("Inside inner class method....MONEY");
		}

		protected void bike()
		{
			System.out.println("Inside inner class method....BIKE");
		}

		protected void car()
		{
			System.out.println("Inside inner class method....CAR");
		}
	}

	static class DaughterProperty
	{
		protected void gold()
		{
			System.out.println("Inside inner class method....GOLD");
		}

		protected void mobilePhone()
		{
			System.out.println("Inside inner class method....MOBILE PHONE");
		}
	}
}

class Son extends ParentClass.SonProperty
{
		public void money()
		{
			System.out.println("Inside SON's class method....MONEY");
		}

		public void bike()
		{
			System.out.println("Inside SON's class method....BIKE");
		}

		public void car()
		{
			System.out.println("Inside SON's class method....CAR");
		}
}

class Daughter extends ParentClass.DaughterProperty
{
		public void gold()
		{
			System.out.println("Inside DAUGHTER's class method....GOLD");
		}

		public void mobilePhone()
		{
			System.out.println("Inside DAUGHTER's class method....MOBILE PHONE");
		}
}

class OuterM
{
	public static void main(String[] args) 
	{
		Son s = new Son();

		s.money();
		s.bike();
		s.car();

		Daughter d = new Daughter();
		d.gold();
		d.mobilePhone();
	}
}