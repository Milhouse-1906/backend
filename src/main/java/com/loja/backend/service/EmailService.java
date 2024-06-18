package com.loja.backend.service;

import java.util.Map;

public class EmailService {

	public void enviarEmailTemplate(String destinatario, String titulo, Map<String, Object> propriedades) {
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		try {

			MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

			mimeMessageHelper.setSubject(titulo);
			mimeMessageHelper.setFrom(remetente);
			mimeMessageHelper.setTo(destinatario);

			mimeMessageHelper.setText(getConteudoTemplate(propriedades), true);

			javaMailSender.send(mimeMessageHelper.getMimeMessage());
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public String getConteudoTemplate(Map<String, Object> model) {
		StringBuffer content = new StringBuffer();

		try {
			content.append(FreeMarkerTemplateUtils
					.processTemplateIntoString(fmConfiguration.getTemplate("email-recuperacao-codigo.flth"), model));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return content.toString();
	}

}
