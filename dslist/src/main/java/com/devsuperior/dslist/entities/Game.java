package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //ela configura a classe java pra ser equivalente a tabela relacional
@Table(name = "tb_game") //mapeia a tabela no banco de dados 
public class Game {
	
	@Id // mapeia a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // configura pra ser auto incremento
	private Long id;
	private String title;
	@Column(name= "game_year")//muda o nome da variavel no banco de dados
	private Integer year;
	private String genre;
	private String platform;
	private String imgUrl;
	private String shortdescription;
	private String longDescription;
	
	
	public Game() {
		
	}


	public Game(Long id, String title, Integer year, String genre, String platform, String imgUrl,
			String shortdescription, String longDescription) {
		
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platform = platform;
		this.imgUrl = imgUrl;
		this.shortdescription = shortdescription;
		this.longDescription = longDescription;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Integer getYear() {
		return year;
	}


	public void setYear(Integer year) {
		this.year = year;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getPatform() {
		return platform;
	}


	public void setPatform(String platform) {
		this.platform = platform;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}


	public String getShortdescription() {
		return shortdescription;
	}


	public void setShortdescription(String shortdescription) {
		this.shortdescription = shortdescription;
	}


	public String getLongDescription() {
		return longDescription;
	}


	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}

	
	
}
