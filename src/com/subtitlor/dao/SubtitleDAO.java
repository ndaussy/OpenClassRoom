package com.subtitlor.dao;

import java.util.Collection;

public interface SubtitleDAO {
	
	public boolean registerSubtitle();
	
	public Collection<String> findSubtitle();
	
	public boolean deleteSubtitle();
	
}
