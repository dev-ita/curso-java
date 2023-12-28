package datas;

import java.time.Duration;
import java.time.Instant;

public class TemposInstant {
	public static void main(String[] args) throws InterruptedException {
		Instant inicio = Instant.now();

		Thread.sleep(2000);

		Instant ifinal = Instant.now();

		Duration duracao = Duration.between(inicio, ifinal);

		System.out.println("Duração em nano segundos: " + duracao.toNanos());
		System.out.println("Duração em minutos: " + duracao.toMinutes());
		System.out.println("Duração em segundos: " + duracao.toSeconds());
	}
}