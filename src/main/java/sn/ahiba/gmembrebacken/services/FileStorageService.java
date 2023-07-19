package sn.ahiba.gmembrebacken.services;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import sn.ahiba.gmembrebacken.entities.UploadFileResponse;

import javax.servlet.http.HttpServletRequest;

public interface FileStorageService {
    public String storeFile(MultipartFile file);

    public Resource loadFileAsResource(String fileName);

    public UploadFileResponse uploadFile(MultipartFile file);

    public ResponseEntity<Resource> downloadFile(String fileName, HttpServletRequest request);
}
