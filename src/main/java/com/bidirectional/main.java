package com.bidirectional;

public class main extends Scan_Class {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dto_Persion_Details ref=new dto_Persion_Details();
		System.out.println("1.insert the data  2.for delete the data 3. for update the data 4.read the user details  \t except 1,2,3,4 no curd operation is perform ");
		int key=sc.nextInt();
		switch (key) {
		case 1:
			insert i1=new insert();
			i1.insert1(ref);
			main(new String[0]);
			break;
		case 2:
			delete d1=new delete();
			d1.delete1(ref);
			break;
		case 3:
			Update u1=new Update();
			u1.update(ref);
			
		case 4:
			Read r1=new Read();
			r1.read(ref);
			main.main(new String[0]);

		default:
			System.out.println("no operation perform");
			break;
		}
		
		
		
		}

	}


