package hexlet.code.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.List;


@Getter
@Setter
public class TaskCreateDTO {

    private JsonNullable<Integer> index;
    @NotNull
    @Size(min = 1)
    private String title;
    private JsonNullable<String> content;
    @NotNull
    @JsonProperty("status")
    private String slug;
    @JsonProperty("assignee_id")
    private JsonNullable<Long> assigneeId;
    private JsonNullable<List<Long>> taskLabelIds;
}
