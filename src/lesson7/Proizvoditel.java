package lesson7;

public class Proizvoditel {
    private String name;
    private String description;
    private String pathToImage;

    public String getDescription(String description) {
        return description;
    }




    public Proizvoditel() {
    }

    public Proizvoditel(String name ) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setDescription(String description) {
        this.description = description;
    }

    public String getPathToImage() {
        return pathToImage;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }


}
