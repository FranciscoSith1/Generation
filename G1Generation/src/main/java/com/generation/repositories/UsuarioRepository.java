package com.generation.repositories;

import com.generation.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long > { //JpaRepository<Objeto, Tipo_Dato_PK>
    /** las interfaces solo definen los metodos */
    /** Query y usar metodos que se conectan a la base de datos */

}
