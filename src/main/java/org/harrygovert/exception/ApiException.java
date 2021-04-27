package org.harrygovert.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.harrygovert.model.ApiError;

@Getter
@RequiredArgsConstructor
public class ApiException extends RuntimeException {

    private final ApiError error;

    @Override
    public String getMessage() {
        return error.toString();
    }
}
