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
	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField(); //cria o mostrador de tempo
	
	private JLabel descricaoHora2 = new JLabel("Email");
	private JTextField mostraTempo2 = new JTextField(); //cria o mostrador de tempo
	
	private JButton jButton = new JButton("Gerar Lote");
	private JButton jButton2 = new JButton("Stop");
	
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
	
	
	public TelaTimeThread() {  //executa o que estiver detnro no momento da abertura ou execução
		
		setTitle("Tela de Time com Threads");  //Define um título para a janela
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
		jPanel.add(mostraTempo, gridBagConstraints); //adiciona o mostrador para o layout
		
		
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
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
				if (fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
								
				for (int qtd = 0; qtd < 100; qtd++) {    //simula 100 envios em massa
				
				ObjetoFilaThread filaThread = new ObjetoFilaThread();
				filaThread.setNome(mostraTempo.getText());
				filaThread.setEmail(mostraTempo2.getText());
				
				fila.add(filaThread);
				
				}
			}
		});
		
		
		jButton2.addActionListener(new ActionListener() { 	//cria funcionalidade par ao botão stop.
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fila.stop();
				fila = null;				
				
			}
		});
		
		fila.start();
		
		add(jPanel, BorderLayout.WEST);  //para mostra o painel e ajusta o posicionamento a esquerda
		
		setVisible(true);  //torna a tela visível par ao usurário - false para invisível / sempre será o último comando a ser executado
		
	}
	
	

}
