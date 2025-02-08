package Encapsulations;

class B {

	private int eid=101;
	private String ename="Harsh";
	private long mono=498904285;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public long getMono() {
		return mono;
	}

	public void setMono(long mono) {
		this.mono = mono;
	}

	@Override
	public String toString() {
		return "B [eid=" + eid + ", ename=" + ename + ", mono=" + mono + "]";
	}
	
	

}

public class ToStringEncapsulation {
	
	public static void main(String[] args) {
		
		B a1 = new B();
		System.out.println(a1.toString());
		
		
		a1.setEid(111);
		System.out.println(a1.getEid());
		
		a1.setEname("Madhur");
		System.out.println(a1.getEname());
			
		a1.setMono(45435345);
	    System.out.println(a1.getMono());
	}
	
}
