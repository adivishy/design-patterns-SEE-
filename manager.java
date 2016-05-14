
public class manager extends user {
	public int priority;
	public String name;

	public manager(String name,int p){
		this.name=name;
		priority=p;
	
	}
	 public int getp(){
	    	return priority;
	    }public String getname(){
			return name;
		}
}
