package com.subtitlor.model;

import java.nio.file.Files;

import com.subtitlor.dao.SubtitleDAO;

public class Subtitle {
	
	private SubtitleDAO subtitleDAO;
	
	
	public Subtitle()
	{
		this.subtitleDAO = FactoryDAO.getSubtitleDAO();
	}
	
	
	public void AddSubtitle(String fileName)
	{
		
	}
	
	public void DeleteSubtitle()
	{
		
	}
	
	public void findSubtitle(String name)
	{
		
	}

	
	
}
