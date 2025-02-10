package springbootquickstart.course;

import org.springframework.data.repository.CrudRepository;
import springbootquickstart.topic.Topic;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByTopicId (String topicId);


    void deleteCourse(String id);

    Course findOne(String id);
}
