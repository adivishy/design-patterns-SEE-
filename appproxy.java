
public class appproxy {
	int p;
	public appproxy(int p){
		this.p=p;
	}
	
	void check(){
	if(p>=2){
		applications d1=new applications();d1.disp();
		
	}
	else
		System.out.println("access denied");
	}

}
