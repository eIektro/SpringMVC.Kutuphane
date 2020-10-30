package tr.com.metinemrekoral.mini_kutuphane_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.com.metinemrekoral.mini_kutuphane_app.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
    
    
}
