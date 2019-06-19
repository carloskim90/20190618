package org.zerock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@ToString
@Log4j
@Service
@AllArgsConstructor//chef를 생성자로 받는 restaurant가 만들어짐
public class Restaurant {
	
	//@Setter(onMethod_ = @Autowired)//이게 더 활용 범위가 클것.. 버전 차이로 인한..
	private Chef chef;

	public void order() {
		log.info(chef.cook());
	}
//	@Autowired
//	public void setChef(Chef chef) {
//		this.chef = chef;
//	}
	
}
