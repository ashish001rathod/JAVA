package utils;
import java.io.Serializable;
public class Customer implements Serializable{ //
	private int custid;
	private String custname;
	private double comm;
	public Customer() {
		super();
	}
	public Customer(int custid, String custname, double comm) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.comm = comm;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	

}
