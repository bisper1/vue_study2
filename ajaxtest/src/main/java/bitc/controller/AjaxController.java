package bitc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(@RequestParam("test") String test) throws Exception {
		System.out.println(test);
		
		test += " ajax";
		
		return test;
	}
	
	@RequestMapping(value="/ajax/test", method=RequestMethod.GET)
	public String ajaxTest() throws Exception {
		return "/ajax/ajaxTest";
	}
	
	@CrossOrigin(origins="http://127.0.0.1:5500")
	@RequestMapping(value="/ajax/test", method=RequestMethod.POST)
	public Object ajaxTest2() throws Exception {
		Map<String, String> dataList = new HashMap<String, String>();
		dataList.put("key", "value1");
		dataList.put("key2", "value2");
		dataList.put("key3", "value3");
		
		return dataList;
	}
}
