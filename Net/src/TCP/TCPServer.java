package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(9090);
			Socket s=ss.accept();
			System.out.println("�ɹ����ӣ�");
			InputStream ips=s.getInputStream();//������������
			OutputStream ops=s.getOutputStream();//�����������
			
			ops.write("���ѳɹ����ӷ�������".getBytes());
			
			BufferedReader br=new BufferedReader(new InputStreamReader(ips));
			System.out.println("recive : "+br.readLine());
			
			ips.close();
			ops.close();
			s.close();
			ss.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}