package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{

	Course findAllById(String id);
	
	public List<Course> findByTopicId(String topicId);


	
}
