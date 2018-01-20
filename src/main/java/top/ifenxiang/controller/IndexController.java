package top.ifenxiang.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import top.ifenxiang.pojo.Banner;

@Controller
@RequestMapping("/index")
public class IndexController {

	@RequestMapping("/getBanner")
	@ResponseBody
	public List<Banner> getBanner() {
		List<Banner> list = new ArrayList<Banner>();
		Banner banner = new Banner();
		banner.setCreatedTime(new Date());
		banner.setId(1l);
		banner.setName("banner");
		banner.setSort(1);
		banner.setUrl("www.baidu.com");
		list.add(banner);
		return list;
	}
	
}
