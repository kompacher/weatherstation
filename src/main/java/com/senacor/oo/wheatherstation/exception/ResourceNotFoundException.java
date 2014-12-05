package com.senacor.oo.wheatherstation.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Georg Kompacher, Senacor Technologies AG
 */
@ResponseStatus(value = org.springframework.http.HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
}
