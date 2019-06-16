import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// The Client
//Singleton ? 
public class LiveStockFarm {
	public static LiveStockFarm getLocation() {
		if (instance == null) {
			lock.lock();
			System.out.println("Acquired lock");
			try {
				if (instance == null)
					instance = new LiveStockFarm();
			} finally {
				lock.unlock();
				System.out.println("Released lock");
			}
		}
		return instance;
	}
	private static LiveStockFarm instance = null;
	private static final Lock lock = new ReentrantLock(); 
}
