package com.dvd.vo;

public class DVDInfoVO
{
	private int num;
	private String title;
	private String director;
	private String actor;
	private String year;
	private String country;
	private String grade;
	private String story;
	private String genre;
	private String poster;

	
	
	
	public DVDInfoVO()
	{
		// TODO Auto-generated constructor stub
	}

	public DVDInfoVO(int num, String title, String director, String actor, String year, String country, String grade,
			String story, String genre, String poster)
	{
		super();
		this.num = num;
		this.title = title;
		this.director = director;
		this.actor = actor;
		this.year = year;
		this.country = country;
		this.grade = grade;
		this.story = story;
		this.genre = genre;
		this.poster = poster;
	}

	@Override
	public String toString()
	{
		return "DVDInfoVO [num=" + num + ", title=" + title + ", director=" + director + ", actor=" + actor + ", year="
				+ year + ", country=" + country + ", grade=" + grade + ", story=" + story + ", genre=" + genre
				+ ", poster=" + poster + "]";
	}

	public int getNum()
	{
		return num;
	}

	public void setNum(int num)
	{
		this.num = num;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getDirector()
	{
		return director;
	}

	public void setDirector(String director)
	{
		this.director = director;
	}

	public String getActor()
	{
		return actor;
	}

	public void setActor(String actor)
	{
		this.actor = actor;
	}

	public String getYear()
	{
		return year;
	}

	public void setYear(String year)
	{
		this.year = year;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public String getGrade()
	{
		return grade;
	}

	public void setGrade(String grade)
	{
		this.grade = grade;
	}

	public String getStory()
	{
		return story;
	}

	public void setStory(String story)
	{
		this.story = story;
	}

	public String getGenre()
	{
		return genre;
	}

	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	public String getPoster()
	{
		return poster;
	}

	public void setPoster(String poster)
	{
		this.poster = poster;
	}

}
