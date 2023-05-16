/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package UserLogin.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import UserLogin.dto.ERole;
import UserLogin.dto.Role;

public interface RoleDAO extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
