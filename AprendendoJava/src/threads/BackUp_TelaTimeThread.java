/*
package threads;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog{  //.swing. Swing é um framwork para criar aplicações java desktop
	
	
	private JPanel jPanel = new JPanel(new GridBagLayout());  //JPanel(layoutManager) para criar um painel de componentes
	private JLabel descricaoHora = new JLabel("Data/Hora Thread 1");
	private JTextField mostraTempo = new JTextField(); //cria o mostrador de tempo
	
	private JLabel descricaoHora2 = new JLabel("Data/Hora Thread 2");
	private JTextField mostraTempo2 = new JTextField(); //cria o mostrador de tempo
	
	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");
	
	private Runnable thread1 = new Runnable() {  // Interface de execução com o run. Cria um runnable para thread1
		
		@Override
		public void run() {  //aqui é o método que faz correr o relógio na tela
			
			while(true) {
				mostraTempo.setText(new SimpleDateFormat("'Dia: 'dd/MM/yyyy 'às: 'hh'h'mm'm'ss").format(Calendar.getInstance().getTime())); //chama o formato desejado com o text. formata com o format par ao formato específico
				try {
					Thread.sleep(1000);   //controla o tempo de run em 1 segundo.
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
				
		}
	};
	
	
	private Runnable thread2 = new Runnable() {  // Interface de execução com o run. Cria um runnable para thread1
		
		@Override
		public void run() {
			
			while(true) {
				mostraTempo2.setText(new SimpleDateFormat("dd.MM.yyyy '-' hh:mm:ss").format(Calendar.getInstance().getTime())); //chama o formato desejado com o text. formata com o format par ao formato específico
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
				
		}
	};
	
	
	
	
	private Thread thread1Time; //instancia o objeto thread1Time par ao botão start
	private Thread thread2Time; 
	
	
	
	public TelaTimeThread() {  //executa o que estiver detnro no momento da abertura ou execução
		
		setTitle("Data/hora com Threads");  //Define um título para a janela
		setSize(new Dimension(240, 240));  //configura um tamanho para a janela
		setLocationRelativeTo(null);  //centraliza com base em algum compontente, como não tem, coloca null
		setResizable(false); // bloqueia a alteração de tamanho da tela pelo usuário
		
		
		//controlador de layout
		GridBagConstraints gridBagConstraints = new GridBagConstraints(); //gerencia a posição do campos na janela
		gridBagConstraints.gridx = 0;   //determina a posição na linha | funciona como uma tabela ou array
		gridBagConstraints.gridy = 0;  //determina a posição na coluna
		gridBagConstraints.gridwidth = 2; //determina o tamanho dos espaços que serão ocupados na linha
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST; //alinha a janela à esquerda
		
		
		descricaoHora.setPreferredSize( new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);   //adiciona os componentes ao painel
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));  //define um tamanho para o mostrador de tempo
		gridBagConstraints.gridy ++;  //incrementa o y para mudar a posição no layout
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, gridBagConstraints); //adiciona o mostrador para o layout
		
		
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		mostraTempo2.setEditable(false);
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		
		gridBagConstraints.gridwidth = 1; //determina que o tamanho ocupado é de 1 espaço
		
		
		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(jButton, gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx ++;
		jPanel.add(jButton2, gridBagConstraints);
		
		
		
		jButton.addActionListener(new ActionListener() {   //cria a funcionalidade do botão start
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				thread1Time = new Thread(thread1);    //cria o objeto thread1Time recebendo thread1, que tem o run
				thread1Time.start();  //executa o botão start.
				
				thread2Time = new Thread(thread2);
				thread2Time.start();
				
				jButton.setEnabled(false); //Desabilita o start ao clicar nele e iniciar na a contagem na tela
				jButton2.setEnabled(true); //habilita o Stop ao clicar em start
			
			}
		});
		
		
		jButton2.addActionListener(new ActionListener() { 	//cria funcionalidade par ao botão stop.
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				thread1Time.stop(); //executa o botão stop
				
				thread2Time.stop();
				
				jButton.setEnabled(true); //reabilita o start ao clicar em stop
				jButton2.setEnabled(false); 
			}
		});
		
		jButton2.setEnabled(false); //desativa o botão de stop ante de apertar o start
		
		add(jPanel, BorderLayout.WEST);  //para mostra o painel e ajusta o posicionamento a esquerda
		
		setVisible(true);  //torna a tela visível par ao usurário - false para invisível / sempre será o último comando a ser executado
		
	}
	
	

}

*/