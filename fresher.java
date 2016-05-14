public class fresher extends user{
	public int priority;
	public String name;
	public fresher(String n,int p){
		
		priority=p;
		name=n;
	
	}
	public String getname(){
		return name;
	}
    public int getp(){
    	return priority;
    }
}
