
package models;
import java.io.Serializable;
/**
 *
 * @author 818736
 */
public class Note implements Serializable{
    String title;
    String content;

    public Note() {
        this.title ="";
        this.content="";
    }

    public Note(String title, String content){
        this.title = title;
        this.content = content;
    }    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
}
