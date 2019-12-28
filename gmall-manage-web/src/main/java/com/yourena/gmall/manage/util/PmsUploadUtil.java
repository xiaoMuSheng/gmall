package com.yourena.gmall.manage.util;

import com.yourena.gmall.GlobalConstant;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.springframework.web.multipart.MultipartFile;

public class PmsUploadUtil {
    static String originalFilename = "";
    private static StringBuilder url = new StringBuilder(GlobalConstant.Public.FDFS_ADDRESS + "/");
    static String tracker = "";

    public static String uploadImage(MultipartFile multipartFile, String resourcePath) {
        tracker = PmsUploadUtil.class.getResource(resourcePath).getPath();
        try {
            ClientGlobal.init(tracker);
        } catch (Exception e) {
            e.printStackTrace();
        }
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = null;
        try {
            trackerServer = trackerClient.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        StorageClient storageClient = new StorageClient(trackerServer, null);
        try {
            byte[] bytes = multipartFile.getBytes();
            originalFilename = multipartFile.getOriginalFilename();
            int index = originalFilename.lastIndexOf(".") + 1;
            String[] uploadFile = storageClient.upload_file(multipartFile.getName(), originalFilename.substring(index), null);

            //拼接url
            url.append(uploadFile[0]);
            url.append("/");
            url.append(uploadFile[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("PmsUploadUtil：" + url);
        return url.toString();
    }

}
