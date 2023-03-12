package std;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetCustomerInfo {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("deloitte_pu");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		
		/*Customer c = new Customer();
		c.setCid(202);
		c.setCname("vineeth");
		c.setDop(new Date());
		c.setPname("tab");
		
		tran.begin();
		manager.persist(c);
		tran.commit();
		manager.clear();
		*/
		
		//delete from the database.
		/*Customer c1 = manager.find(Customer.class, 202);
		tran.begin();
		manager.remove(c1);
		tran.commit();
		manager.close();
		*/
		
		//update the data in the database.
		/*Customer c2 = manager.find(Customer.class, 200);
		c2.setCname("Jithender");
		tran.begin();
		manager.persist(c2);
		tran.commit();
		manager.clear();
		*/
		
		//to display all the records form the table
		
				tran.begin();
				Query qry = manager.createQuery("from Customer");
				List<Customer> cust  =qry.getResultList();
				for(Customer s:cust)
						System.out.println(s.getCid()+" "+s.getCname()+" "+s.getPname()+" "+s.getDop());
				tran.commit();
				manager.close();
			
	   //to serach by id
				
				//to search by id
				/*Customer c = manager.find(Customer.class, 201);
				tran.begin();
				manager.persist(c);
				tran.commit();
				manager.close();
				*/
				
	}

}
