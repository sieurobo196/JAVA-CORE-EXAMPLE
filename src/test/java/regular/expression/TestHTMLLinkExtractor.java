package regular.expression;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.codewr.javacore.regular.expression.*;

import java.util.Vector;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 * HTML link extrator Testing
 * 
 * @author codewr
 * 
 */
public class TestHTMLLinkExtractor {

	private HTMLLinkExtractor htmlLinkExtractor;
	String TEST_LINK = "http://www.google.com";
	
	@BeforeClass
	public void initData() {
		htmlLinkExtractor = new HTMLLinkExtractor();
	}

	@DataProvider
	public Object[][] HTMLContentProvider() {
	  return new Object[][] {
	    new Object[] { "abc hahaha <a href='" + TEST_LINK + "'>google</a>" },
	    new Object[] { "abc hahaha <a HREF='" + TEST_LINK + "'>google</a>" },
				
	    new Object[] { "abc hahaha <A HREF='" + TEST_LINK + "'>google</A> , "
		+ "abc hahaha <A HREF='" + TEST_LINK + "' target='_blank'>google</A>" },
						
	    new Object[] { "abc hahaha <A HREF='" + TEST_LINK + "' target='_blank'>google</A>" },
	    new Object[] { "<A target='_blank' HREF='" + TEST_LINK + "'>google</A>" },
	    new Object[] { "<A target='_blank' HREF=\"" + TEST_LINK + "\">google</A>" },
	    new Object[] { "<a HREF=" + TEST_LINK + ">google</a>" }, };
	}

	@Test(dataProvider = "HTMLContentProvider")
	public void ValidHTMLLinkTest(String html) {

		Vector<HtmlLink> links = htmlLinkExtractor.grabHTMLLinks(html);

		//there must have something
		Assert.assertTrue(links.size() != 0);

		for (int i = 0; i < links.size(); i++) {
			HtmlLink htmlLinks = links.get(i);
			System.out.println(htmlLinks);
			Assert.assertEquals(htmlLinks.getLink(), TEST_LINK);
		}

	}
}