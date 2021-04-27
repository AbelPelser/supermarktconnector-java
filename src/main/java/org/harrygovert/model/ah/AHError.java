package org.harrygovert.model.ah;

import com.fasterxml.jackson.annotation.JsonAlias;
import java.time.ZonedDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.harrygovert.model.ApiError;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class AHError extends ApiError {

    private ZonedDateTime timestamp;
    private Integer status;
    private String error;
    @JsonAlias("error_description")
    private String errorDescription;
    private String message;
    private String path;
    private String correlationId;
}