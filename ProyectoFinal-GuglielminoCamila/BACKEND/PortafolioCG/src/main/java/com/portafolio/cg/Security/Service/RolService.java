package com.portafolio.cg.Security.Service;

import com.portafolio.cg.Security.Entity.Rol;
import com.portafolio.cg.Security.Enums.RolNombre;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portafolio.cg.Security.Repository.iRolRepository;
import java.util.Optional;

@Service
@Transactional

public class RolService {
   @Autowired
   iRolRepository irolRepository;
   public Optional<Rol> getByRolNombre(RolNombre rolNombre){
       return irolRepository.findByRolNombre(rolNombre);
   }
   public void save(Rol rol){
      irolRepository.save(rol); 
   }
}
