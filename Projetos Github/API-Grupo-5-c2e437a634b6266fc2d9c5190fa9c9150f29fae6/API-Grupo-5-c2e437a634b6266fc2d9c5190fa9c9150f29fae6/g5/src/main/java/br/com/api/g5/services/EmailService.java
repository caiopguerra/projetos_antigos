package br.com.api.g5.services;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import br.com.api.g5.domain.Produto;
import br.com.api.g5.dto.UsuarioDTO;
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
	
	public void confirmacaoCadastroProduto(String email, Produto produto) throws MessagingException {
		this.emailSender = javaMailSender();
		MimeMessage messageProduto = emailSender.createMimeMessage();
		MimeMessageHelper helperProduto = new MimeMessageHelper(messageProduto, true);
		try {
			helperProduto.setFrom("apigrupo5serratec@gmail.com");
			helperProduto.setTo(email);
			helperProduto.setSubject(email);
			StringBuilder sBuilder = new StringBuilder();
			sBuilder.append("<html>\r\n");
			sBuilder.append("   <head>\r\n");
			sBuilder.append("     <style>\r\n");
			sBuilder.append("       body {\r\n");
			sBuilder.append("         background-color: #FFFFFF;\r\n");
			sBuilder.append("         color: #FFFFFF;\r\n");
			sBuilder.append("         font-family: Arial, sans-serif;\r\n");
			sBuilder.append("       }\r\n");
			sBuilder.append("       h1 {\r\n");
			sBuilder.append("         color: #FFFFFF;\r\n");
			sBuilder.append("       }\r\n");
			sBuilder.append("       p {\r\n");
			sBuilder.append("         color: #FFFFFF;\r\n");
			sBuilder.append("       }\r\n");
			sBuilder.append("       .container {\r\n");
			sBuilder.append("         background-color: #7C1EB6;\r\n");
			sBuilder.append("         padding: 20px;\r\n");
			sBuilder.append("         text-align: center;\r\n");
			sBuilder.append("         margin: 0 auto;\r\n");
			sBuilder.append("         width: 80%;\r\n");
			sBuilder.append("         max-width: 1000px;\r\n");
			sBuilder.append("         border-radius: 10px;\r\n");
			sBuilder.append("         border: 3px solid #000000;\r\n");
			sBuilder.append("         box-shadow: 2px 2px 4px rgba(0, 0, 0, 0.3);\r\n");
			sBuilder.append("       }\r\n");
			sBuilder.append("       .logo {\r\n");
			sBuilder.append("         display: block;\r\n");
			sBuilder.append("         margin: 0 auto;\r\n");
			sBuilder.append("         width: 200px;\r\n");
			sBuilder.append("         box-shadow: 2px 2px 4px rgba(0, 0, 0, 0.3);\r\n");
			sBuilder.append("       }\r\n");
			sBuilder.append("       .thank-you {\r\n");
			sBuilder.append("         color: #FFFFFF;\r\n");
			sBuilder.append("         font-size: 20px;\r\n");
			sBuilder.append("         margin-top: 20px;\r\n");
			sBuilder.append("       }\r\n");
			sBuilder.append("     </style>\r\n");
			sBuilder.append("   </head>\r\n");
			sBuilder.append("   <body>\r\n");
			sBuilder.append("     <div class=\"container\">\r\n");
			sBuilder.append("       <img class=\"logo\" src=\"https://source.unsplash.com/featured/?business&h=200&w=600\" alt=\"Imagem de capivara\">\r\n");
			sBuilder.append("       <h1>Cadastro de Usuário</h1>\r\n");
			sBuilder.append("       <p>O produto " + produto.getNome() + " foi cadastrado com sucesso!</p>\r\n");
			sBuilder.append("       <p>A cAPI Inc. - Marketplace agradece a preferência!</p>\r\n");
			sBuilder.append("     </div>\r\n");
			sBuilder.append("   </body>\r\n");
			helperProduto.setText(sBuilder.toString(), true);
			emailSender.send(messageProduto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void confirmacaoCadastroUsuario(String email, UsuarioDTO usuarioDTO) throws MessagingException {
		this.emailSender = javaMailSender();
		MimeMessage messageUsuario = emailSender.createMimeMessage();
		MimeMessageHelper helperUsuario = new MimeMessageHelper(messageUsuario, true);
		try {
			helperUsuario.setFrom("apigrupo5serratec@gmail.com");
			helperUsuario.setTo(email);
			helperUsuario.setSubject(email);
			StringBuilder sBuilder = new StringBuilder();
			sBuilder.append("<html>\r\n");
			sBuilder.append("   <head>\r\n");
			sBuilder.append("     <style>\r\n");
			sBuilder.append("       body {\r\n");
			sBuilder.append("         background-color: #000000;\r\n");
			sBuilder.append("         color: #000000;\r\n");
			sBuilder.append("         font-family: Arial, sans-serif;\r\n");
			sBuilder.append("       }\r\n");
			sBuilder.append("       h1 {\r\n");
			sBuilder.append("         color: #000000;\r\n");
			sBuilder.append("       }\r\n");
			sBuilder.append("       p {\r\n");
			sBuilder.append("         color: #000000;\r\n");
			sBuilder.append("       }\r\n");
			sBuilder.append("       .container {\r\n");
			sBuilder.append("         background-color: #00CB14;\r\n");
			sBuilder.append("         padding: 20px;\r\n");
			sBuilder.append("         text-align: center;\r\n");
			sBuilder.append("         margin: 0 auto;\r\n");
			sBuilder.append("         width: 80%;\r\n");
			sBuilder.append("         max-width: 1000px;\r\n");
			sBuilder.append("         border-radius: 10px;\r\n");
			sBuilder.append("         border: 3px solid #000000;\r\n");
			sBuilder.append("         box-shadow: 2px 2px 4px rgba(0, 0, 0, 0.3);\r\n");
			sBuilder.append("       }\r\n");
			sBuilder.append("       .logo {\r\n");
			sBuilder.append("         display: block;\r\n");
			sBuilder.append("         margin: 0 auto;\r\n");
			sBuilder.append("         width: 200px;\r\n");
			sBuilder.append("         box-shadow: 2px 2px 4px rgba(0, 0, 0, 0.3);\r\n");
			sBuilder.append("       }\r\n");
			sBuilder.append("       .thank-you {\r\n");
			sBuilder.append("         color: #000000;\r\n");
			sBuilder.append("         font-size: 20px;\r\n");
			sBuilder.append("         margin-top: 20px;\r\n");
			sBuilder.append("       }\r\n");
			sBuilder.append("     </style>\r\n");
			sBuilder.append("   </head>\r\n");
			sBuilder.append("   <body>\r\n");
			sBuilder.append("     <div class=\"container\">\r\n");
			sBuilder.append("       <img class=\"logo\" src=\"https://source.unsplash.com/featured/?business&h=200&w=600\" alt=\"Imagem de capivara\">\r\n");
			sBuilder.append("       <h1>Cadastro de Usuário</h1>\r\n");
			sBuilder.append("       <p>O usuário " + usuarioDTO.getNome() + " foi cadastrado com sucesso!</p>\r\n");
			sBuilder.append("       <p>A cAPI Inc. - Marketplace agradece a preferência!</p>\r\n");
			sBuilder.append("     </div>\r\n");
			sBuilder.append("   </body>\r\n");
			sBuilder.append("</html>\r\n");
			helperUsuario.setText(sBuilder.toString(), true);
			emailSender.send(messageUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}