package wcci.stonkifybackend.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Artist {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String imgUrl;

	@OneToMany(mappedBy = "artist")
	@JsonBackReference
	private Set<Album> albums = new HashSet<Album>();

	protected Artist()
		{
		}

	public Artist(String name, String imgUrl)
		{
		this.name = name;
		this.imgUrl = imgUrl;
		}

	public Artist(String name)
		{
		this.name = name;
		this.imgUrl = "defaultImg.png";
		}

	public Set<Album> getAlbums()
		{
		return albums;
		}

	public String getName()
		{
		return name;
		}

	public Long getId()
		{
		return id;
		}

	public String getImgUrl()
		{
		return imgUrl;
		}

	public void addAlbum(Album albumToAdd)
		{
		this.albums.add(albumToAdd);
		System.out.println(albumToAdd.getArtist());
		}

	public String toString()
		{
		return name + " - " + imgUrl;
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
		Artist other = (Artist) obj;
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
