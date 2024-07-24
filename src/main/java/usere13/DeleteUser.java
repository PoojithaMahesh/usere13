package usere13;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteUser {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	User user=entityManager.find(User.class, 100);
	EntityTransaction entityTransaction=entityManager.getTransaction();
	if(user!=null) {
//		id is resent then i can delete the data
		entityTransaction.begin();
		entityManager.remove(user);
		entityTransaction.commit();
	}else{
//		id is not present
//		user=null
		System.out.println("Sorry id is not present");
	}
}
}
