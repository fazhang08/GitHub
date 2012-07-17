package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

public class BeanListExample
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		getAllEMPS();

	}
	
	
	public static void getAllEMPS()
	{
		Connection conn = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		
		String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
		
		String user = "scott";
		
		String password = "tiger";
		
		
		try
		{
			DbUtils.loadDriver(jdbcDriver);
			
			conn = DriverManager.getConnection(url, user, password);
			
			QueryRunner qr = new QueryRunner();
			
			List results = (List) qr.query(conn, "select e.empno,e.ename,e.job,e.sal,e.comm, e.hiredate,e.deptno,e.mgr from emp e",
					new BeanListHandler(EMP.class));
			
			int listSize = results.size();
			
			System.out.println("empno,ename,job,sal,com,hiredate,deptno,mgr");
			 
			for (int i = 0; i < listSize; i++) 
			{
				
			 EMP emp = (EMP) results.get(i);
			 
			 System.out.println("" + emp.getEmpno() + "," + emp.getEname() + "," + emp.getJob() + "," + emp.getSal() 
					           + "," + emp.getComm() + "," + emp.getHiredate() + "," + emp.getDeptno() + "," + emp.getMgr());
			 
			 System.out.println("Comm is " + (emp.getComm()==null) );
			 
			// System.out.println("Comm is " + emp.getComm().length() );
			
			}
			
			
			
			
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}finally
		{
			try
			{
				DbUtils.close(conn);
				
			} catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
