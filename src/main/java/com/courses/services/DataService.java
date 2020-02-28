package com.courses.services;

import org.springframework.stereotype.Service;

@Service
public class DataService {
	public String[] getImages() {
		String []filenames= {
				"asian.gif","female1.png","female2.png", "female2.gif","female3.jpg","female5.jpg",
				"man1.jpg","man2.jpg","man3.jpg","man3.png","man4.jpg","man4.png","man5.jpg"
		};
		return filenames;
	}

}
