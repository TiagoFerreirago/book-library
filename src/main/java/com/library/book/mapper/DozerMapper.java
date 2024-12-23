package com.library.book.mapper;

import java.util.ArrayList;
import java.util.List;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public class DozerMapper {

	
	public static Mapper mapper = DozerBeanMapperBuilder.buildDefault();
	
	
	public static <O, D> D parseObject(O origin, Class<D>destination) {
		return mapper.map(origin, destination);
	}
	
	public static <O, D> List<D> parseListsObjects(List<O>listOrigin, Class<D>destination){
		
		List<D>listModifyObjects = new ArrayList<>();
		
		for (O o : listOrigin) {
			listModifyObjects.add(mapper.map(o, destination));
		}
		
		return listModifyObjects;
	}
}
