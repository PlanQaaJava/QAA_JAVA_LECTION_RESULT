package dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse{

	private final Integer code;
	private final String type;
	private final String message;
}
