package tn.esprit.spring.DAO.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.DAO.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public User findByUserName(String username);
}
