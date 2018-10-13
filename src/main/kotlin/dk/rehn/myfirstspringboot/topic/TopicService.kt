package dk.rehn.myfirstspringboot.topic

import org.apache.commons.logging.LogFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import kotlin.streams.toList

@Service
class TopicService {
    val log = LogFactory.getLog("TopicService")

    @Autowired
    lateinit var topicRepository: TopicRepository

    var topics = listOf<Topic>(
        Topic("java", "Core Java", "Core Java Description"),
        Topic("spring", "Core Spring", "Core Spring Description"),
        Topic("javaee", "Core Java Enterprise", "Core Java Enterprise Description")
    )


    fun getAllTopics(): List<Topic> = topicRepository.findAll().toList()

    fun getTopic(id: String) = topicRepository.findById(id)
    fun addTopic(topic: Topic)  {
        topics = topics.plus(topic)
        log.info("Added: {$topic}")
    }

    fun updateTopic(topic: Topic) {
        topics = topics.stream().filter { t -> t.id != topic.id }.toList().plus(topic)
    }

    fun deleteTopic(id: String) {
        topics = topics.stream().filter { t -> t.id != id }.toList()
    }
}