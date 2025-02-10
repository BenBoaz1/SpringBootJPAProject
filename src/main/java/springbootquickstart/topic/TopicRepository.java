package springbootquickstart.topic;

import org.springframework.data.repository.CrudRepository;
import springbootquickstart.topic.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
