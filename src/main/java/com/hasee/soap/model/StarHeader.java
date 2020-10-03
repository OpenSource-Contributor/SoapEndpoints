package com.hasee.soap.model;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "username", "password", "sp_code", "ss_code", "trxid", "headerdtl" })
@XmlRootElement(name = "starHeader")
public class StarHeader implements Serializable
{
	public StarHeader()
	{
	}

	@XmlElement(required = true)
	private String username;
	@XmlElement(required = true)
	private String password;
	@XmlElement(required = true)
	private String sp_code;
	@XmlElement(required = true)
	private String ss_code;
	@XmlElement(required = true)
	private String trxid;
	@XmlElement(required = true)
	private String headerdtl;
}
