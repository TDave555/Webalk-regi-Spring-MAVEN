package hu.me.iit.webalk.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;

@Controller
public class MainController {

	@RequestMapping(path="/")
	@ResponseBody
	ResponseDto gyoker() {
		ResponseDto responseDto = new ResponseDto();

		responseDto.setID(123);
		responseDto.setMessage("Hellooo");
		return responseDto;
	}
}
