package std;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class StudentAppln { 
	public static void main(String args[]) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("deloitte_pu");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		
		//Inserting data into DB
		
		Student std = new Student();
		std.setRegno(110);
		std.setStdname("Santosh");
		std.setTotal(520);
		tran.begin();
		manager.persist(std);
		tran.commit();
		manager.close();
		
		
		//To update into DB
		
//		Student std = manager.find(Student.class, 102);
//		std.setStdname("Harshith");
//		std.setTotal(770);
//		tran.begin();
//		manager.persist(std);     //persist is used to update
//		tran.commit();
//		manager.close();
		
		
		//to delete the row form table 
		/*Student std = manager.find(Student.class, 110);
		tran.begin();
		manager.remove(std);
		tran.commit();
		manager.close();
		*/
		
		//to display all the records form the table
		
		/*tran.begin();
		Query qry = manager.createQuery("from Student");
		List<Student> stdlist  =qry.getResultList();
		for(Student s:stdlist)
				System.out.println(s.getRegno()+" "+s.getStdname()+" "+s.getTotal());
		tran.commit();
		manager.close();
		*/
		
		//to search by id
//		Student std = manager.find(Student.class, 102);
//		tran.begin();
//		manager.persist(std);
//		tran.commit();
//		manager.close();
		
	}

}
