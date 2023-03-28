import java.awt.image.*;

public abstract class Actor{
    private int locRows;
    private int locCols;

    private BufferedImage image;
    private BufferedImage labelImage;

    private boolean isHidden;
    private boolean isEnemy;

    public Actor(int rows, int cols){
        locRows = rows;
        locCols = cols;
        isHidden = false;
    }

    
    /** 
     * @return int
     */
    public int getRow(){
        return locRows;
    }

    
    /** 
     * @return int
     */
    public int getCol(){
        return locCols;
    }

    
    /** 
     * @return boolean
     */
    public boolean isHidden(){
        return isHidden;
    }

    
    /** 
     * @return boolean
     */
    public boolean switchHiddenState(){
        isHidden = !isHidden;
        return isHidden;
    }

    
    /** 
     * @return boolean
     */
    public boolean isEnemy(){
        return isEnemy;
    }

    public void setEnemy(){
        isEnemy = true;
    }

    
    /** 
     * @param image
     */
    public void setImage(BufferedImage image){
        this.image = image;
    }

    
    /** 
     * @return BufferedImage
     */
    public BufferedImage getImage(){
        return image;
    }

    
    /** 
     * @param image
     */
    public void setLabelImage(BufferedImage image){
        labelImage = image;
    }

    
    /** 
     * @return BufferedImage
     */
    public BufferedImage getLabelImage(){
        return labelImage;
    }
    
    
    /** 
     * @param row
     */
    public void setRow(int row){
        locRows = row;
    }
    
    
    /** 
     * @param col
     */
    public void setCol(int col){
        locCols = col;
    }
    
    
    /** 
     * @return String
     */
    public String toString(){
        return "Row " + locRows + " Col " + locCols + " isEnemy " + isEnemy;
    }
}
