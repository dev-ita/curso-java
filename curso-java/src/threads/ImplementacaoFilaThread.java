package threads;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilhaFila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilhaFila.add(objetoFilaThread);
	}

	@Override
	public void run() {

		System.out.println("thread fila rodando");

		try {
			while (true) {
				synchronized (pilhaFila) { // bloquear acesso a lista por outros processos
					Iterator<ObjetoFilaThread> iteracao = pilhaFila.iterator();
					while (iteracao.hasNext()) { // enquanto conter dados na lista
						ObjetoFilaThread processar = iteracao.next();
						// processar 10 mil notas fiscais por ex

						System.out.println("------------------------------------------------");
						System.out.println(processar.getNome());
						System.out.println(processar.getEmail());

						// terminou de processar remove tudo
						iteracao.remove();

						Thread.sleep(1000);
					}
				}
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}