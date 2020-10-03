package com.hasee.soap.model;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "starHeader", "starData", "respcd", "rcdcnt" })
@XmlRootElement(name = "starsResponse")
public class StarsResponse implements Serializable
{
	public StarsResponse()
	{
	}

	@XmlElement(required = true)
	private StarHeader starHeader;
	@XmlElement(required = true)
	private StarData starData;
	@XmlElement(required = true)
	private String respcd;
	@XmlElement(required = true)
	private String rcdcnt;

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

	public String getRespcd()
	{
		return respcd;
	}

	public void setRespcd( String respcd )
	{
		this.respcd = respcd;
	}

	public String getRcdcnt()
	{
		return rcdcnt;
	}

	public void setRcdcnt( String rcdcnt )
	{
		this.rcdcnt = rcdcnt;
	}
}
