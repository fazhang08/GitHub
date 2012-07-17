package commu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class SocketService extends JFrame 
{
	public static void main(String[] args)
	{
		SocketService ss = new SocketService();
		
	}
	
	private JTextField nameTxt = null;
	String id = "";

	public SocketService() {

		this.init();
	}

	public void init() {
		this.setTitle("Tcp服务器端");
		this.setBounds(100, 100, 400, 250);
		this.createUI();
		// this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void createUI() 
	{
		JPanel panel = new JPanel();
		// 添加边框
		Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		TitledBorder tBorder = BorderFactory.createTitledBorder(border, "校验面板",
				TitledBorder.CENTER, TitledBorder.TOP);
		panel.setBorder(tBorder);
		panel.setLayout(null);
		this.add(panel);
		
		// 网卡地址
		JLabel nameLbl = new JLabel("接收客户端数据：");
		nameLbl.setBounds(10, 30, 140, 25);
		panel.add(nameLbl);
		nameTxt = new JTextField();
		nameTxt.setBounds(130, 30, 230, 22);
		panel.add(nameTxt);

		// 按钮
		JButton btn = new JButton("开启TCP服务");
		btn.setBounds(40, 160, 140, 22);
		panel.add(btn);
 
		btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				nameTxt.setText("");
				new TCPThread().start();
			}
		});

		
		JButton btn2 = new JButton("开启UDP服务");
		btn2.setBounds(220, 160, 140, 22);
		panel.add(btn2);
		btn2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				nameTxt.setText("");
				new UDPThread().start();

			}
		});

	}

	// Tcp传输的操作过程
	class TCPThread extends Thread 
	{

		public void run() 
		{
			
			try {
				
				while (true) 
				{
					ServerSocket tcpSocket = null;
					tcpSocket = new ServerSocket(4567);
					Socket s = null;
					s = tcpSocket.accept();// 如果未收到数据，此句不会继续向下执行，一直处于监听状态
					InputStream in = s.getInputStream();
					byte[] buffer = new byte[1024 * 4];
					int temp = 0;
					while ((temp = in.read(buffer)) != -1) 
					{
						nameTxt.setText(new String(buffer, 0, temp));
					}
					s.close();
					tcpSocket.close();

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	// UDP传输的操作过程
	class UDPThread extends Thread 
	{

		public void run() 
		{
			try {
				DatagramSocket d = new DatagramSocket(5678);
				byte[] data = new byte[1024];
				DatagramPacket packer = new DatagramPacket(data, data.length);
				try {
					d.receive(packer);// 如果未收到数据，此句不会继续向下执行，一直处于监听状态
					System.out.println(packer.getLength());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
