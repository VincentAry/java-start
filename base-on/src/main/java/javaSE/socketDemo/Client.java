package _3.javaSE.socketDemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP通信的客户端
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		/*
		 * 通信过程:
		 * 1:创建用来发送数据的Socket
		 * 2:准备要发送的数据
		 * 3:打包
		 *   将数据放入包中
		 *   填写目的地地址
		 * 4:通过Socket将数据包发送出去  
		 */
		try {
			//1 
			DatagramSocket socket = new DatagramSocket();
			
			//2
			String message = "你好服务端!";
			byte[] data = message.getBytes("UTF-8");
			
			//3
			InetAddress address = InetAddress.getByName("localhost");
			int port = 8088;
			/*
			 * 打包
			 */
			DatagramPacket packet = new DatagramPacket(
					data,//要发送的数据
					data.length,//将数组中多少字节发出
					address,//远端地址
					port//远端的端口
				);
			
			//4
			socket.send(packet);
			
			/*
			 * 接收服务端发送回来的响应
			 */
			data = new byte[100];
			packet = new DatagramPacket(
					data,
					data.length
				);

			socket.receive(packet);
			
			/*
			 * 从包中取数据
			 * 由于数据存入了我们创建的字节数组中
			 * 所以可以直接从data数据中得到。
			 */
			message = new String(data,0,
					//通过包获取实际接收到的字节量
					packet.getLength(),
					"UTF-8"
				);
			System.out.println("服务端说:"+message);

			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}







