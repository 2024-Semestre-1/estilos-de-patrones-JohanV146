/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fachada;

//Se encarga de extraer el codec adecuado basado en el tipo de archivo
class CodecFactory {
    public Object extract(VideoFile file) {
        String type = file.getFilename().substring(file.getFilename().lastIndexOf('.') + 1);
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting MPEG4 codec...");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodecFactory: extracting Ogg codec...");
            return new OggCompressionCodec();
        }
    }
}

