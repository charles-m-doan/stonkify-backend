package wcci.stonkifybackend.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Album {

	@Id
	@GeneratedValue
	private Long id;

	private String title;
	private String imgUrl;

	@ManyToOne
	@JsonBackReference
	private Artist artist;

	@OneToMany(mappedBy = "album")
	@JsonBackReference
	private Set<Song> songs = new HashSet<Song>();

	protected Album()
		{
		}

	public Album(String title, String imgUrl, Artist artist)
		{
		this.title = title;
		this.imgUrl = imgUrl;
		this.artist = artist;
		}

	public Album(String title, Artist artist)
		{
		this.title = title;
		this.imgUrl = "defaultImg.png";
		this.artist = artist;
		}

	public void addSong(Song song)
		{
		this.songs.add(song);
		}

	public String toString()
		{
		return title + " - " + imgUrl;
		}

	public Artist getArtist()
		{
		return artist;
		}

	public Set<Song> getSongs()
		{
		return songs;
		}

	public String getTitle()
		{
		return title;
		}

	public Long getId()
		{
		return id;
		}

	public String getImgUrl()
		{
		return imgUrl;
		}

	public void setArtist(Artist artist)
		{
		this.artist = artist;
		}

	@Override
	public int hashCode()
		{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
		}

	@Override
	public boolean equals(Object obj)
		{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Album other = (Album) obj;
		if (id == null)
			{
			if (other.id != null)
				return false;
			}
		else if (!id.equals(other.id))
			return false;
		return true;
		}
}
