package easytests.api.v1.models;

import lombok.Data;
import java.util.List;


/**
 * @author RisaMagpie
 */
@Data
public class Question {
    private Integer id;

    private String text;

    private Integer type;

    private Identity topic;

    private List<Identity> answers;
}
