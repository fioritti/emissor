package br.com.vr.emissor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.vr.emissor.domain.Emissor;

@RepositoryRestResource(path = "emissores")
public interface EmissorRepository extends JpaRepository<Emissor, String> {

}
