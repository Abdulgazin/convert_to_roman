package Label;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String[] keywords;
    private Label label;
    public NegativeTextAnalyzer(){
        this.keywords=new String[3];
        this.keywords[0]=":(";
        this.keywords[1]="=(";
        this.keywords[2]=":|";
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
