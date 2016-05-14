
public class dbproxy {
	int p;
	public dbproxy(int p){
		this.p=p;
	}
	
	void check(){
	if(p>2){
		database d1=new database();
		d1.disp();
		
	}
	else
		System.out.println("access denied");
	}

}
