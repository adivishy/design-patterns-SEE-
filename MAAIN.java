import java.util.Scanner;
import java.util.*;


public class MAAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		String name;
		int priority;
		int wish=0,res,p=0,w;
		admin a;
		base b;
		dbproxy dbp;
		netproxy np;
		appproxy app;
		/*fresher f1= new fresher("f1",1);
		fresher f2= new fresher("f2",1);
		senoir s1=new senoir("s1",2);
		senoir s2=new senoir("s2",2);
		manager m1=new manager("m1",3);
		manager m2=new manager("m2",3);
		*/
		ArrayList<user> n=new ArrayList<user>();
		n.add(new manager("n",3));
		n.add(new manager("n1",3));
		n.add(new senoir("n2",2));
		n.add(new senoir("n3",2));
		n.add(new fresher("n4",1));
		n.add(new fresher("n5",1));
		
		System.out.println("priority goes like this");
		System.out.println("1.fresher  2.senior  3.manager");
		do{
		System.out.println("act as 1)admin 2)user");
		int key=sn.nextInt();
		if(key==2){
			System.out.println("enter name");
			name=sn.next();
			for (user element : n) {
			    if(element.name.equals(name)){
			    	p=element.getp();
			    	}
			System.out.println("1.access resourses");
			System.out.println("2.get access");
			System.out.println("3.logout");
			w=sn.nextInt();
			switch(w)
			{
			case 1:
			{ 
			System.out.println("1.database");
			System.out.println("2.network");
			System.out.println("3.applications");
			System.out.println("enter your option");
			res=sn.nextInt();
			 
			switch(res){
			case 1:dbp=new dbproxy(p);dbp.check();
			break;
			case 2:np=new netproxy(p);np.check();
			break;
			case 3: app=new appproxy(p);app.check();
			break;
			}
			}
			break;
			case 2:
				break;
			case 3: wish = 2;break;	
			}
			if( wish != 1)
				break;
			
			
			}
	
		
		
		}
		else
			a=new admin();
		
		System.out.println("do you want to continue 1.yes 2.no");
		wish=sn.nextInt();
		}while(wish==1);
		
		
		sn.close();
	}

}
