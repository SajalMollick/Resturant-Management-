package EntityList;
import Entity.Table;
import Interface.*;

public class TableList implements ITableListOperation
{
	Table tables[];
	
	//.......................................Empty Constractor............................
	
	public TableList()
	{
		tables=new Table[10];
	}
	// ...................................Peramitarize constractor..........................
	public TableList(int size)
	{
		tables=new Table[size];
	}
	
	//................................For Table insert..............................
	
	public void insertTable(Table table)
	{
		boolean flag=false;
		for(int i=0;i<tables.length;i++)
		{
			if(tables[i]==null)
			{
				tables[i]=table;
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("TABLE INSERTED.");
		}
		else
		{
			System.out.println("TABLE NOT INSERTED.");
		}
		
	}
	
	//.....................................For get table by id.....................
	
	public Table getTableByTableId(String tableId)
	{
		boolean flag=false;
		Table table=null;
		for(int i=0;i<tables.length;i++)
		{
			if(tables[i]!=null)
			{
				if(tables[i].getTableId().equals(tableId))
				{
					table=tables[i];
					flag=true;
					break;
				}
			}
		}
		if(flag)
		{
			System.out.println("TABLE FOUND WITH THIS TABLE ID.");
		}
		else{
			System.out.println("TABLE NOT FOUND WITH THIS TABLE ID");
		}
		return table;
		
	}
	
	//........................For Remove Table by id........................
	
	public void removeTableById(String tableId)
	{
		boolean flag=false;
		for(int i=0;i<tables.length;i++)
		{
			if(tables[i]!=null)
			{
				if(tables[i].getTableId().equals(tableId))
				{
					tables[i]=null;
					flag=true;
					break;
				}  
				
			}
		}
		if(flag)
		{
			System.out.println("TABLE REMOVED.");
		}
		else
		{
			System.out.println("TABLE NOT FOUND WITH THIS ID.");
		}
	}
	
	//.........................For Display all Table............................
	
	public void showAllTable()
	{
		for(int i=0;i<tables.length;i++)
		{
			if(tables[i]!=null)
			{
				tables[i].showATableDetails();
			}
		}
	}
	
	public String getAllTableAsString()
	{   
	    String allTable="";
		for(int i=0;i<tables.length;i++)
		{
			if(tables[i]!=null){
			allTable+=tables[i].getATableDetailsAsString();
			}
		}
		return allTable;
	}
	
	//.........................................For update Table................................
	
	public void updateTable(Table updatedTable)
	{
		boolean flag=false;
		for(int i=0;i<tables.length;i++)
		{
			if(tables[i]!=null && tables[i].getTableId().equals(updatedTable.getTableId()))
			{
				tables[i]=updatedTable;
				flag=true;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println("TABLE UPDATED");
		}
		else{
			System.out.println("TABLE NOT FOUND WITH THIS ID");
		}
	}
	
	
	
	
	
}