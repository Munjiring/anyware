package com.aw.anyware.mail.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Mail {

	private int emNo;
	private String emTitle;
	private String emContent;
	private String memName;
	private String sender;
	private String receiver;
	private String refEmail;
	private String sendDate;
	private String tempStock;
	
}