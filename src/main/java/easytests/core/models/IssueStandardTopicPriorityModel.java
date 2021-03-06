package easytests.core.models;

import easytests.core.entities.IssueStandardTopicPriorityEntity;
import easytests.core.models.empty.IssueStandardModelEmpty;
import easytests.core.models.empty.TopicModelEmpty;
import lombok.Data;

/**
 * @author SingularityA
 */
@Data
public class IssueStandardTopicPriorityModel implements IssueStandardTopicPriorityModelInterface {

    private Integer id;

    private TopicModelInterface topic;

    private Boolean isPreferable;

    private IssueStandardModelInterface issueStandard;

    public void map(IssueStandardTopicPriorityEntity topicPriorityEntity) {
        this.setId(topicPriorityEntity.getId());
        this.setTopic(new TopicModelEmpty(topicPriorityEntity.getTopicId()));
        this.setIsPreferable(topicPriorityEntity.getIsPreferable());
        this.setIssueStandard(new IssueStandardModelEmpty(topicPriorityEntity.getIssueStandardId()));
    }
}
