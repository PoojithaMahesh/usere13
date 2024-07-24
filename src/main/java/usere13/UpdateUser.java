package usere13;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateUser {
public static void main(String[] args) {
	
	
//	Scanner scanner=new Scanner(System.in);
//	System.out.println("Please give id to be updated");
//	int id=scanner.nextInt();
	
	User user=new User();
	user.setName("lakshmimuthu");
	user.setAddress("Bang");
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	User dbUser=entityManager.find(User.class, 1000);
	if(dbUser!=null) {
//		id is present i can update the data
//		merge== deifinitely it will update the data
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		
//		user= name address
//		user =id =0
//		user= 0,lakshmi,bang
		user.setId(1000);
//		user=1,lakshmi.,bang
		entityManager.merge(user);
		entityTransaction.commit();
	}else {
//		dbUser=null 
//		id is not present
//		if im going to call merge method it will insert the data
//		im not going to call merge method here
		System.out.println("Sorry id is not present to update the data");
	}
	
}
}
