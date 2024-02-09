package daos;

import java.util.List;

import model.subject;

public interface subjectDao {
	
public void create(subjectDao subject);
	
	public void update(subjectDao subject);
	
	public void delete(Integer id);
	
	public subjectDao find(Integer id);
	
	public List<subjectDao> findAll();

}
