package io.swagger.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import io.swagger.model.Diamond;

@Service
public class DiamondServiceImpl implements DiamondService {

	@Override
	public List<Diamond> getInventory() {
		
		List<Diamond> list = new ArrayList<>();
		
		Diamond d1 = new Diamond();
		d1.setId(1L);
		d1.setType("Narse");
		d1.setCarat(100L);
		d1.setPrize(500L);
		d1.setUserId(1L);
		
		Diamond d2 = new Diamond();
		d2.setId(2L);
		d2.setType("Jirum");
		d2.setCarat(100L);
		d2.setPrize(500L);
		d2.setUserId(2L);
		
		Diamond d3 = new Diamond();
		d3.setId(3L);
		d3.setType("Table");
		d3.setCarat(100L);
		d3.setPrize(500L);
		d3.setUserId(3L);

		list.add(d1);
		list.add(d2);
		list.add(d3);
		
		return list;
	}

	
	
}
