package br.com.api.concessionaria.services;


import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import br.com.api.concessionaria.domain.Veiculo;

import org.springframework.mail.javamail.MimeMessageHelper;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;


@Service
public class EmailService {
	private String Username = "apigrupo5serratec@gmail.com";
	private String Password = "qtnavqsazghxuekw";
	
	@Autowired
	JavaMailSender emailSender;
	
	@Bean
	private JavaMailSender javaMailSender() {
		JavaMailSenderImpl emailSender = new JavaMailSenderImpl();
		Properties properties = new Properties();
		emailSender.setHost("smtp.gmail.com");
		emailSender.setPort(587);
		emailSender.setUsername(Username);
		emailSender.setPassword(Password);
		properties.put("mail.smtp.auth", true);
		properties.put("mail.smtp.starttls.enable", true);
		emailSender.setJavaMailProperties(properties);
		return emailSender;
	}
	
	public void envioEmailCadastroVeiculo(String email, Veiculo veiculo) throws MessagingException {
		this.emailSender = javaMailSender();
		MimeMessage messageVeiculo = emailSender.createMimeMessage();
		MimeMessageHelper helperVeiculo = new MimeMessageHelper(messageVeiculo, true);
		try {
			helperVeiculo.setFrom("apigrupo5serratec@gmail.com");
			helperVeiculo.setTo(email);
			helperVeiculo.setSubject(email);
			StringBuilder sBuilder = new StringBuilder();
			sBuilder.append("<html>\r\n");
			sBuilder.append("   <head>\r\n");
			sBuilder.append("     <style>\r\n");
			sBuilder.append("       body {\r\n");
			sBuilder.append("         background-color: #8C52FF;\r\n");
			sBuilder.append("         color: #FFFFFF;\r\n");
			sBuilder.append("         font-family: Arial, sans-serif;\r\n");
			sBuilder.append("       }\r\n");
			sBuilder.append("       h1 {\r\n");
			sBuilder.append("         color: #1600028;\r\n");
			sBuilder.append("       }\r\n");
			sBuilder.append("       p {\r\n");
			sBuilder.append("         color: #FFFFFF;\r\n");
			sBuilder.append("       }\r\n");
			sBuilder.append("       .container {\r\n");
			sBuilder.append("         background-color: #FF0000;\r\n");
			sBuilder.append("         padding: 20px;\r\n");
			sBuilder.append("         text-align: center;\r\n");
			sBuilder.append("         margin: 0 auto;\r\n");
			sBuilder.append("         width: 80%;\r\n");
			sBuilder.append("         max-width: 800px;\r\n");
			sBuilder.append("       }\r\n");
			sBuilder.append("     </style>\r\n");
			sBuilder.append("   </head>\r\n");
			sBuilder.append("   <body>\r\n");
			sBuilder.append("     <div class=\"container\">\r\n");
			sBuilder.append("       <h1>Cadastro Concluído com sucesso</h1>\r\n");
			sBuilder.append("       <p>O veículo de modelo " + veiculo.getModelo() + " e marca " + veiculo.getMarca() + " foi inserido no banco.</p>\r\n");
			sBuilder.append("     </div>\r\n");
			sBuilder.append("   </body>\r\n");
			sBuilder.append("</html>\r\n");
			helperVeiculo.setText(sBuilder.toString(), true);
			emailSender.send(messageVeiculo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
