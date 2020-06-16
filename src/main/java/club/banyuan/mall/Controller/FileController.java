package club.banyuan.mall.Controller;

import club.banyuan.mall.common.api.CommonResult;
import cn.hutool.crypto.digest.DigestUtil;
import io.minio.MinioClient;
import io.minio.errors.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.xmlpull.v1.XmlPullParserException;

import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @author WM
 * @date 2020/6/15 9:55 上午
 * 描述信息：
 */
@RestController
@RequestMapping(value = "/file")
public class FileController {

    private final static String ENDPOINT = "http://localhost:9001/";
    private final static String ACCESS_KEY = "minio";
    private final static String SECRET_KEY = "12345678";
    private final static String BUCKET_NAME = "banyuan";

    public CommonResult upload(@RequestParam("file") MultipartFile file) throws IOException, InvalidPortException, InvalidEndpointException, InvalidKeyException, NoSuchAlgorithmException, InsufficientDataException, InvalidArgumentException, InternalException, NoResponseException, InvalidBucketNameException, XmlPullParserException, ErrorResponseException {

        if (file.isEmpty()) {
            return CommonResult.success("文件不存在!请重新上传!");
        }

//        // 保存到本地最简单的例子
//        String filePath = "/Users/tony/banyuan/upload_files/" + file.getOriginalFilename();
//        File tmpFile = new File(filePath);
//        file.transferTo(tmpFile);

        // 生成一个新的文件名
        String hashCode = DigestUtil.md5Hex(file.getBytes());
        String fileName = hashCode+"_"+ file.getOriginalFilename();

        // 将本地文件上传到云存储(或重命名临时文件，并判断文件是否已存在)
        MinioClient minioClient = new MinioClient(ENDPOINT, ACCESS_KEY, SECRET_KEY); // 创建一个MinIO的Java客户端
        minioClient.putObject(BUCKET_NAME, fileName, file.getInputStream(), file.getContentType());
        return CommonResult.success(ENDPOINT + BUCKET_NAME + "/" + fileName);

        // 删除临时文件
        //  FileUtil.del(tmpFile);

    }
}
