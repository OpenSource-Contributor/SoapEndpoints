package com.hasee.soap.model;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"starHeader",
		"starData"
})
@XmlRootElement(name = "starsRequest")
public class StarsRequest implements Serializable
{
	public StarsRequest()
	{
	}

	@XmlElement(required = true)
	private StarHeader starHeader;
	@XmlElement(required = true)
	private StarData starData;

	public StarHeader getStarHeader()
	{
		return starHeader;
	}

	public void setStarHeader( StarHeader starHeader )
	{
		this.starHeader = starHeader;
	}

	public StarData getStarData()
	{
		return starData;
	}

	public void setStarData( StarData starData )
	{
		this.starData = starData;
	}
}
