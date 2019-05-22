/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  { Picture beach = new Picture("src/images/beach.jpg");
  beach.explore();
  beach.zeroBlue();
  beach.explore();
  }


  public static void testKeepOnlyRed() {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore();
	  beach.keepOnlyRed();
	  beach.explore();
  }
  public static void testKeepOnlyGreen() {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore();
	  beach.keepOnlyGreen();
	  beach.explore();
  }
  
  public static void testKeepOnlyBlue() {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  public static void testNegate() {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  
  public static void testGrayscale() {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  
  public static void testMirrorHorizontal() 
  {
	  Picture motorcycle = new Picture("src/images/redMotorcycle.jpg");
	  motorcycle.explore();
	  motorcycle.mirrorHorizontal();
	  motorcycle.explore();
  }
  
  public static void testMirrorDiagonal()
  {
    Picture caterpillar = new Picture("src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorDiagonal();
    caterpillar.explore();
  }
  
  public static void testFixUnderwater() {
	  Picture water = new Picture("src/images/water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("src/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms() {
	  Picture snowman = new Picture("src/images/snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  public static void testGull() {
	  Picture gulls = new Picture("src/images/seagull.jpg");
	  gulls.explore();
	  gulls.mirrorGull();
	  gulls.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("src/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testCopy()
  {
	  Picture canvas = new Picture("src/images/640x480.jpg");
	  canvas.myCollage();
	  canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("src/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2() {
	  Picture swan = new Picture("src/images/swan.jpg");
	  swan.explore();
	  swan.edgeDetection2(17);
	  swan.explore();
  }
  public static void testEncodeandDecode1()
  {
	  Picture beach = new Picture("src/images/beach.jpg");
	  Picture message = new Picture("src/images/msg.jpg");
	  beach.explore();
	  beach.encode(message);
	  beach.explore();
	  beach.decode().explore();
  }

  public static void testMirrorGull()
  {
    Picture seagull = new Picture(("src/images/seagull.jpg"));
    seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorHorizontal();
	  //testWater();
	  //testMirrorArms();
	  //testGull();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
   //testCollage();
	  //testSharpen(50,50,500,400); 
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    testEncodeandDecode1();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}