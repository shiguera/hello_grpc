package sofcom.ejemplos;

import java.util.concurrent.TimeUnit;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class HelloClient {

	private final ServicioSaludoGrpc.ServicioSaludoBlockingStub blockingStub;

	public HelloClient(Channel channel) {
		blockingStub = ServicioSaludoGrpc.newBlockingStub(channel);
	}

	public void makeSaludo(String username) {
		ClientInput request = ClientInput.newBuilder().setName(username).build();
		System.out.println("Enviando al servidor: " + request);
		ServerOutput response;
		try {
			response = blockingStub.saludo(request);
		} catch (StatusRuntimeException e) {
			System.err.println("Fallo en RPC: " + e.getStatus());
			return;
		}
		System.out.println("Se ha recibido la siguiente respuesta del servidor: " + response.getMessage());
	}

	public static void main(String[] args) throws Exception {
		String username = args[0];
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
		try {
			HelloClient client = new HelloClient(channel);
			client.makeSaludo(username);
		} finally {
			channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
		}
	}
}