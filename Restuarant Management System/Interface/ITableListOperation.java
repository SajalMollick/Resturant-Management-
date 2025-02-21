package Interface;
import Entity.*;
import EntityList.*;

public interface ITableListOperation
{
	public void insertTable(Table table);
	public Table getTableByTableId(String tableId);
	public void removeTableById(String tableId);
	public String getAllTableAsString();
	public void updateTable(Table updatedTable);
}