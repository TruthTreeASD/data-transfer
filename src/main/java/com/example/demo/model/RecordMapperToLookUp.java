package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemProcessor;


public class RecordMapperToLookUp implements ItemProcessor<RecordMap,Object> {

	
	
	@Override
	public List<LookUpData> process(RecordMap item) throws Exception {
		List<LookUpData> ld = new ArrayList<>();
		for(Integer i: item.getData().keySet()) {
			LookUpData d = new LookUpData();
			d.setLocation_id(item.id);
			d.setAttribute_mapping_id(i);
			d.setYear(item.getYear());
			d.setValue(item.getData().get(i));
			ld.add(d);
		}
		
		
		return ld;
	}

	

}
