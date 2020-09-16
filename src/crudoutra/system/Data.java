/*
 *   
 *   Author : Deepak Malik
 *   https://github.com/devmalik19/crudoutra-java
 *
 */

package crudoutra.system;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;

import crudoutra.exceptions.*;

public class Data 
{
    public ArrayList<HashMap<String,String>> rows   =   new ArrayList<HashMap<String,String>>();
    public HashMap<String,String> row       =   new HashMap<String,String>();
    public ArrayList<String> columns        =   new ArrayList<String>();
    public int rowCount;
    public int colsCount;
    private ResultSetMetaData rsmd;

    public Data(ResultSet resultSet) throws DatabaseException 
    {
        try 
        {
            rsmd        =   resultSet.getMetaData();
            colsCount   =   rsmd.getColumnCount();
            
            for (int i = 1; i <= colsCount; i++) 
            {
                columns.add(rsmd.getColumnName(i));
            }

            while (resultSet.next()) 
            {
                row       =   new HashMap<String,String>();
                for (String colName : columns) 
                {
                    row.put(colName,resultSet.getString(colName));
                }
                rows.add(row);
                rowCount++;
            }
        } 
        catch (Exception e) 
        {
            throw new DatabaseException();
        }
    }
}