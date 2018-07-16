package composite;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement extends HtmlTag {


    private String tagName;
    private String startTag;
    private String endTag;
    private String tagBody;
    private List<HtmlTag> childElements;

    public HtmlElement(String tagName) {
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
        this.tagBody = "";
        this.childElements = new ArrayList<>();
    }


    @Override
    public String getTagName() {
        return this.tagName;
    }

    @Override
    public void setStartTag(String tag) {
        this.tagName = tag;
    }

    @Override
    public void setEndTag(String tag) {
        this.endTag = tag;
    }

    @Override
    public void addChildTag(HtmlTag htmlTag) {
        this.childElements.add(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTag htmlTag) {
        this.childElements.remove(htmlTag);
    }

    @Override
    public List<HtmlTag> getChildren() {
        return this.childElements;
    }

    @Override
    public void setTagBody(String tagBody) {
        this.tagBody = tagBody;
    }

    @Override
    public void generateHtml() {
        System.out.println(startTag + "" + tagBody + "" + endTag);
    }
}
