package hello;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;


@RestController
public class RestSampleController {

    @GetMapping("/hello")
    public String hello() {
        return "hello!!";
    }

    @GetMapping("/account")
    public Account account() {
        return new Account("hoge", 20);
    }

    @GetMapping("/xml")
    public Object xml() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Message trace = xmlMapper.readValue(new File("/Users/hijiri/Downloads/sample.xml"), Message.class);
        return trace;
    }

    @GetMapping("/xmlvalue")
    public Response xmlvalue() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Message trace = xmlMapper.readValue(new File("/Users/hijiri/Downloads/sample.xml"), Message.class);
        String otherHeader = trace.data.trade.otherHeader.split("\\t")[2];
        Response response = new Response();
        response.setValue(otherHeader);
        return response;
    }
}
