package org.harrygovert.model.jumbo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.harrygovert.model.ApiError;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class JumboError extends ApiError {

    private int statusCode;
    private String error;
    private int code;
    private String message;
    private String url;
}