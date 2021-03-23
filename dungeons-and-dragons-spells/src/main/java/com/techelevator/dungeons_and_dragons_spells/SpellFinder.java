package com.techelevator.dungeons_and_dragons_spells;

import java.io.IOException;
import java.net.http.HttpHeaders;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import org.springframework.web.client.RestTemplate;


public class SpellFinder {
	
	public static final String BASE_URL = "https://www.dnd5eapi.co/api/spells/";
	public RestTemplate restTemplate = new RestTemplate();
	private final Spells spells = new Spells();
	
	
	//Spell Details
	public List<Spells> listDetailsForSpell(String name) {
		Spells spells = restTemplate.getForObject(BASE_URL + name, Spells.class);
		List<Spells> spellDetails = new ArrayList<Spells>();
		spellDetails.add(0, spells);
		return spellDetails;
	}
	

}
