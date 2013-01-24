/**
 * 
 */
package com.sodcube.domain.repository;

import java.util.Map;

import com.sodcube.domain.core.ValueObject;

/**
 * @author Marie
 *
 */
public abstract class AbstractRepository<T extends AggregateRepository,S extends AggregateRepository & AggregatePolicyStorage> {
	private S policyStorage;
	private Map<ValueObject, T> globalEntities;
}
