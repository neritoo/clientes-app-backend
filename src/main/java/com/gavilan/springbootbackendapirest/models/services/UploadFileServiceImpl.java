package com.gavilan.springbootbackendapirest.models.services;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UploadFileServiceImpl implements IUploadFileService {

    private final Logger log = LoggerFactory.getLogger(UploadFileServiceImpl.class);
    private final static String DIRECTORIO_UPLOAD = "uploads";

    @Override
    public Resource cargar(String nombreFoto) throws MalformedURLException {
        Path rutaFoto = this.getPath(nombreFoto);

        log.info(rutaFoto.toString());

        Resource recurso = recurso = new UrlResource(rutaFoto.toUri());

        if (!recurso.exists() && !recurso.isReadable()){
            rutaFoto = Paths.get("src/main/resources/static/images").resolve("not_user.png").toAbsolutePath();
            recurso = new UrlResource(rutaFoto.toUri());

            log.error("Error: no se pudo cargar la imagen: " + nombreFoto);
        }

        return recurso;
    }

    @Override
    public String copiar(MultipartFile archivo) throws IOException {
        String nombreArchivo = UUID.randomUUID().toString()+ "_" + archivo.getOriginalFilename().replace(" ", "");

        Path rutaArchivo = this.getPath(nombreArchivo);
        log.info(rutaArchivo.toString());

        Files.copy(archivo.getInputStream(), rutaArchivo);

        return nombreArchivo;
    }

    @Override
    public boolean eliminar(String nombreFoto) {
        if (nombreFoto != null && nombreFoto.length()>0){
            Path rutaFotoAnterior = this.getPath(nombreFoto);
            File archivoFotoAnterior = rutaFotoAnterior.toFile();
            if (archivoFotoAnterior.exists() && archivoFotoAnterior.canRead()){
                return archivoFotoAnterior.delete();
            }
        }
        return false;
    }

    @Override
    public Path getPath(String nombreFoto) {
        return Paths.get(DIRECTORIO_UPLOAD).resolve(nombreFoto).toAbsolutePath();
    }
}
