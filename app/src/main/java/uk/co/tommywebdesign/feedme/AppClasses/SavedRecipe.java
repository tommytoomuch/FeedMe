package uk.co.tommywebdesign.feedme.AppClasses;

/**
 * Created by tommy on 16/10/16.
 */

public class SavedRecipe {


    public SavedRecipe(String aTag, String aName, String aUrl, int aId){
        this.id=aId;
        this.tag=aTag;
        this.name = aName;
        this.url=aUrl;
    }


    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String tag;
    private String name;
    private int id;
    private String url;









}
