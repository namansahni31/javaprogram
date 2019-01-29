class Visit 
{
	private String customer;
	private int date;
	private double ServiceExpenses;
	private double ProductExpenses;
	public Visit(String name, int date)
	{
     customer=name;
     this.date=date;
	;
	}
	public String getname()
	{
	return getname();
	}
	public double getServiceExpenses()
	{
	return ServiceExpenses;
	} 
	public void setServiceexpenses(double ServiceExpenses)
	{
		this.ServiceExpenses=ServiceExpenses;
	}
    public double getProductExpenses()
	{
	return ProductExpenses;
	}   	
	public void setProductExpenses(double ProductExpenses)
	{
		this.ProductExpenses=ProductExpenses;
	}
    
}