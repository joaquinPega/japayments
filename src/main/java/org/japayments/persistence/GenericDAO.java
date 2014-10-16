package org.japayments.persistence;

import java.util.List;
/**
 * 
 * @author Joaquin Pega
 *
 * @param <T> Class of the DAO
 * @param <ID> type ID of the DAO
 */
public interface GenericDAO<T, ID> {
	
	public void delete(T t)throws DBFail;
	
	public void save(T t)throws DBFail;
	
	public void update(T t)throws DBFail;
	
	public List<T> getAll()throws DBFail;
	
	public T getByID(ID id)throws DBFail;
	
}
