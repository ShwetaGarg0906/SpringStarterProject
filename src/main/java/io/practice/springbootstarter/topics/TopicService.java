package io.practice.springbootstarter.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("spring","spring framework","Spring Framework description"),
			new Topic("java","java core","java core description"),
			new Topic("spring","spring framework","Spring Framework description")
			));
	
	public List<Topic> getTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		System.out.print("Topic to be added .." + topic.toString());
		topics.add(topic);
	}
}
