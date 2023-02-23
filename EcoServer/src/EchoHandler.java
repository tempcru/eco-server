import java.nio.ByteBuffer;
import java.nio.channels.CompletionHandler;

public class EchoHandler implements CompletionHandler <Integer, ByteBuffer> {

	@Override
	public void completed(Integer result, ByteBuffer attachment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void failed(Throwable exc, ByteBuffer attachment) {
		// TODO Auto-generated method stub
		
	}
}
