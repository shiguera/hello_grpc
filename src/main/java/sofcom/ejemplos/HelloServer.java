package sofcom.ejemplos;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HelloServer {

	private Server server;

	public static void main(String[] args) throws IOException, InterruptedException {
		final HelloServer helloServer = new HelloServer();
		helloServer.start();
		helloServer.server.awaitTermination();
	}
	
	private void start() throws IOException {
		int port = 50051;
		ServerBuilder<?> serverBuilder = ServerBuilder.forPort(port).addService(new HelloImpl());
		server = serverBuilder.build();
		server.start();

		System.out.println("Servidor iniciado, escuchando en el puerto " + port);
		System.out.println("Para detener el servidor, una vez lanzado, CTRL+C en la consola");

		// Detiene el servidor si se pulsa CTRL+C
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.err.println("Apagando el servidor gRPC");
				try {
					server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
				} catch (InterruptedException e) {
					e.printStackTrace(System.err);
				}
			}
		});
	}

	static class HelloImpl extends ServicioSaludoGrpc.ServicioSaludoImplBase {
		@Override
		public void saludo(ClientInput req, StreamObserver<ServerOutput> responseObserver) {
			System.out.println("Recibida petición de cliente: " + req);
			ServerOutput reply = ServerOutput.newBuilder().setMessage("Hola, " + req.getName()).build();
			responseObserver.onNext(reply);
			responseObserver.onCompleted();
		}
	}
}