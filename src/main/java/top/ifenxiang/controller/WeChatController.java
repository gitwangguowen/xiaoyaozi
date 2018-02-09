package top.ifenxiang.controller;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import top.ifenxiang.utils.MessageUtil;

@Controller
public class WeChatController {

	private static String token = "aaa";

	@RequestMapping("/WeChat/token")
	public void CheckoutToken(String signature, String timestamp, String nonce, String echostr, HttpServletResponse response) throws Exception {
		String checktext = null;
		if (null != signature) {
			// 对ToKen,timestamp,nonce 按字典排序
			String[] paramArr = new String[] { token, timestamp, nonce };
			Arrays.sort(paramArr);
			// 将排序后的结果拼成一个字符串
			String content = paramArr[0].concat(paramArr[1]).concat(paramArr[2]);

			try {
				MessageDigest md = MessageDigest.getInstance("SHA-1");
				// 对接后的字符串进行sha1加密
				byte[] digest = md.digest(content.toString().getBytes());
				checktext = byteToStr(digest);
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
		}
		// 将加密后的字符串与signature进行对比
		if (checktext != null ? checktext.equals(signature.toUpperCase()) : false ) {
			response.getWriter().print(echostr);
		}
	}

	private String byteToStr(byte[] byteArrays) {
		String str = "";
		for (int i = 0; i < byteArrays.length; i++) {
			str += byteToHexStr(byteArrays[i]);
		}
		return str;
	}

	private String byteToHexStr(byte myByte) {
		char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		char[] tampArr = new char[2];
		tampArr[0] = Digit[(myByte >>> 4) & 0X0F];
		tampArr[1] = Digit[myByte & 0X0F];
		String str = new String(tampArr);
		return str;
	}
	
	@RequestMapping("/WeChat/security")
	private void security(HttpServletRequest request,HttpServletResponse response) {
		try {
			Map<String, String> parseXml = MessageUtil.parseXml(request);
			System.out.println("--------------"+parseXml.get("Content"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
