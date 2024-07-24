package usere13;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindUser {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
//	whenever ypu are going to perform the crud operation from java to database on that time 
//	you need to inform Hibernate
//	operation from database to jav
//	while finding transaction is not neccessary
	User dbUser=entityManager.find(User.class, 1);
//	dbUser=null when that id is not present
//	
	if(dbUser!=null) {
		System.out.println(dbUser);
	}else {
//		when that id is not present
		System.out.println("Sorry Id is not present");
	}
}
}
