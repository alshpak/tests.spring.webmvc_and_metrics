package test.spring.webmvc.web;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class TestRestController {


    @JsonComponent
    public static class EmptyDTO {
        //public String empty;
    }

    public static class ResultTDO {
        public String field1;
        public String field2;
    }

    @GetMapping(value= "/check_rest")
    public ResultTDO checkRest() {

        ResultTDO r = new ResultTDO();
        r.field1 = "value1";
        r.field2 = "value2";

        return r;
    }

    @GetMapping(value = "/check_empty")
    public EmptyDTO checkEmpty() {
        return new EmptyDTO();
    }
}
