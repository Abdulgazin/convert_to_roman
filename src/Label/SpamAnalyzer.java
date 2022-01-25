package Label;

import java.util.Arrays;

public class SpamAnalyzer extends KeywordAnalyzer{
    private String[] keywords;
    private Label label;
    SpamAnalyzer (String[] keywords){
        this.keywords = keywords.clone();
    }
    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return label;
    }
}
