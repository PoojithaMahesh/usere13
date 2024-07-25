package usere13;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FIndByName {
public static void main(String[] args) {
	String name="lakshmi";
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	Query query=entityManager.createQuery("Select u from User u where u.name=?1");
	query.setParameter(1, name);
//	User user=(User) query.getSingleResult();
//	System.out.println(user);
	List<User> list=query.getResultList();
	System.out.println(list);
}
}
