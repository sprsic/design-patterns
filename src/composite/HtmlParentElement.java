package composite;

import java.util.ArrayList;
import java.util.List;


/**
 * Class that represents first in hierarchy, doesn't have body only children.
 */
public class HtmlParentElement extends HtmlTag {
    private String tagName;
    private String startTag;
    private String endTag;
    private List<HtmlTag> childrenTag;

    public HtmlParentElement(String tagName) {
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
        this.childrenTag = new ArrayList<>();
    }

    @Override
    public String getTagName() {
        return this.tagName;
    }

    @Override
    public void setStartTag(String startTag) {
        this.startTag = startTag;
    }

    @Override
    public void setEndTag(String endTag) {
        this.endTag = endTag;
    }

    @Override
    public void removeChildTag(HtmlTag htmlTag) {
        this.childrenTag.remove(htmlTag);
    }

    @Override
    public List<HtmlTag> getChildren() {
        return this.childrenTag;
    }

    @Override
    public void addChildTag(HtmlTag htmlTag) {
        this.childrenTag.add(htmlTag);
    }

    /**
     * Print start tag, list of all children and end tag.
     */
    @Override
    public void generateHtml() {
        System.out.println(this.startTag);
        this.childrenTag.forEach(HtmlTag::generateHtml);
        System.out.println(this.endTag);
    }
}
