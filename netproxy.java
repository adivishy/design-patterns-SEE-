
public class netproxy {
	int p;
	public netproxy(int p){
		this.p=p;
	}
	
	void check(){
	if(p>=1){
		network d1=new network();d1.disp();
	
	}
	else
		System.out.println("access denied");
	}
}
