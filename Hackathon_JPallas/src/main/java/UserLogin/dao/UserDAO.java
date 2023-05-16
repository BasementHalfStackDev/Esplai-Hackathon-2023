/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package UserLogin.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import UserLogin.dto.User;

public interface UserDAO extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
}
