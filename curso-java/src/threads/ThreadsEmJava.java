package threads;

import javax.swing.JOptionPane;

public class ThreadsEmJava {
	public static void main(String[] args) throws InterruptedException {
		// thread processamento em paralelo - envio de email
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		// thread processando em paralelo - envio de nota fiscal
		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();

		System.out.println("fim da thread.");
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}

	// criando uma instancia anônima de uma classe que implementa a interface
	// Runnable
	private static Runnable thread1 = new Runnable() {
		@Override
		public void run() {
			// código da rotina que eu quero executar em paralelo
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println("Executando alguma rotina - envio de e-mail");
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};

	private static Runnable thread2 = new Runnable() {
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println("Executando alguma rotina - envio de nota fiscal");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
}