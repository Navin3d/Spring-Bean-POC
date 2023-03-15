package gmc.learning.spring.analysingbean.services;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gmc.learning.spring.analysingbean.models.Data;

@Service
public class CRUDService {
	
	@Autowired
	private List<Data> getDataStore;
	
	public List<Data> getDatas() {
		return getDataStore;
	}
	
	public List<Data> addData(Data data) {
		getDataStore.add(data);
		return getDataStore;
	}
	
	public List<Data> updateData(Data data) {
		Collections.sort(getDataStore);
		getDataStore.remove((int)data.getOrder());
		getDataStore.add(data);
		return getDataStore;
	}
	
	public List<Data> deleteDataByOrder(Integer order) {
		Collections.sort(getDataStore);
		if(getDataStore != null) {
			getDataStore.remove((int)order);
			return getDataStore;
		}
		return null;
	}

}
