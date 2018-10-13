package dk.rehn.myfirstspringboot.topic

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
class TopicController {

    @Autowired
    lateinit var topicService: TopicService


    @RequestMapping("/topics")
    fun getAllTopics() = topicService.getAllTopics()


    @RequestMapping("/topics/{id}")
    fun getTopic(@PathVariable id: String) = topicService.getTopic(id)

    @RequestMapping("/topics", method = [RequestMethod.POST])
    fun addTopic(@RequestBody topic: Topic) {
        topicService.addTopic(topic)
    }

    @RequestMapping("/topics", method = [RequestMethod.PUT])
    fun updateTopic(@RequestBody topic: Topic) {
        topicService.updateTopic(topic)
    }

    @RequestMapping("/topics/{id}", method = [RequestMethod.DELETE])
    fun deleteTopic(@PathVariable id: String) {
        topicService.deleteTopic(id)
    }

}