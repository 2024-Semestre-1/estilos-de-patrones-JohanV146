/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fachada;

//Actúa como la fachada simplificando la conversión de archivos de video.
class VideoConverter {
    public File convert(String filename, String format) {
        VideoFile file = new VideoFile(filename);
        CodecFactory codecFactory = new CodecFactory();
        Object sourceCodec = codecFactory.extract(file);
        Object destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        byte[] buffer = BitrateReader.read(filename, sourceCodec);
        byte[] result = BitrateReader.convert(buffer, destinationCodec);
        result = new AudioMixer().fix(result);
        return new File(result);
    }
}
