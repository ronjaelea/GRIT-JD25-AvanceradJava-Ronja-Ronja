import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.time.LocalDateTime;

/*
{
  "categories": [],
  "created_at": "2020-01-05 13:42:28.420821",
  "icon_url": "https://api.chucknorris.io/img/avatar/chuck-norris.png",
  "id": "XsZF_OwkSK2dXb7Cuzubmg",
  "updated_at": "2020-01-05 13:42:28.420821",
  "url": "https://api.chucknorris.io/jokes/XsZF_OwkSK2dXb7Cuzubmg",
  "value": "Mel Gibson pretended to be a Lethal Weapon. Chuck Norris is a Lethal Weapon."
}
 */
public class ChuckNorris {

    private String[] categories;
    private LocalDateTime createdAt;
    private String iconUrl;
    private String id;
    private LocalDateTime updatedAt;
    private String url;
    private String value;

    public ChuckNorris() {}

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    // 2020-01-05 13:42:28.420821
    @JsonGetter("created_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSSSSS")
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonSetter("created_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSSSSS")
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @JsonGetter("icon_url")
    public String getIconUrl() {
        return iconUrl;
    }

    @JsonSetter("icon_url")
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonGetter("updated_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSSSSS")
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    @JsonSetter("updated_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSSSSS")
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
