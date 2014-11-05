package com.subtitlor.model;

import com.subtitlor.dao.SubtitleDAO;
import com.subtitlor.dao.SubtitleDAOImpl;

public class FactoryDAO {
	
	
	
	public static SubtitleDAO getSubtitleDAO()
	{
		return new SubtitleDAOImpl();
	}
	
}
