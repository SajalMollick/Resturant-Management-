package Entity;
public class Table extends Equipment
{
	private String tableId;
	
	public Table()
	{
		System.out.println("Empty");
	}
	
	public Table(int quantity,String type,String tableId)
	{
		super(quantity,type);
		setTableId(tableId);
	}
	
	public void setTableId(String tableId)
	{
		this.tableId=tableId;
	}
	
	public String getTableId()
	{
		return tableId;
	}
	
	public void showATableDetails()
	{
		super.display();
		System.out.println("Table Id :"+tableId);
	}
	
	public String getATableDetailsAsString()
	{
		return super.getQuantityAsStirng()+"\n"+
		       "Table Id :"+tableId+"\n"+
			   ".....................";
			   
	}
	
	
}


