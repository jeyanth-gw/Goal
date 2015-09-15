	/*@GET
	@Path("/upload") 
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response uploadFile(@FormDataParam("upload") InputStream is, 
	                    @FormDataParam("upload") FormDataContentDisposition formData) {
		System.out.println("Inside upload function");
		String fileLocation = "c:/temp/" + formData.getFileName();
		try {
			saveFile(is, fileLocation);
			String result = "Successfully File Uploaded on the path "+fileLocation;
			return Response.status(Status.OK).entity(result).build();
		} catch (IOException e) {
			e.printStackTrace();
			return Response.status(Status.INTERNAL_SERVER_ERROR).build();
			
		}
	}
	private void saveFile(InputStream is, String fileLocation) throws IOException {
	    	OutputStream os = new FileOutputStream(new File(fileLocation));
			byte[] buffer = new byte[256];
		    int bytes = 0;
		    while ((bytes = is.read(buffer)) != -1) {
		        os.write(buffer, 0, bytes);
		    }
  }*/

package test;

	import java.io.IOException;

	import sun.misc.BASE64Encoder;
	import sun.misc.BASE64Decoder;
	import java.io.ByteArrayInputStream;
	import java.io.ByteArrayOutputStream;
	import java.io.File;
	import java.awt.image.BufferedImage;
	import javax.imageio.ImageIO;
public class Test {
	
	    public static BufferedImage decodeToImage(String imageString) {

	        BufferedImage image = null;
	        byte[] imageByte;
	        try {
	            BASE64Decoder decoder = new BASE64Decoder();
	            imageByte = decoder.decodeBuffer(imageString);
	            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
	            image = ImageIO.read(bis);
	            bis.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return image;
	    }

	    /**
	     * Encode image to string
	     * @param image The image to encode
	     * @param type jpeg, bmp, ...
	     * @return encoded string
	     */
	    public static String encodeToString(BufferedImage image, String type) {
	        String imageString = null;
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();

	        try {
	            ImageIO.write(image, type, bos);
	            byte[] imageBytes = bos.toByteArray();

	            BASE64Encoder encoder = new BASE64Encoder();
	            imageString = encoder.encode(imageBytes);

	            bos.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return imageString;
	    }

	    public static void main (String args[]) throws IOException {
	        /* Test image to string and string to image start */
	        BufferedImage img = ImageIO.read(new File("files/img/TestImage.png"));
	        BufferedImage newImg;
	        String imgstr;
	        imgstr = encodeToString(img, "png");
	        System.out.println(imgstr);
	        newImg = decodeToImage(imgstr);
	        ImageIO.write(newImg, "png", new File("files/img/CopyOfTestImage.png"));
	        /* Test image to string and string to image finish */
	    }
	}


