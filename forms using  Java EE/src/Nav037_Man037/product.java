package inventory;

public class product {
    public String code,name;
	public int qty;
	public double price;
	

	public product(){
		
		
	}
	
	public product(String code,String name, int qty,double price)
	{
		this.code=code;
		this.name=name;
		this.qty=qty;
		this.price=price;
	}

	public void data()
	{
		System.out.println(getCode()+", "+getName()+", "+getQty()+", "+getPrice( ));
		
	}
	
	public String getCode()
	{
		return code;
	}
	
	public void setCode(String code)
	{
		this.code=code;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public int getQty()
	{
		return qty;
	}
	
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	
	
	
	
	
	
}
