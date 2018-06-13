package com.codewr.javacore.regular.expression;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author codewr
 */
public class HTMLLinkExtractor {

    private Pattern patternTag, patternLink;
    private Matcher matcherTag, matcherLink;

    private static final String HTML_A_TAG_PATTERN = "(?i)<a([^>]+)>(.+?)</a>";
    private static final String HTML_A_HREF_TAG_PATTERN
            = "\\s*(?i)href\\s*=\\s*(\"([^\"]*\")|'[^']*'|([^'\">\\s]+))";

    public HTMLLinkExtractor() {
        patternTag = Pattern.compile(HTML_A_TAG_PATTERN);
        patternLink = Pattern.compile(HTML_A_HREF_TAG_PATTERN);
    }

    /**
     * Validate html with regular expression
     *
     * @param html html content for validation
     * @return Vector links and link text
     */
    public Vector<HtmlLink> grabHTMLLinks(final String html) {

        Vector<HtmlLink> result = new Vector<HtmlLink>();

        matcherTag = patternTag.matcher(html);

        while (matcherTag.find()) {

            String href = matcherTag.group(1); // href
            String linkText = matcherTag.group(2); // link text

            matcherLink = patternLink.matcher(href);

            while (matcherLink.find()) {

                String link = matcherLink.group(1); // link
                HtmlLink obj = new HtmlLink();
                obj.setLink(link);
                obj.setLinkText(linkText);

                result.add(obj);

            }

        }

        return result;

    }

    public static void main(String[] args) {
        String html = "<a href='http://www.google.com'>google</a>";
        HTMLLinkExtractor hTMLLinkExtractor = new HTMLLinkExtractor();
        Vector<HtmlLink> htmlLinks = hTMLLinkExtractor.grabHTMLLinks(html);
        for (int i = 0; i < htmlLinks.size(); i++) {
            HtmlLink link = htmlLinks.get(i);
            System.out.println(link.getLink());
            System.out.println(link.getLinkText());
        }
    }
}
