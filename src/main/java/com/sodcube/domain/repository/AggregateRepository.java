/**
 * 
 */
package com.sodcube.domain.repository;

import java.util.Map;

import com.sodcube.domain.core.Entity;
import com.sodcube.domain.core.ValueObject;

/**
 * @author Marie
 *
 */
public interface AggregateRepository {
	
	<T extends Entity> void store(T dob);
	<T extends ValueObject> void delete(T id);
	<T extends ValueObject> Entity findByID(T id);
	<T extends ValueObject> Map<T , Entity> findAll();

}
