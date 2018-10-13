package dk.rehn.myfirstspringboot.topic

import org.springframework.data.repository.CrudRepository

interface TopicRepository : CrudRepository<Topic, String> {

}