package com.prueba.backendShoeStore.Service.BaseService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.backendShoeStore.IRepository.BaseRepository.IBaseRepository;
import com.prueba.backendShoeStore.IService.IBaseService.IBaseService;
import com.prueba.backendShoeStore.Util.GlobalConstants;

@Service
public class BaseService<T> implements IBaseService<T> {

	@Autowired
	private IBaseRepository<T, String> repositoryT;

	@Override
	public List<T> all() throws Exception {
		return repositoryT.findAll();	}

	@Override
	public List<T> findByStatusFalse() throws Exception {
		return repositoryT.finfindByStatusFalse();
	}

	@Override
	public Optional<T> findById(String id) throws Exception {
		return repositoryT.findById(id);
	}

	@Override
	public T save(T instanceEntity) throws Exception {
		return repositoryT.save(instanceEntity);
	}

	@Override
	public void update(String id, T instanceEntity) throws Exception {
		Optional<T> optionalT = this.repositoryT.findById(id);

		if (optionalT.isEmpty()) {
			throw new Exception("No se encontró registro");
		}
		T TobjetoToUpdate = optionalT.get();
		BeanUtils.copyProperties(instanceEntity, TobjetoToUpdate,
				GlobalConstants.EXCLUDED_FIELDS.toArray(new String[0]));

		this.repositoryT.save(TobjetoToUpdate);
		
	}

	@Override
	public void delete(String id) throws Exception {
		repositoryT.deleteById(id);
		
	}
	
	
}
