package com.hasee.soap.model;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"item"
})
@XmlRootElement(name = "starData")
public class StarData implements Serializable
{
	public StarData()
	{
	}
	@XmlElement(required = true)
	private String item;

	public StarData( String item )
	{
		this.item = item;
	}

	public String getItem()
	{
		return item;
	}

	public void setItem( String item )
	{
		this.item = item;
	}
}
