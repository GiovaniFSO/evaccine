package br.com.giovani.fullstackweek.repository;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.giovani.fullstackweek.domain.GruposPrioritarios;

@Entity
public interface GruposPrioritariosRepository extends JpaRepository<GruposPrioritarios, Long>{

}
