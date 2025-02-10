package springbootquickstart.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import springbootquickstart.topic.Topic;

@Entity
public class Course {

    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    private Topic topic;
    public Course(String id, String name, String description, String topiCId){
        this.id = id;
        this.name= name;
        this.description = description;
        this.topic = new Topic(topiCId, "", "");
    }

    public Course() {
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Topic setTopic(Topic topic){
        this.topic = topic;
        return topic;
    }

}
