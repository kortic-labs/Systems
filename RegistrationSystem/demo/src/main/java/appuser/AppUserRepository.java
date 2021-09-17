package appuser;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional(readOnly = true)
public interface AppUserRepository extends JpaRepository<AppUser, Long>{
	Optional<AppUser> findByEmail(String email);
}
