package com.control.statements;

public class SwitchStatement
{
		public static void main(String args[])
		{
				int i=0;

				char ch=' ';
				
				System.out.println("Enter an alphabet : ");

				try
				{
						ch = (char) System.in.read();
				}
				catch(Exception e)
				{}

				switch(ch)
				{
					case 'a'	: 	i = 10;
										break;
					case 'b'	: 	i = 20;
										break;
					case 'c'	: 	i = 30;
										break;
					default	: 	i = 40;
										break;
				}

				System.out.println("i Value is ...	:	" + i);
		}
}