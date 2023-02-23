import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

public class Dispatcher implements CompletionHandler<AsynchronousSocketChannel, AsynchronousServerSocketChannel> {

	private int DATA_SIZE = 1024;
	
	@Override
	public void completed(AsynchronousSocketChannel channel, AsynchronousServerSocketChannel listener) {
		listener.accept(listener, this);
		
		ByteBuffer buffer = ByteBuffer.allocate(DATA_SIZE);
		channel.read(buffer, buffer, new EchoHandler(channel));
	}

	@Override
	public void failed(Throwable exc, AsynchronousServerSocketChannel attachment) {
		
	}


}
