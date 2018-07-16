package composite;

import java.util.List;

/**
 * Abstract class that contains all base methods for containing tree like
 * structure of the html.
 */

public abstract class HtmlTag {

    public abstract String getTagName();

    public abstract void setStartTag(String tag);

    public abstract void setEndTag(String tag);

    public void setTagBody(String tagBody) {
        throw new UnsupportedOperationException("Not supported.");
    }

    public void addChildTag(HtmlTag htmlTag) {
        throw new UnsupportedOperationException("Not supported.");
    }

    public void removeChildTag(HtmlTag htmlTag) {
        throw new UnsupportedOperationException("Not supported.");
    }

    public List<HtmlTag> getChildren() {
        throw new UnsupportedOperationException("Not supported.");
    }

    public abstract void generateHtml();
}
