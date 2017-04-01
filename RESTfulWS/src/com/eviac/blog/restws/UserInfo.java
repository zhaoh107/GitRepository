package com.eviac.blog.restws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 
 * @author pavithra
 * 
 */

// ����@Path��������Ĳ��·����
// ָ������Դ���ṩ�����URI·����
@Path("UserInfoService")
public class UserInfo {

	// @GET��ʾ�����ᴦ��HTTP GET����
	@GET
	// ����@Path��������Ĳ��·����ָ������Դ���ṩ�����URI·����
	@Path("/name/{i}")
	// @Produces��������Դ�෽�������ɵ�ý�����͡�
	@Produces(MediaType.TEXT_XML)
	// @PathParam��@Path����ı��ʽע��URI����ֵ��
	public String userName(@PathParam("i") String i) {

		String name = i;
		return "<User>" + "<Name>" + name + "</Name>" + "</User>";
	}

	@GET
	@Path("/age/{j}")
	@Produces(MediaType.TEXT_XML)
	public String userAge(@PathParam("j") int j) {

		int age = j;
		return "<User>" + "<Age>" + age + "</Age>" + "</User>";
	}
}