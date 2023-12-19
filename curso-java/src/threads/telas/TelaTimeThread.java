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

public class TelaTimeThread extends JDialog {

	private static final long serialVersionUID = 1L;

	private JPanel jPanel = new JPanel(new GridBagLayout()); // painel de componente

	private JLabel descricaoHora = new JLabel("Time da Thread 1");
	private JTextField mostraTempo = new JTextField();

	private JLabel descricaoHora2 = new JLabel("Time da Thread 2");
	private JTextField mostraTempo2 = new JTextField();

	private JButton startButton = new JButton("Start");
	private JButton stopButton = new JButton("Stop");

	private Runnable thread1 = new Runnable() {
		@Override
		public void run() {
			try {
				while (true) {
					mostraTempo.setText(
							new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				System.out.println("Thread interrompida.");
				e.printStackTrace();
			}
		};
	};

	private Runnable thread2 = new Runnable() {
		@Override
		public void run() {
			try {
				while (true) {
					mostraTempo2.setText(
							new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				System.out.println("Thread interrompida.");
				e.printStackTrace();
			}
		};
	};

	private Thread threadTime1;
	private Thread threadTime2;

	public TelaTimeThread() {
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

		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);

		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, gridBagConstraints);

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBagConstraints);

		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo2.setEditable(false);
		jPanel.add(mostraTempo2, gridBagConstraints);

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
				threadTime1 = new Thread(thread1);
				threadTime1.start();

				threadTime2 = new Thread(thread2);
				threadTime2.start();

				stopButton.setEnabled(true);
				startButton.setEnabled(false);
			}
		});
		
		stopButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if ((threadTime1 != null && threadTime2 != null)) {
					threadTime1.interrupt();
					threadTime2.interrupt();

					stopButton.setEnabled(false);
					startButton.setEnabled(true);
				}
			}
		});

		stopButton.setEnabled(false);

		add(jPanel, BorderLayout.WEST);

		// Torna a tela visivel para o usuário
		setVisible(true);
	}
}