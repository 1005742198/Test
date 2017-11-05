package com.obob.miniprogram.controller;

import java.io.FileInputStream;
import java.io.OutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.obob.miniprogram.domain.vo.GlobalFileVo;
import com.obob.miniprogram.po.GlobalFilePo;
import com.obob.miniprogram.service.GlobalFileService;
import com.obob.miniprogram.service.SysParamService;
import com.obob.miniprogram.util.BeanConvertors;

@Controller
@RequestMapping("file")
public class GlobalFileController extends BaseController {
	
	@Autowired
	private GlobalFileService globalFileService;
	@Autowired
	private SysParamService sysParamService;
	
	@RequestMapping(value = "getbyid", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String getById(Integer id) {
		GlobalFilePo globalFilePo = globalFileService.getById(id);
		GlobalFileVo vo = new GlobalFileVo();
		BeanConvertors.copyProperties(globalFilePo, vo, null);
		return response(vo);
	}
	
	/**
	 * 
	 * @return String
	 * @author obob
	 * 2017年11月4日 下午7:58:43
	 */
	@RequestMapping(value = "viewbyguid", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public void viewByGuid(String guid) {
		GlobalFilePo globalFilePo = globalFileService.selectByGuid(guid);
		sysParamService.getById(id);
		FileInputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			String fileBasePath = sysParamService.getBasicAssetFileBase();
			BasicAssetFileVo basicAssetFileVo = basicAssetRegisterService.getFile(fileId);
			File file = new File(fileBasePath + basicAssetFileVo.getFilePath());
			inputStream = new FileInputStream(file);
			byte[] data = new byte[(int)file.length()];
			inputStream.read(data);
			HttpServletResponse response = response();
			response.setCharacterEncoding("utf-8");
			String[] filePaths=basicAssetFileVo.getFilePath().split("\\.");
			String fileType=filePaths[filePaths.length-1].toLowerCase();
			String contentType = "application/pdf";
			if ("gif".equals(fileType)) {
				contentType = "image/gif";
			} else if ("jpeg".equals(fileType)||"jpg".equals(fileType)) {
				contentType = "image/jpeg";
			} else if ("png".equals(fileType)) {
				contentType = "image/png";
			} else if ("mpeg".equals(fileType)) {
				contentType = "image/mpeg";
			} else if ("pdf".equals(fileType)) {
				contentType = "application/pdf";
			}
			response.setContentType("image/jped");
	        response.setContentType(contentType);
	        outputStream = response.getOutputStream();
	        outputStream.write(data);
	        outputStream.flush();
		} catch (Exception e) {
		}finally{
			closeStream(inputStream, outputStream);
		}
		
	}
	private void closeStream(FileInputStream inputStream,OutputStream outputStream){
		try {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		} catch (IOException e) {
			Xlogger.error(XMsgError.buildSimple(getClass().getName(),
					"closeStream", e));
		}
	}
}
