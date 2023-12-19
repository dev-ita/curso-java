package threads.telas;

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

import threads.ImplementacaoFilaThread;
import threads.ObjetoFilaThread;

public class TelaProcessoFilaPilha extends JDialog {
	private static final long serialVersionUID = 1L;

	private JPanel jPanel = new JPanel(new GridBagLayout()); // painel de componente

	private JLabel labelNome = new JLabel("Nome");
	private JTextField textNome = new JTextField();

	private JLabel labelEmail = new JLabel("E-mail");
	private JTextField textEmail = new JTextField();

	private JButton startButton = new JButton("Add lista");
	private JButton stopButton = new JButton("Stop");
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

	public TelaProcessoFilaPilha() {
		setTitle("Time Threads");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);

		GridBagConstraints gridBagConstraints = new GridBagConstraints(); // controlador de posicionamento de
																			// componentes
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;

		labelEmail.setPreferredSize(new Dimension(200, 25));
		jPanel.add(labelEmail, gridBagConstraints);

		textEmail.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(textEmail, gridBagConstraints);

		labelNome.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(labelNome, gridBagConstraints);

		textNome.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(textNome, gridBagConstraints);

		gridBagConstraints.gridwidth = 1;

		startButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(startButton, gridBagConstraints);

		stopButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(stopButton, gridBagConstraints);

		startButton.addActionListener(new ActionListener() { // executa o clique
			@Override
			public void actionPerformed(ActionEvent e) {
				ObjetoFilaThread filaThread = new ObjetoFilaThread();
				filaThread.setNome(textNome.getText());
				filaThread.setEmail(textEmail.getText());
				
				fila.add(filaThread);
			}
		});

		stopButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		fila.start();
		
		add(jPanel, BorderLayout.WEST);

		// Torna a tela visivel para o usuário
		setVisible(true);
	}

}