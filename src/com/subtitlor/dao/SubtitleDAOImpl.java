package com.subtitlor.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Properties;

public class SubtitleDAOImpl implements SubtitleDAO {

	private Properties configDB;

	private Connection connexion;

	public SubtitleDAOImpl() {

		initConfigDb();
		
		loadDatabase();

	}

	private void initConfigDb() {
		try {
			// chargement des données de configuration de la db depuis un
			// fichier properties.
			InputStream output = new FileInputStream("configDB.properties");

			configDB = new Properties();

			configDB.load(output);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void loadDatabase() {
		// Chargement du driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {

		}

		try {
			connexion = DriverManager.getConnection(
					"jdbc:mysql://" + configDB.getProperty("adresse"),
					configDB.getProperty("login"),
					configDB.getProperty("password"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean registerSubtitle() {

		return false;
	}

	@Override
	public Collection<String> findSubtitle() {
		
		return null;
	}

	@Override
	public boolean deleteSubtitle() {
		return false;
	}
	
	

}
