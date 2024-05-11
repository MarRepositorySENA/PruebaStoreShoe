package com.prueba.backendShoeStore.IRepository.BaseRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface IBaseRepository<T,ID> extends JpaRepository<T, String> {

	List<T> findByStatusFalse();
}
