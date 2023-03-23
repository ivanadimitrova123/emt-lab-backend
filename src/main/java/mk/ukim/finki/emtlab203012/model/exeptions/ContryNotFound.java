package mk.ukim.finki.emtlab203012.model.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)

public class ContryNotFound extends RuntimeException{
    public ContryNotFound(Long id) {
        super(String.format("Country with id: %d is not found", id));
    }

}
